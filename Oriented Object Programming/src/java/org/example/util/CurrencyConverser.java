package org.example.util;

public class CurrencyConverser {
    public static final double IOF = 6.00;
    public static double amountToBePaid(double price, double quantity){
        double dollarWithCurrentPrice = quantity * price;
        return quantity * price * IOF / 100 + dollarWithCurrentPrice;
    }
}
