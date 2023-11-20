package at.eyu.faker;

import com.github.javafaker.Faker;

import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Locale;

public class MyFaker3 {
    public static void main(String[] args) {

        Faker faker = new Faker(new Locale("DE-AT"));

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
    }
}
