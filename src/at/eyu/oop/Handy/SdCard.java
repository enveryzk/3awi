package at.eyu.oop.Handy;

import java.util.ArrayList;
import java.util.List;

// Klasse für die SD-Karte
public class SdCard {
    private static final int MAX_STORAGE = 100; // Beispiel-Maximalgröße der SD-Karte in MB
    private List<PhotoFile> files;

    public SdCard() {
        this.files = new ArrayList<>();
    }

    // Überprüfung, ob genügend freier Speicherplatz auf der SD-Karte vorhanden ist
    public boolean hasFreeSpace() {
        int currentSize = files.stream().mapToInt(PhotoFile::getSize).sum();
        return currentSize < MAX_STORAGE;
    }

    // Speichern einer Datei auf der SD-Karte
    public void saveFile(PhotoFile file) {
        files.add(file);
    }

    // Anzeigen aller Dateien auf der SD-Karte
    public void displayFiles() {
        if (files.isEmpty()) {
            System.out.println("Keine Dateien auf der SD-Karte.");
        } else {
            System.out.println("Dateien auf der SD-Karte:");
            for (PhotoFile file : files) {
                System.out.println(file.getName());
            }
        }
    }
}
