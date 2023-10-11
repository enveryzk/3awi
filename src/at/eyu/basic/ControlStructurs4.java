package at.eyu.basic;

import java.util.Random;
public class ControlStructurs4{
    public static void main(String[] args) {

        Random random = new Random();
        int randomNumber = random.nextInt(100);
        int randomNumber2 = random.nextInt(100);
        // Erstelle zwei Zufallszahl zwischen 0 und 100

        System.out.println(randomNumber);
        System.out.println(randomNumber2);

        if(randomNumber<randomNumber2 && randomNumber <50){
            System.out.println("Zahl1 ist kleiner als Zahl2 und Mini ");
        }

        // Wenn die erste Zahl kleiner ist als die zweite UND die erste Zahl kleiner ist als 50
        // dann gib aus "Zahl 1 ist kleiner als Zahl 2 und Mini"

        if(randomNumber<30||randomNumber2<30){
            System.out.println("Eine der beiden ist kleiner als 30");
        }

        // Wenn die erste Zahl kleiner ist als 30 oder die zweite Zahl kleiner ist als 30
        // dann gib aus "Eine der beiden ist kleiner als 30"

        if (randomNumber < 50 && randomNumber2 != 50) {
            System.out.println("Erste Zahl klein, zweite kein 50iger");
        }



        // Wenn die erste Zahl kleiner ist als 50 UND die zweite Zahl ungleich 50 ist
        // dann gib aus "Erste Zahl klein, zweite kein 50iger"



    }
}
