package com.example.demo.Service;

import com.example.demo.Repository.AccountRepository;
import com.example.demo.Repository.BankingOpsRespository;
import com.example.demo.Repository.CoffeeShopRepository;
import com.example.demo.Util.OperationConstants;
import com.example.demo.model.*;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;

public class BankOperationServiceImpl implements BankOperationService{

    @Autowired
    private BankingOpsRespository bankingOpsRespository;
    @Autowired
    private AccountRepository accountRepository;

    @Override
    public Resonse performOperation(OperationModel operationModel) {
        Resonse resonse = new Resonse();
        try {
            BankAccount account = accountRepository.findByAccountNumber(operationModel.getAccountNumber());
            long currentAmountInAccount = account.getCurrentBalance();
            long updatedBalance = 0;
            if (account != null) {
                if (operationModel.getOperationToPerform().equalsIgnoreCase(OperationConstants.DEBIT_OPERATION)) {
                    updatedBalance = currentAmountInAccount + operationModel.getAmountToDebitOrCredit();
                    account.setCurrentBalance(updatedBalance);
                    accountRepository.save(account);
                    resonse.setBankAccount(account);
                    resonse.setHttpCode("200");

                } else if (operationModel.getOperationToPerform().equalsIgnoreCase(OperationConstants.CREDIT_OPERATION)) {
                    updatedBalance = currentAmountInAccount - operationModel.getAmountToDebitOrCredit();
                    account.setCurrentBalance(updatedBalance);
                    accountRepository.save(account);

                }
            }
            resonse.setBankAccount(account);
            resonse.setHttpCode("200");
            resonse.setAmountDepositOrCredit(operationModel.getAmountToDebitOrCredit());
            return resonse;
        }catch (Exception ex){
            resonse.setHttpCode("500");
        }
        return resonse;
    }

    @Override
    @Transactional
    public Resonse transfer(TransferModel transferModel) {
        Resonse resonse = new Resonse();
        try {
            BankAccount accountToDebit = accountRepository.findByAccountNumber(transferModel.getReciverAccountNumber());
            BankAccount accountToCredit = accountRepository.findByAccountNumber(transferModel.getSenderAccountNumber());
            long currentAmountInAccountToDebit = accountToDebit.getCurrentBalance();
            long currentAmountInAccountToCredit = accountToCredit.getCurrentBalance();
            accountToDebit.setCurrentBalance(currentAmountInAccountToDebit-transferModel.getAmountToBeSent());
            accountToCredit.setCurrentBalance(currentAmountInAccountToCredit+transferModel.getAmountToBeSent());
                accountRepository.saveAll(Arrays.asList(accountToDebit,accountToCredit));
                resonse.setBankAccount(accountToDebit);
                resonse.setHttpCode("200");
            resonse.setAmountDepositOrCredit(currentAmountInAccountToDebit-transferModel.getAmountToBeSent());
            resonse.setHttpCode("200");
            return resonse;
        }catch (Exception ex){
            resonse.setHttpCode("500");
        }
        return resonse;
    }
}
