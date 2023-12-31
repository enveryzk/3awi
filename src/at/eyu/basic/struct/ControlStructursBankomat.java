package at.eyu.basic.struct;

import java.util.Scanner;

public class ControlStructursBankomat {
    public static void main(String[] args) {

        double kontostand = 1000; //Anfangskontostand

        Scanner scanner = new Scanner(System.in); //Scanner erstellen //Mit einem Scanner kann man die Benutzereingabe von der Konsole einlesen

        //Menüoptionen Ausgeben
        System.out.println("1. Einzahlen");
        System.out.println("2. Abheben");
        System.out.println("3. Kontostand");
        System.out.println("4. Ende");


        while (true) { // Schleife bis sie mit 4. Beendet wird

            int Auswahl = scanner.nextInt(); //Auswahl für die Menüoption wählen mit dem Datentypen Int

            switch (Auswahl) { //Switch Case mit den verschiedenen Auswahlmöglichkeiten
                case 1:
                    System.out.println("Geben Sie einen Betrag für die Einzahlung ein: ");
                    double einzahlung = scanner.nextDouble(); //Einzahlung einlesen
                    if (einzahlung > 0) { //Einzahlung darf nicht unter 0 sein
                        kontostand += einzahlung; //Einzahlung auf Kontostand addieren
                        System.out.println("Einzahlung in höhe von " + einzahlung + " war erfolgreich"); //Erfolgreich
                    } else {
                        System.out.println("Ungültiger Betrag für die Einzahlung");
                    }
                    break;

                case 2:
                    System.out.println("Geben Sie den Betrag für die Abhebung ein");
                    double abhebung = scanner.nextDouble(); //Abhebung einlesen
                    if (abhebung > 0 && abhebung <= kontostand) { //Abhebung darf nicht kleiner als 0 sein && Kontostand muss größer sein als abhebung
                        kontostand -= abhebung;
                        System.out.println("Abhebung von " + abhebung + " war erfolgreich");
                    } else if (abhebung <= 0) {
                        System.out.println("Ungültiger Betrag für Abhebung");
                    } else if (kontostand <= abhebung) {
                        System.out.println("Nicht ausreichendes Guthaben");
                    }
                    break;

                case 3:
                    System.out.println("Ihr Aktueller Kontostand beträgt " + kontostand + " EUR");
                    break;

                case 4:
                    System.out.println("Programm wird beendet");
                    scanner.close();
                    return;

                default:
                    System.out.println("Ungültige option. Bitte wählen sie eine zwischen 1-4");
            }
        }
    }
}