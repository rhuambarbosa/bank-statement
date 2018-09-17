package br.com.rbs.bankstatement.domain;

public class DomicilioBancario {

    private Integer codigoBanco;
    private Integer numeroAgencia;
    private Long numeroContaCorrente;

    public Integer getCodigoBanco() {
        return codigoBanco;
    }

    public void setCodigoBanco(Integer codigoBanco) {
        this.codigoBanco = codigoBanco;
    }

    public Integer getNumeroAgencia() {
        return numeroAgencia;
    }

    public void setNumeroAgencia(Integer numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }

    public Long getNumeroContaCorrente() {
        return numeroContaCorrente;
    }

    public void setNumeroContaCorrente(Long numeroContaCorrente) {
        this.numeroContaCorrente = numeroContaCorrente;
    }
}
