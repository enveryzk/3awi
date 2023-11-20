package at.eyu.faker;

import com.github.javafaker.Faker;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class MyFaker4 {
    public static void main(String[] args) {

        Faker faker = new Faker(new Locale("DE-AT"));
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
