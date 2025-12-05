package com.bank.account;

import java.sql.SQLOutput;

public class SavingAccount extends Account{


    SavingAccount(int accountNumber, String accountHolderName, double balance) {
        super(accountNumber, accountHolderName, balance);
    }

    @Override
    void withdraw(double amount) {
        double currentBalance = getBalance();
        if(amount <= currentBalance){
            double updatedBalance = currentBalance - amount;
            updateBalance(updatedBalance);
            System.out.println("Transaction Successfull");
        }else{
            System.out.println("Insufficient Funds");
        }
    }
}
