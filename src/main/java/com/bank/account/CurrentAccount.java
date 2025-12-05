package com.bank.account;

public class CurrentAccount extends Account {
    private double overdraftLimit;

    CurrentAccount(int accountNumber, String accountHolderName, double balance, double overdraftLimit){
        super(accountNumber, accountHolderName, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    void withdraw(double amount) {
        double currentBalance = getBalance();
        double maximumAllowed = currentBalance+overdraftLimit;
        if(amount <= maximumAllowed){
            double updatedBalance = maximumAllowed- amount;
            updateBalance(updatedBalance);
            System.out.println("Transction Successfull");
        }else{
            System.out.println("Insufficient Funds");
        }
    }
}
