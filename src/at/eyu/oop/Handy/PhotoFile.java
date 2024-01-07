package at.eyu.oop.Handy;

// Klasse für die Foto-Datei
public class PhotoFile {
    private final String name;
    private final int size; // Beispielgröße in MB

    public PhotoFile(String name) {
        this.name = name;
        this.size = 5; // Beispielgröße
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }
}
