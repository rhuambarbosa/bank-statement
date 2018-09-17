package br.com.rbs.bankstatement.domain;

import org.springframework.stereotype.Service;

public class BankStatement {

    TotalControleLancamento totalControleLancamento;
    private Integer indice;
    private Integer tamanhoPagina;
    private Integer totalElements;

    private int id;

    public BankStatement(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
