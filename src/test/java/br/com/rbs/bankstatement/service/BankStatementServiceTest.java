package br.com.rbs.bankstatement.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

@RunWith(SpringRunner.class)
@WebMvcTest(BankStatementService.class)
public class BankStatementServiceTest {

    @MockBean
    private BankStatementService bankStatementServiceMocked;

    @Test
    public void getBankStatement() throws IOException {
       //TODO:Implementar Test
    }

    @Test
    public void listBankStatement() throws IOException {
        //TODO:Implementar Test
    }
}