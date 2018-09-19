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

    public String getDetailAccount(final String nomeBanco){
        final StringBuilder sb = new StringBuilder();
        sb.append(this.codigoBanco);
        sb.append(" - ").append(nomeBanco);
        sb.append(" AG ");
        sb.append(this.numeroAgencia);
        sb.append(" CC ");
        sb.append(this.numeroContaCorrente);
        return sb.toString();

    }
}
