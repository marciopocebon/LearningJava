package org.example.entities;

public class Account {
    private static final double TAX = 5;
    private int numberAccount;
    private String accountHolder;
    private double balance;

    public Account(int numberAccount, String accountHolder, double value) {
            deposit(value);
            this.numberAccount = numberAccount;
            this.accountHolder = accountHolder;
    }

    public Account(int numberAccount, String accountHolder, char option) {
        if (option == 'n' || option == 'N') {
            deposit(0);
            this.numberAccount = numberAccount;
            this.accountHolder = accountHolder;
        }else {
            System.out.println("APENAS VALORES COMO: (y/n) SÃO PERMITIDOS!");
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double deposit(double value){

        balance += value;

        return balance;
    }

    public double withdraw(double value){

        balance -= value + TAX;

        return balance;
    }

    @Override
    public String toString() {
        return "Account data: \n" +
                "Account " + numberAccount + ", " +
                "Holder: " + accountHolder + ", " +
                "Balance: $" + String.format("%.2f", getBalance());
    }
}
