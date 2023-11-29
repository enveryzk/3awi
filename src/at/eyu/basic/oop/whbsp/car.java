package at.eyu.basic.oop.whbsp;

public class car {

    private int fuelComsumption;
    private String brand;
    private String serialnumber;
    private String color;

    private double tankstand;
    private double tankvolumen;
    private double verbrauch;

    // Konstruktor dient dazu Objekte zu Initialisieren. Wird nur am Anfang einer Klasse aufgerufen.
    public car(double tankstand, double tankvolumen, double verbrauch) {
        this.tankstand = tankstand;
        this.tankvolumen = tankvolumen;
        this.verbrauch = verbrauch;
    }

    public car() {
    }

    // Methoden zum Bremsen
    public void breakMethod() {
        System.out.println("Ich bremse");
    }

    // Methoden für Turboboost
    public void Turboboost() {
        double minFuelForBoost = 0.1 * tankvolumen; // Mindestbestand tankvolumen für boost

        if (tankstand < minFuelForBoost) {
            System.out.println("SuperBoost");
        } else {
            System.out.println("Not enough fuel to go superboost");
        }
    }

    public void honk(int amountOfRepetitions) {
        for (int i = 0; i < amountOfRepetitions; i++) {
            System.out.println("Tuuut");
        }
    }

    public int getFuelComsumption() {
        return fuelComsumption;
    }

    public void setFuelComsumption(int fuelComsumption) {
        this.fuelComsumption = fuelComsumption;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSerialnumber() {
        return serialnumber;
    }

    public void setSerialnumber(String serialnumber) {
        this.serialnumber = serialnumber;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getTankstand() {
        return tankstand;
    }

    public void setTankstand(double tankstand) {
        this.tankstand = tankstand;
    }

    public double getTankvolumen() {
        return tankvolumen;
    }

    public void setTankvolumen(double tankvolumen) {
        this.tankvolumen = tankvolumen;
    }

    public double getVerbrauch() {
        return verbrauch;
    }

    public void setVerbrauch(double verbrauch) {
        this.verbrauch = verbrauch;
    }
}
