package br.com.rbs.bankstatement.domain;

import java.math.BigDecimal;

public class TotalControleLancamento {

    private Integer quantidadeLancamentos;
    private Integer quantidadeRemessas;
    private BigDecimal valorLancamentos;

    public Integer getQuantidadeLancamentos() {
        return quantidadeLancamentos;
    }

    public void setQuantidadeLancamentos(Integer quantidadeLancamentos) {
        this.quantidadeLancamentos = quantidadeLancamentos;
    }

    public Integer getQuantidadeRemessas() {
        return quantidadeRemessas;
    }

    public void setQuantidadeRemessas(Integer quantidadeRemessas) {
        this.quantidadeRemessas = quantidadeRemessas;
    }

    public BigDecimal getValorLancamentos() {
        return valorLancamentos;
    }

    public void setValorLancamentos(BigDecimal valorLancamentos) {
        this.valorLancamentos = valorLancamentos;
    }
}
