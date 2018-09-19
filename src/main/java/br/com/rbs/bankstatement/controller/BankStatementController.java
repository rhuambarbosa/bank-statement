package br.com.rbs.bankstatement.controller;

import br.com.rbs.bankstatement.dto.BankStatementDTO;
import br.com.rbs.bankstatement.service.BankStatementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
public class BankStatementController {

    @Autowired
    private BankStatementService bankStatementService;

    @RequestMapping(value = "/bank-statement/", method = RequestMethod.GET)
    public ResponseEntity<BankStatementDTO> getBankStatement() {
        Object body;
        HttpStatus status = HttpStatus.OK;

        try {
            body = bankStatementService.listBankStatement();

            if (((List) body).isEmpty()) {
                body = "Nenhum resultado disponivel";
                status = HttpStatus.NO_CONTENT;
            }
        } catch (IOException e) {
            e.printStackTrace();
            body = "Falha interna";
            status = HttpStatus.INTERNAL_SERVER_ERROR;
        }

        return new ResponseEntity(body, status);
    }
}