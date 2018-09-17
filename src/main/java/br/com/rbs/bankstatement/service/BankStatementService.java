package br.com.rbs.bankstatement.service;

import br.com.rbs.bankstatement.domain.BankStatement;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BankStatementService {

    public List<BankStatement> listBankStatement() {
        final List<BankStatement> bankStatementList = new ArrayList<>();
        bankStatementList.add(new BankStatement(1));
        bankStatementList.add(new BankStatement(2));
        bankStatementList.add(new BankStatement(3));
        bankStatementList.add(new BankStatement(4));
        bankStatementList.add(new BankStatement(5));
        return bankStatementList;
    }
}
