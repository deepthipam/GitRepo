package Javatutorial;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Currencyformat {
    
    public static void main(String[] args) {
        /* Read input */
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        /* Create custom Locale for India. 
          I used the "IANA Language Subtag Registry" to find India's country code */
        Locale indiaLocale = new Locale("en", "IN");

        /* Create NumberFormats using Locales */
        String us= NumberFormat
                .getCurrencyInstance(Locale.US)
                .format(payment);
        String india= NumberFormat
                .getCurrencyInstance(new Locale("en", "IN"))
                .format(payment);        

        String china= NumberFormat
                .getCurrencyInstance(Locale.CHINA)
                .format(payment);

        String france= NumberFormat
                .getCurrencyInstance(Locale.FRANCE)
                .format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}


