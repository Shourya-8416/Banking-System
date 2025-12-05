package com.bank.account;

import com.bank.interfaces.Printable;

public class SavingAccount extends Account implements Printable {


    public SavingAccount(int accountNumber, String accountHolderName, double balance) {
        super(accountNumber, accountHolderName, balance);
    }

    @Override
    public void withdraw(double amount) {
        double currentBalance = getBalance();
        if(amount <= currentBalance){
            double updatedBalance = currentBalance - amount;
            updateBalance(updatedBalance);
            System.out.println("Transaction Successful");
        }else{
            System.out.println("Insufficient Funds");
        }
    }

    public void printDetails(){
        System.out.println("Account Number: " + getAccountNumber());
        System.out.println("Account Holder: " + getAccountHolderName());
        System.out.println("Balance: " + getBalance());
        System.out.println("Type: Savings Account");

    }
}
