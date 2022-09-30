package org.example.applications;

import org.example.util.CurrencyConverser;

import java.util.Locale;
import java.util.Scanner;

public class CurrencyConverserApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        System.out.println("What is the dollar price? ");
        double dollar = sc.nextDouble();
        System.out.println("How many dollars will be bought? ");
        double quantity = sc.nextDouble();
        System.out.println("Amount to be paid in reais = " + String.format("%.2f", CurrencyConverser.amountToBePaid(dollar, quantity)));
    }
}
