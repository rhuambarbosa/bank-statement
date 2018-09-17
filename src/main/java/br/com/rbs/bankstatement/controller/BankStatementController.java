package br.com.rbs.bankstatement.controller;

import br.com.rbs.bankstatement.domain.BankStatement;
import br.com.rbs.bankstatement.service.BankStatementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BankStatementController {

    @Autowired
    private BankStatementService bankStatementService;

    @RequestMapping(value = "/bank-statement/", method = RequestMethod.GET)
    public ResponseEntity<List<BankStatement>> listBankStatement() {
        List<BankStatement> bankStatementList = bankStatementService.listBankStatement();

        if (bankStatementList.isEmpty()) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }

        return new ResponseEntity<>(bankStatementList, HttpStatus.OK);
    }
}