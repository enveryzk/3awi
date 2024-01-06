package at.eyu.oop.cars;

public class Main {
    public static void main(String[] args) {
        Hersteller hersteller1 = new Hersteller("BMW", "Deutschland", 5);
        Hersteller hersteller2 = new Hersteller("Toyota", "Japan", 8);

        Motor motor1 = new Motor("Elektro", 400);
        Motor motor2 = new Motor("Benzin", 586);

        Auto auto1 = new Auto("Weiß",250,100000.99,4, hersteller1,motor1,0);
        Auto auto2 = new Auto("Schwarz",301,60000.99,6, hersteller2,motor2,20000);

        System.out.println("Auto 1 Preis: " + auto1.getPreis() + " Verbrauch: " + auto1.getBasisverbrauch());
        System.out.println("Auto 2 Preis: " + auto2.getPreis() + " Verbrauch: " + auto2.getBasisverbrauch());

        auto1.fahre(60000);

        System.out.println("Nach 60k Verbrauch Auto 1: " + auto1.getBasisverbrauch());

    }
}
