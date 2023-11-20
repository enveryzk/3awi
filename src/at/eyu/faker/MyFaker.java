package at.eyu.faker;

import com.github.javafaker.Faker;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;

public class MyFaker {
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
    }
}
