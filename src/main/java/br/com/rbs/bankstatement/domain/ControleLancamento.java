package br.com.rbs.bankstatement.domain;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ControleLancamento {

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataEfetivaLancamento;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataLancamentoContaCorrenteCliente;

    private Integer numeroEvento;
    private String descricaoGrupoPagamento;
    private Integer codigoIdentificadorUnico;
    private String nomeBanco;
    private Integer quantidadeLancamentoRemessa;
    private Integer numeroRaizCNPJ;
    private Integer numeroSufixoCNPJ;
    private BigDecimal valorLancamentoRemessa;
    private Long dateLancamentoContaCorrenteCliente;
    private Long dateEfetivaLancamento;
    private LancamentoContaCorrenteCliente lancamentoContaCorrenteCliente;

    public LocalDate getDataEfetivaLancamento() {
        return dataEfetivaLancamento;
    }

    public void setDataEfetivaLancamento(LocalDate dataEfetivaLancamento) {
        this.dataEfetivaLancamento = dataEfetivaLancamento;
    }

    public LocalDate getDataLancamentoContaCorrenteCliente() {
        return dataLancamentoContaCorrenteCliente;
    }

    public void setDataLancamentoContaCorrenteCliente(LocalDate dataLancamentoContaCorrenteCliente) {
        this.dataLancamentoContaCorrenteCliente = dataLancamentoContaCorrenteCliente;
    }

    public Integer getNumeroEvento() {
        return numeroEvento;
    }

    public void setNumeroEvento(Integer numeroEvento) {
        this.numeroEvento = numeroEvento;
    }

    public String getDescricaoGrupoPagamento() {
        return descricaoGrupoPagamento;
    }

    public void setDescricaoGrupoPagamento(String descricaoGrupoPagamento) {
        this.descricaoGrupoPagamento = descricaoGrupoPagamento;
    }

    public Integer getCodigoIdentificadorUnico() {
        return codigoIdentificadorUnico;
    }

    public void setCodigoIdentificadorUnico(Integer codigoIdentificadorUnico) {
        this.codigoIdentificadorUnico = codigoIdentificadorUnico;
    }

    public String getNomeBanco() {
        return nomeBanco;
    }

    public void setNomeBanco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
    }

    public Integer getQuantidadeLancamentoRemessa() {
        return quantidadeLancamentoRemessa;
    }

    public void setQuantidadeLancamentoRemessa(Integer quantidadeLancamentoRemessa) {
        this.quantidadeLancamentoRemessa = quantidadeLancamentoRemessa;
    }

    public Integer getNumeroRaizCNPJ() {
        return numeroRaizCNPJ;
    }

    public void setNumeroRaizCNPJ(Integer numeroRaizCNPJ) {
        this.numeroRaizCNPJ = numeroRaizCNPJ;
    }

    public Integer getNumeroSufixoCNPJ() {
        return numeroSufixoCNPJ;
    }

    public void setNumeroSufixoCNPJ(Integer numeroSufixoCNPJ) {
        this.numeroSufixoCNPJ = numeroSufixoCNPJ;
    }

    public BigDecimal getValorLancamentoRemessa() {
        return valorLancamentoRemessa;
    }

    public void setValorLancamentoRemessa(BigDecimal valorLancamentoRemessa) {
        this.valorLancamentoRemessa = valorLancamentoRemessa;
    }

    public Long getDateLancamentoContaCorrenteCliente() {
        return dateLancamentoContaCorrenteCliente;
    }

    public void setDateLancamentoContaCorrenteCliente(Long dateLancamentoContaCorrenteCliente) {
        this.dateLancamentoContaCorrenteCliente = dateLancamentoContaCorrenteCliente;
    }

    public Long getDateEfetivaLancamento() {
        return dateEfetivaLancamento;
    }

    public void setDateEfetivaLancamento(Long dateEfetivaLancamento) {
        this.dateEfetivaLancamento = dateEfetivaLancamento;
    }

    public LancamentoContaCorrenteCliente getLancamentoContaCorrenteCliente() {
        return lancamentoContaCorrenteCliente;
    }

    public void setLancamentoContaCorrenteCliente(LancamentoContaCorrenteCliente lancamentoContaCorrenteCliente) {
        this.lancamentoContaCorrenteCliente = lancamentoContaCorrenteCliente;
    }
}
