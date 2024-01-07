package at.eyu.oop.Kamera;

import java.util.Date;

// Klasse, die die Kamera repräsentiert
public class Camera {
    Manufacturer manufacturer;
    int pixel;
    double weight;
    String color;
    Lens lens;
    SDCard sdCard;
    String resolution; // klein, mittel, groß

    public Camera(Manufacturer manufacturer, int pixel, double weight, String color) {
        this.manufacturer = manufacturer;
        this.pixel = pixel;
        this.weight = weight;
        this.color = color;
        this.sdCard = new SDCard(16); // Standardkapazität der SD-Karte: 16 GB
        this.resolution = "medium"; // Standardauflösung
    }

    // Methode zum Setzen des Objektivs
    public void setLens(Lens lens) {
        this.lens = lens;
    }

    // Methode zum Setzen der Auflösung
    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    // Methode zum Überprüfen, ob die SD-Karte voll ist
    public boolean isSDCardFull() {
        return sdCard.capacity <= 0;
    }

    // Methode zum Einsetzen einer neuen SD-Karte
    public void insertNewSDCard(int capacity) {
        this.sdCard = new SDCard(capacity);
    }

    // Methode zum Aufnehmen eines Bildes
    public void takePicture() {
        int pictureSize = getSizeOfCurrentPicture();

        if (sdCard.capacity >= pictureSize) {
            String pictureName = "Picture" + System.currentTimeMillis();
            Date currentDate = new Date();
            Picture picture = new Picture(pictureName, currentDate, pictureSize);
            sdCard.storePicture(picture);
            System.out.println("Bild aufgenommen: " + pictureName);
            System.out.println("Verbleibende Kapazität der SD-Karte: " + sdCard.capacity + " GB");
        } else {
            System.out.println("Warnung: Nicht genügend Speicherplatz auf der SD-Karte.");
            System.out.println("Aktuelle Kapazität der SD-Karte: " + sdCard.capacity + " GB");
            // Hinzufügen einer Pause, um die Schleife nicht zu schnell durchlaufen zu lassen
            try {
                Thread.sleep(1000); // Pause für 1 Sekunde
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    // Methode zur Berechnung der Größe des aktuellen Bildes basierend auf der Auflösung
    private int getSizeOfCurrentPicture() {
        switch (resolution) {
            case "small":
                return 2;
            case "medium":
                return 4;
            case "large":
                return 6;
            default:
                return 4; // Standardgröße, falls Auflösung nicht erkannt wird
        }
    }
}
