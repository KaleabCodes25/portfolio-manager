package com.pluralsight.finance;

import java.math.BigDecimal;

public class BankAccount implements Valuable {
    private String name;
    private String accountNumber;
    private BigDecimal balance;

    public BankAccount(String name, String accountNumber, BigDecimal balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void withdraw(BigDecimal amount){

    }
    public void deposit(BigDecimal amount){

    }

    public String getName() {
        return name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    @Override
    public BigDecimal getValue() {
        return null;
    }
}
