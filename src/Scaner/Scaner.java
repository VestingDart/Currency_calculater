package Scaner;

import java.util.Scanner;

public class Scaner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double Exchangerate = 1.09;

        // Enter amount of money
        System.out.print("Please enter the amount in euros: ");
        double euroamount = scanner.nextDouble();

        // calculation
        double usdamount = euroamount * Exchangerate;

        // Output result
        System.out.printf("The amount in USD: %.2f%n", usdamount);

        // Close scanner
        scanner.close();
    }
}
