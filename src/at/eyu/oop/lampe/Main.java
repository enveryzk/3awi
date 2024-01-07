package at.eyu.oop.lampe;

public class Main {
    public static void main(String[] args) {
        // Erstelle eine Lampe
        Lamp lamp = new Lamp();

        // Füge Glühelemente hinzu
        LightElement element1 = new LightElement("Element1", "Rot", 10.0);
        LightElement element2 = new LightElement("Element2", "Blau", 8.0);

        lamp.addLightElement(element1);
        lamp.addLightElement(element2);

        // Schalte alle Glühelemente ein
        lamp.turnAllOn();

        // Gib den Gesamtstromverbrauch aus
        System.out.println("Gesamtstromverbrauch: " + lamp.getOverallPowerUsage());

        // Gib die Namen der Glühelemente aus
        lamp.printNamesOfLightElements();

        lamp.turnAllOn();

        System.out.println("Gesamtstromverbrauch: " + lamp.getOverallPowerUsage());

        lamp.turnAllOn();

        System.out.println("Gesamtstromverbrauch: " + lamp.getOverallPowerUsage());



    }
}
