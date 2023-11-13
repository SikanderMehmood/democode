package com.example.demo.model;


public class Resonse {

    private String httpCode;
    private long AmountDepositOrCredit;

    private BankAccount bankAccount;

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public String getHttpCode() {
        return httpCode;
    }

    public void setHttpCode(String httpCode) {
        this.httpCode = httpCode;
    }

    public long getAmountDepositOrCredit() {
        return AmountDepositOrCredit;
    }

    public void setAmountDepositOrCredit(long amountDepositOrCredit) {
        AmountDepositOrCredit = amountDepositOrCredit;
    }
}
