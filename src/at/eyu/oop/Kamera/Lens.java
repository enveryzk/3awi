package at.eyu.oop.Kamera;

// Klasse, die das Objektiv repräsentiert
public class Lens {
    Manufacturer manufacturer;
    int focalLength; // in mm

    // Konstruktor für die Initialisierung des Objektivs
    public Lens(Manufacturer manufacturer, int focalLength) {
        this.manufacturer = manufacturer;
        this.focalLength = focalLength;
    }
}