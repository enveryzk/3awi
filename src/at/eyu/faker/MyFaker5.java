package at.eyu.faker;

import com.github.javafaker.Faker;

import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Locale;
import java.util.Date;
import java.text.SimpleDateFormat;

public class MyFaker5 {
    public static void main(String[] args) {

        Faker faker = new Faker(new Locale("DE-AT"));

        try {
            FileWriter myWriter = new FileWriter("insertdaten.txt");

            for (int i = 0; i < 100; i++) {
                String name = faker.name().fullName();
                String firstName = faker.name().firstName();
                String lastName = faker.name().lastName();
                String streetAddress = faker.address().streetAddress();
                String phoneNumber = faker.phoneNumber().cellPhone();

                String record = "insert into Kunden (KundenId, Vorname, Nachname, Telefon) values"
                        + " (" + (i + 1) + ", '" + firstName + "', '" + lastName + "', '" + phoneNumber + "');";
                System.out.println(record);
                myWriter.write(record + "\n");


            }

            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        try {
            FileWriter myWriter = new FileWriter("insertdaten_hersteller.txt");

            for (int i = 0; i < 100; i++) {
                String name = faker.company().name();

                String record = "insert into Hersteller (HerstellerID, Name) values"
                        + " (" + (i + 1) + ", '" + name + "');";
                System.out.println(record);
                myWriter.write(record + "\n");
            }

            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

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

        try {
            FileWriter myWriter = new FileWriter("insertdaten_teile.txt");

            for (int i = 0; i < 100; i++) {
                String name = faker.commerce().productName();
                BigDecimal preis = BigDecimal.valueOf(faker.number().randomDouble(2, 1, 1000));

                String record = "insert into Teile (TeilID, Name, Preis) values"
                        + " (" + (i + 1) + ", '" + name + "', " + preis + ");";
                System.out.println(record);
                myWriter.write(record + "\n");
            }

            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        try {
            FileWriter myWriter = new FileWriter("insertdaten_bestellungen.txt");

            for (int i = 0; i < 100; i++) {
                int kundenId = faker.number().numberBetween(1, 100);
                int motorradId = faker.number().numberBetween(1, 100);
                String bestelldatum = dateFormat.format(faker.date().between(new Date(), new Date()));

                String record = "insert into Bestellungen (BestellID, KundenID, MotorradID, Bestelldatum) values"
                        + " (" + (i + 1) + ", " + kundenId + ", " + motorradId + ", '" + bestelldatum + "');";
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
