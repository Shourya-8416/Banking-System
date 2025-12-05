package com.bank.app;

import com.bank.account.Account;
import com.bank.account.CurrentAccount;
import com.bank.account.SavingAccount;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankApp {
    private Scanner input = new Scanner(System.in);
    private List<Account> accounts = new ArrayList<>();

    public static void main(String[] args) {
        new BankApp().start();
    }

    private void printMenu(){
        System.out.println("\n--- Bank Menu ---");
        System.out.println("1. Create Account");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Print Account Details");;
        System.out.println("5. Exit");
        System.out.println(" Enter your Choice");
    }

    private void createAccount(){
        System.out.println("Types of Account");
        System.out.println("1. Saving");
        System.out.println("2. Current");
        System.out.println("Enter Choice : ");

        int type = input.nextInt();
        switch (type){
            case 1->{
                System.out.println("Enter Account Number : ");
                int accountNumber = input.nextInt();
                input.nextLine();
                System.out.println("Enter Account Holder Name : ");
                String name = input.nextLine();
                System.out.println("Enter Balance :");
                double balance = input.nextDouble();

                SavingAccount newAccount = new SavingAccount(accountNumber, name, balance);
                accounts.add(newAccount);

                System.out.println("Saving Account Successfully Created");
            }
            case 2->{
                System.out.println("Enter Account Number : ");
                int accountNumber = input.nextInt();
                input.nextLine();
                System.out.println("Enter Account Holder Name : ");
                String name = input.nextLine();
                System.out.println("Enter Balance");
                double balance = input.nextDouble();
                System.out.println("Enter Overdraft Limit : ");
                double limit = input.nextDouble();
                CurrentAccount newAccount = new CurrentAccount(accountNumber, name, balance, limit);
                accounts.add(newAccount);

                System.out.println("Current Account Successfully Created");
            }
            default -> System.out.println("Invalid Choice");
        }
    }

    private void depositAmount(){

    }

    private void withdrawAmount(){

    }

    private void printAccountDetails(){

    }

    private void start(){
        while(true) {
            printMenu();
            int choice = input.nextInt();
            switch (choice) {
                case 1 -> createAccount();
                case 2 -> depositAmount();
                case 3 -> withdrawAmount();
                case 4 -> printAccountDetails();
                case 5 -> {
                    System.out.println("Thank You!");
                    return;
                }
                default -> System.out.println("Invalid Option");
            }
        }
    }

}
