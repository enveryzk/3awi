package at.eyu.basic;

import java.util.Random;
import java.util.Scanner;
public class ControlStructursWürfel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Scanner erstellen
        Random random = new Random(); //Random um zufällige Zahlen zu bekommen

        System.out.println("Würfelspiel");
        System.out.println("Drücke Enter zum spielen");
        scanner.nextLine(); //Nach einer Eingabe scannen

        int summeSpieler = 0;
        int summeComputer = 0;

        for (int nummerwurf = 1; nummerwurf <= 6; nummerwurf++){ //For - Schleife für die 6 mal Würfeln
            System.out.println("Wurf Nr. " + nummerwurf + " -- Um zu würfeln drücke Enter"); //Wurf Nr wird jedes mal beim durchlaufen erhöht
            scanner.nextLine(); //Nach einer Eingabe scannen

            int wurfspieler = random.nextInt(6) + 1; //Alle Zahlen von 0-5 und wir brauchen noch +1 da der würfel 6 Zahlen hat
            System.out.println("Du hast eine " + wurfspieler + " gewürfelt!");
            summeSpieler += wurfspieler; //Bei jedem durchlauf addieren

            int wurfcompi = random.nextInt(6) + 1;
            System.out.println("Der Compi hat eine " + wurfcompi + " gewürfelt");
            summeComputer += wurfcompi;

            System.out.println("Summe Compi: " + summeComputer);
            System.out.println("Summe Spieler: " + summeSpieler);

        }

        System.out.println("Spiel beendet");

        System.out.println("Spieler Gesamtsumme: " + summeSpieler);
        System.out.println("Computer Gesamtsumme: " + summeComputer);

        if (summeSpieler > summeComputer) {
            System.out.println("Herzlichen Glückwunsch! Du hast gewonnen!");
        } else if (summeSpieler < summeComputer) {
            System.out.println("Der Computer hat gewonnen. Get better!");
        } else {
            System.out.println("Das Spiel endet unentschieden. Gleichstand!");
        }
    }
}
