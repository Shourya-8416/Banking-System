package com.bank.account;

import com.bank.interfaces.Printable;

public class CurrentAccount extends Account implements Printable {
    private final double overdraftLimit;

    public CurrentAccount(int accountNumber, String accountHolderName, double balance, double overdraftLimit){
        super(accountNumber, accountHolderName, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    void withdraw(double amount) {
        double currentBalance = getBalance();
        double maximumAllowed = currentBalance+overdraftLimit;
        if(amount <= maximumAllowed){
            double updatedBalance = currentBalance- amount;
            updateBalance(updatedBalance);
            System.out.println("Transaction Successful");
        }else{
            System.out.println("Overdraft Limit Exceeded");
        }
    }

    public void printDetails(){
        System.out.println("Account Number: " + getAccountNumber());
        System.out.println("Account Holder: " + getAccountHolderName());
        System.out.println("Balance: " + getBalance());
        System.out.println("Overdraft Limit: " + overdraftLimit);
        System.out.println("Type: Current Account");

    }
}
