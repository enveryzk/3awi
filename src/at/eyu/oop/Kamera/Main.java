package at.eyu.oop.Kamera;

public class Main {
    public static void main(String[] args) {
        // Hersteller und Objektiv erstellen
        Manufacturer canon = new Manufacturer("Canon", "Japan");
        Lens lens = new Lens(canon, 50);

        // Kamera erstellen und Objektiv setzen
        Camera myCamera = new Camera(canon, 20, 1.5, "Black");
        myCamera.setLens(lens);

        // Standardauflösung ausgeben und erstes Bild aufnehmen
        System.out.println("Default Resolution: " + myCamera.resolution);
        myCamera.takePicture();

        // Auflösung aktualisieren und mehrere Bilder aufnehmen
        myCamera.setResolution("large");
        System.out.println("Updated Resolution: " + myCamera.resolution);
        myCamera.takePicture();
        myCamera.takePicture();
        myCamera.takePicture();

        // Bilder aufnehmen, bis SD-Karte voll ist (manuelle Kapazitätsänderung für den Test)
        myCamera.sdCard.capacity = 2; // Setze die Kapazität auf 2 GB für den Test
        System.out.println("Manuelle Kapazitätsänderung für Test: Verbleibende Kapazität der SD-Karte: " + myCamera.sdCard.capacity + " GB");
        while (!myCamera.isSDCardFull()) {
            myCamera.takePicture();
        }

        // Neue SD-Karte einsetzen und mehrere Bilder aufnehmen
        myCamera.insertNewSDCard(32); // Neue SD-Karte mit 32 GB
        myCamera.takePicture();
        myCamera.takePicture();
        myCamera.takePicture();

        // Gespeicherte Bilder auf der SD-Karte ausgeben
        System.out.println("Gespeicherte Bilder auf der SD-Karte:");
        for (Picture picture : myCamera.sdCard.pictures) {
            System.out.println("Name: " + picture.name + ", Datum: " + picture.date + ", Größe: " + picture.size + " GB");
        }
    }
}
