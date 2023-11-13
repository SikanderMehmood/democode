package com.example.demo.model;

public class OperationModel {
    private String operationToPerform;
    private long amountToDebitOrCredit;

    private String accountNumber;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getOperationToPerform() {
        return operationToPerform;
    }

    public void setOperationToPerform(String operationToPerform) {
        this.operationToPerform = operationToPerform;
    }

    public long getAmountToDebitOrCredit() {
        return amountToDebitOrCredit;
    }

    public void setAmountToDebitOrCredit(long amountToDebitOrCredit) {
        this.amountToDebitOrCredit = amountToDebitOrCredit;
    }
}
