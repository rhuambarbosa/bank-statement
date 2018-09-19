package br.com.rbs.bankstatement.controller;

import br.com.rbs.bankstatement.domain.ControleLancamento;
import br.com.rbs.bankstatement.domain.DomicilioBancario;
import br.com.rbs.bankstatement.domain.LancamentoContaCorrenteCliente;
import br.com.rbs.bankstatement.dto.BankStatementDTO;
import br.com.rbs.bankstatement.service.BankStatementService;
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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

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
        final List<BankStatementDTO> listBankStatement = new ArrayList();

        final ControleLancamento controleLancamento = new ControleLancamento();
        final DomicilioBancario domicilioBancario = new DomicilioBancario();
        final LancamentoContaCorrenteCliente lancamentoContaCorrenteCliente = new LancamentoContaCorrenteCliente();
        controleLancamento.setValorLancamentoRemessa(new BigDecimal(10));
        lancamentoContaCorrenteCliente.setDadosDomicilioBancario(domicilioBancario);
        controleLancamento.setLancamentoContaCorrenteCliente(lancamentoContaCorrenteCliente);

        listBankStatement.add(new BankStatementDTO(controleLancamento));

        // we set the result of the mocked service
        given(bankStatementServiceMocked.listBankStatement()).willReturn(listBankStatement);

        this.mockMvc.perform(MockMvcRequestBuilders.get("/bank-statement/")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }

    @Test
    public void listBankStatementHttpStatusNO_CONTENT() throws Exception {
        // this is the expected JSON answer
        final List<BankStatementDTO> listBankStatement = new ArrayList<>();

        // we set the result of the mocked service
        given(bankStatementServiceMocked.listBankStatement()).willReturn(listBankStatement);

        this.mockMvc.perform(MockMvcRequestBuilders.get("/bank-statement/")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(content().string("Nenhum resultado disponivel"))
                .andExpect(status().isNoContent());
    }

    @Test
    public void listBankStatementHttpStatusINTERNAL_SERVER_ERROR() throws Exception {
        // we set the result of the mocked service
        when(bankStatementServiceMocked.listBankStatement()).thenThrow(IOException.class);

        this.mockMvc.perform(MockMvcRequestBuilders.get("/bank-statement/")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(content().string("Falha interna"))
                .andExpect(status().isInternalServerError());
    }
}