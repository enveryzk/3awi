package at.eyu.oop.Kamera;

import java.util.ArrayList;
import java.util.List;

// Klasse, die die SD-Karte repräsentiert
public class SDCard {
    int capacity; // in GB
    List<Picture> pictures;

    // Konstruktor für die Initialisierung der SD-Karte
    public SDCard(int capacity) {
        this.capacity = capacity;
        this.pictures = new ArrayList<>();
    }

    // Methode zum Speichern eines Bildes auf der SD-Karte
    public void storePicture(Picture picture) {
        pictures.add(picture);
    }
}