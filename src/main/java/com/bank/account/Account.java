package com.bank.account;

abstract class Account {
    private int accountNumber;
    private String accountHolderName;
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

     abstract void withdraw(double amount);

    protected void updateBalance(double newBalance){
        this.balance = newBalance;
    }

}
