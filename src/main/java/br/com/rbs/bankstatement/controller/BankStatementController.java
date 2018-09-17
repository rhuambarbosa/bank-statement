package br.com.rbs.bankstatement.controller;

import br.com.rbs.bankstatement.domain.BankStatement;
import br.com.rbs.bankstatement.service.BankStatementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class BankStatementController {

    @Autowired
    private BankStatementService bankStatementService;

    @RequestMapping(value = "/bank-statement/", method = RequestMethod.GET)
    public ResponseEntity<BankStatement> getBankStatement() {
        Object body;
        HttpStatus status = HttpStatus.OK;

        try {
            body = bankStatementService.getBankStatement();
        } catch (IOException e) {
            e.printStackTrace();
            body = "Falha interna";
            status = HttpStatus.INTERNAL_SERVER_ERROR;
        }

        if (body == null) {
            body = "Nenhum resultado disponivel";
            status = HttpStatus.NO_CONTENT;
        }

        return new ResponseEntity(body, status);
    }
}