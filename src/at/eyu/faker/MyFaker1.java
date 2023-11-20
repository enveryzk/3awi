package at.eyu.faker;

import com.github.javafaker.Faker;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;

public class MyFaker1 {
    public static void main(String[] args) {

        Faker faker = new Faker(new Locale("DE-AT"));

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
    }
}
