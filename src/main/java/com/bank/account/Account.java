package com.bank.account;

import com.bank.interfaces.Printable;

public abstract class Account implements Printable {
    private final int accountNumber;
    private final String accountHolderName;
    private double balance;

    //Parameterized Constructor
    Account(int accountNumber, String accountHolderName, double balance){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public double getBalance(){
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void deposit(double amount){
        balance+=amount;
    }

     public abstract void withdraw(double amount);

    protected void updateBalance(double newBalance){
        this.balance = newBalance;
    }

}
