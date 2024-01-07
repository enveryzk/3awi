package at.eyu.oop.Handy;

import java.util.Scanner;

// Klasse für das modulare Smartphone
public class Smartphone {
    private Camera camera;
    private SimCard simCard;
    private SdCard sdCard;

    public Smartphone() {
        this.camera = new Camera();
        this.simCard = new SimCard("123456789", "555-1234");
        this.sdCard = new SdCard();
    }

    // Methode zum Starten des Hauptmenüs
    public void start() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Foto machen");
            System.out.println("2. Alle Dateien auf der SD-Karte anzeigen");
            System.out.println("3. Beenden");
            System.out.print("Option wählen: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    takePhoto();
                    break;
                case 2:
                    sdCard.displayFiles();
                    break;
                case 3:
                    System.out.println("Programm wird beendet.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Ungültige Option. Bitte erneut wählen.");
            }
        }
    }

    // Methode zum Aufnehmen eines Fotos
    public void takePhoto() {
        if (sdCard.hasFreeSpace()) {
            PhotoFile photoFile = camera.takePhoto();
            sdCard.saveFile(photoFile);
            System.out.println("Foto erfolgreich gespeichert.");
        } else {
            System.out.println("Nicht genügend Speicherplatz auf der SD-Karte.");
        }
    }

    // Methode zum Anzeigen aller Dateien auf der SD-Karte
    public void displayFiles() {
        sdCard.displayFiles();
    }
}
