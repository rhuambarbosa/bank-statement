package br.com.rbs.bankstatement.controller;

import br.com.rbs.bankstatement.domain.BankStatement;
import br.com.rbs.bankstatement.service.BankStatementService;
import com.google.gson.Gson;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.io.IOException;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(BankStatementController.class)
public class BankStatementControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private BankStatementService bankStatementServiceMocked;

    @Test
    public void listBankStatementHttpStatusOK() throws Exception {
        // this is the expected JSON answer
        final BankStatement bankStatement = new BankStatement();

        String json = new Gson().toJson(bankStatement);

        // we set the result of the mocked service
        given(bankStatementServiceMocked.getBankStatement()).willReturn(bankStatement);

        this.mockMvc.perform(MockMvcRequestBuilders.get("/bank-statement/")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().json(json));
    }

    @Test
    public void listBankStatementHttpStatusNO_CONTENT() throws Exception {
        // this is the expected JSON answer
        final BankStatement bankStatement = null;

        // we set the result of the mocked service
        given(bankStatementServiceMocked.getBankStatement()).willReturn(bankStatement);

        this.mockMvc.perform(MockMvcRequestBuilders.get("/bank-statement/")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(content().string("Nenhum resultado disponivel"))
                .andExpect(status().isNoContent());
    }

    @Test
    public void listBankStatementHttpStatusINTERNAL_SERVER_ERROR() throws Exception {
        // we set the result of the mocked service
        when(bankStatementServiceMocked.getBankStatement()).thenThrow(IOException.class);

        this.mockMvc.perform(MockMvcRequestBuilders.get("/bank-statement/")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(content().string("Falha interna"))
                .andExpect(status().isInternalServerError());
    }
}