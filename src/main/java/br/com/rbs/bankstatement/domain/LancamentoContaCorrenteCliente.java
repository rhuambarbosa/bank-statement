package br.com.rbs.bankstatement.domain;

import java.util.List;

public class LancamentoContaCorrenteCliente {

    private Long numeroRemessaBanco;
    private String nomeSituacaoRemessa;
    private String nomeTipoOperacao;
    private List<String> dadosAnaliticoLancamentoFinanceiroCliente;
    private DomicilioBancario dadosDomicilioBancario;

    public Long getNumeroRemessaBanco() {
        return numeroRemessaBanco;
    }

    public void setNumeroRemessaBanco(Long numeroRemessaBanco) {
        this.numeroRemessaBanco = numeroRemessaBanco;
    }

    public String getNomeSituacaoRemessa() {
        return nomeSituacaoRemessa;
    }

    public void setNomeSituacaoRemessa(String nomeSituacaoRemessa) {
        this.nomeSituacaoRemessa = nomeSituacaoRemessa;
    }

    public String getNomeTipoOperacao() {
        return nomeTipoOperacao;
    }

    public void setNomeTipoOperacao(String nomeTipoOperacao) {
        this.nomeTipoOperacao = nomeTipoOperacao;
    }

    public List<String> getDadosAnaliticoLancamentoFinanceiroCliente() {
        return dadosAnaliticoLancamentoFinanceiroCliente;
    }

    public void setDadosAnaliticoLancamentoFinanceiroCliente(List<String> dadosAnaliticoLancamentoFinanceiroCliente) {
        this.dadosAnaliticoLancamentoFinanceiroCliente = dadosAnaliticoLancamentoFinanceiroCliente;
    }

    public DomicilioBancario getDadosDomicilioBancario() {
        return dadosDomicilioBancario;
    }

    public void setDadosDomicilioBancario(DomicilioBancario dadosDomicilioBancario) {
        this.dadosDomicilioBancario = dadosDomicilioBancario;
    }
}
