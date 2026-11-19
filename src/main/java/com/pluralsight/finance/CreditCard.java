package com.pluralsight.finance;

import java.math.BigDecimal;

public class CreditCard implements Valuable {
    private String name;
    private String accountNumber;
    private BigDecimal balance;

    public CreditCard(String name, String accountNumber, BigDecimal balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void charge(BigDecimal amount){

    }
    public void pay(BigDecimal amount){

    }
    @Override
    public BigDecimal getValue() {
        return null;
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



}
