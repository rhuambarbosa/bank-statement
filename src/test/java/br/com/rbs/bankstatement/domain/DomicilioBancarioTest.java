package br.com.rbs.bankstatement.domain;

import org.junit.Assert;
import org.junit.Test;

public class DomicilioBancarioTest {

    @Test
    public void getDetailAccount() {
        DomicilioBancario db = new DomicilioBancario();
        db.setCodigoBanco(341);
        db.setNumeroAgencia(126);
        db.setNumeroContaCorrente(3215654L);

        String expected = "341 - Itaú AG 126 CC 3215654";
        String result = db.getDetailAccount("Itaú");

        Assert.assertEquals("Montagem dos dados bancarios errada.", expected, result);

    }
}