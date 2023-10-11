package at.eyu.basic;

import java.util.Random;
import java.util.Scanner;
public class ControlStructursWürfel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Würfelspiel");
        System.out.println("Drücke Enter zum spielen");
        scanner.nextLine();

        int summeSpieler = 0;
        int summeComputer = 0;

        for (int nummerwurf = 1; nummerwurf <= 6; nummerwurf++){
            System.out.println("Wurf Nr. " + nummerwurf + " -- Um zu würfeln drücke Enter");
            scanner.nextLine();

            int wurfspieler = random.nextInt(6) + 1;
            System.out.println("Du hast eine " + wurfspieler + " gewürfelt!");
            summeSpieler += wurfspieler;

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
            System.out.println("Der Computer hat gewonnen. Besser Glück nächstes Mal!");
        } else {
            System.out.println("Das Spiel endet unentschieden. Gleichstand!");
        }
    }
}
