package br.com.rbs.bankstatement.dto;

import br.com.rbs.bankstatement.domain.ControleLancamento;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.Locale;

public class BankStatementDTO {

    private final LocalDate dataLancamento;
    private final String descricao;
    private final Long numero;
    private final String situacao;
    private final LocalDate dataConfirmacao;
    private final String dadosBancarios;
    private final BigDecimal valorFinal;

    public BankStatementDTO(final ControleLancamento controleLancamento) {
        this.dataLancamento = controleLancamento.getDataLancamentoContaCorrenteCliente();
        this.descricao = controleLancamento.getLancamentoContaCorrenteCliente().getNomeTipoOperacao();
        this.numero = controleLancamento.getLancamentoContaCorrenteCliente().getNumeroRemessaBanco();
        this.situacao = controleLancamento.getLancamentoContaCorrenteCliente().getNomeSituacaoRemessa();
        this.dataConfirmacao = controleLancamento.getDataEfetivaLancamento();
        this.dadosBancarios = controleLancamento.getLancamentoContaCorrenteCliente()
                .getDadosDomicilioBancario().getDetailAccount(controleLancamento.getNomeBanco());
        this.valorFinal = controleLancamento.getValorLancamentoRemessa();
    }

    public LocalDate getDataLancamento() {return dataLancamento;}

    public String getDescricao() {return descricao;}

    public Long getNumero() {return numero;}

    public String getSituacao() {return situacao;}

    public LocalDate getDataConfirmacao() {return dataConfirmacao;}

    public String getDadosBancarios() {return dadosBancarios;}

    public String getValorFinal() {
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        return currencyFormatter.format(valorFinal);
    }
}
