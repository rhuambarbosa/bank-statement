package br.com.rbs.bankstatement.dto;

import br.com.rbs.bankstatement.domain.ControleLancamento;
import br.com.rbs.bankstatement.domain.DomicilioBancario;
import br.com.rbs.bankstatement.domain.LancamentoContaCorrenteCliente;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

public class BankStatementDTOTest {

    @Test
    public void getValorFinal() {
        final LancamentoContaCorrenteCliente lcc = new LancamentoContaCorrenteCliente();
        lcc.setNomeTipoOperacao("");
        lcc.setNumeroRemessaBanco(10L);
        lcc.setNomeSituacaoRemessa("");
        lcc.setDadosDomicilioBancario(new DomicilioBancario());

        final ControleLancamento controleLancamento = new ControleLancamento();
        controleLancamento.setDataEfetivaLancamento(LocalDate.now());
        controleLancamento.setLancamentoContaCorrenteCliente(lcc);
        controleLancamento.setValorLancamentoRemessa(new BigDecimal(10));

        final BankStatementDTO bankStatementDTO = new BankStatementDTO(controleLancamento);

        final String expected = "R$ 10,00";
        final String actual = bankStatementDTO.getValorFinal();
        Assert.assertEquals("Transformação errada em moeda", expected, actual);
    }
}