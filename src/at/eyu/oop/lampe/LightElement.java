package at.eyu.oop.lampe;

public class LightElement {
    private String name;
    private String color;
    private double powerUsage;
    private boolean status;

    public LightElement(String name, String color, double powerUsage) {
        this.name = name;
        this.color = color;
        this.powerUsage = powerUsage;
        this.status = false;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public double getPowerUsage() {
        return powerUsage;
    }

    public boolean getStatus() {
        return status;
    }

    public void turnOn() {
        if (status) {
            System.out.println("Mein Name ist " + name + ". Ich bin bereits eingeschaltet.");
        } else {
            status = true;
            System.out.println("Mein Name ist " + name + ". Ich bin jetzt eingeschaltet.");
            powerUsage += 5.0;
        }
    }
}
