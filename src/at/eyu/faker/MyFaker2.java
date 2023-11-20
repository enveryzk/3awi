package at.eyu.faker;

import com.github.javafaker.Faker;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;

public class MyFaker2 {
    public static void main(String[] args) {

        Faker faker = new Faker(new Locale("DE-AT"));

        try {
            FileWriter myWriter = new FileWriter("insertdaten_motorraeder.txt");

            for (int i = 0; i < 100; i++) {
                String modell = faker.name().name();
                int baujahr = faker.number().numberBetween(1990, 2022);
                int herstellerID = faker.number().numberBetween(1, 101); // Annahme: es gibt 100 Hersteller

                String record = "insert into Motorraeder (MotorradID, Modell, Baujahr, HerstellerID) values"
                        + " (" + (i + 1) + ", '" + modell + "', " + baujahr + ", " + herstellerID + ");";
                System.out.println(record);
                myWriter.write(record + "\n");
            }

            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
