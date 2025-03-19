package Scaner;

import java.util.Scanner;

public class Scaner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double Wechselkurs = 1.09;

        // Geldbetrag eingeben
        System.out.print("Bitte geben Sie den Betrag in Euro ein: ");
        double euroBetrag = scanner.nextDouble();


        // Berechnung
        double usdBetrag = euroBetrag * Wechselkurs;

        // Ergebnis ausgeben
        System.out.printf("Der Betrag in USD: %.2f%n", usdBetrag);

        // Scanner schließen
        scanner.close();
    }
}
