package at.eyu.oop.Kamera;

import java.util.Date;

// Klasse, die das Bild repräsentiert
public class Picture {
    String name;
    Date date;
    int size; // in GB

    // Konstruktor für die Initialisierung des Bildes
    public Picture(String name, Date date, int size) {
        this.name = name;
        this.date = date;
        this.size = size;
    }
}