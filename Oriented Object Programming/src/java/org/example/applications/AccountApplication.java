package org.example.applications;

import org.example.entities.Account;

import java.util.Scanner;

public class AccountApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        String holder;
        char option;
        double value;
        //Declaramos a variável armazenando a classe para poder utilizar ela universalmente no escopo da aplicação
        Account account;

        System.out.print("Enter account number: ");
        number = sc.nextInt();
        System.out.print("Enter account holder: ");
        sc.nextLine();
        holder = sc.nextLine();
        System.out.print("Is there an initial deposit? (y/n)");
        option = sc.nextLine().charAt(0);

        if (option == 'y' || option == 'Y'){
            System.out.print("Enter initial deposit value: ");
            value = sc.nextDouble();
            account = new Account(number,holder,value);
        } else {
            account = new Account(number,holder,option);
        }

        System.out.println(account);

        System.out.print("\nEnter a deposit value:");
        value = sc.nextDouble();
        account.deposit(value);
        System.out.println("\nUpdated  account data: \n" + account);

        System.out.print("\nEnter a withdraw value:");
        value = sc.nextDouble();
        account.withdraw(value);
        System.out.println("\nUpdated  account data: \n" + account);

    }
}
