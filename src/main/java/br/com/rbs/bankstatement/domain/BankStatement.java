package br.com.rbs.bankstatement.domain;

import java.util.List;

public class BankStatement {

    private TotalControleLancamento totalControleLancamento;
    private List<ControleLancamento> listaControleLancamento;
    private Integer indice;
    private Integer tamanhoPagina;
    private Integer totalElements;

    public TotalControleLancamento getTotalControleLancamento() {
        return totalControleLancamento;
    }

    public void setTotalControleLancamento(TotalControleLancamento totalControleLancamento) {
        this.totalControleLancamento = totalControleLancamento;
    }

    public List<ControleLancamento> getListaControleLancamento() {
        return listaControleLancamento;
    }

    public void setListaControleLancamento(List<ControleLancamento> listaControleLancamento) {
        this.listaControleLancamento = listaControleLancamento;
    }

    public Integer getIndice() {
        return indice;
    }

    public void setIndice(Integer indice) {
        this.indice = indice;
    }

    public Integer getTamanhoPagina() {
        return tamanhoPagina;
    }

    public void setTamanhoPagina(Integer tamanhoPagina) {
        this.tamanhoPagina = tamanhoPagina;
    }

    public Integer getTotalElements() {
        return totalElements;
    }

    public void setTotalElements(Integer totalElements) {
        this.totalElements = totalElements;
    }
}
