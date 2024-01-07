package at.eyu.oop.Handy;

import java.util.Scanner;

// Hauptklasse für die Smartphone-Anwendung mit Login
public class SmartphoneApp {
    private Smartphone smartphone;
    private User currentUser;

    public SmartphoneApp() {
        this.smartphone = new Smartphone();
        this.currentUser = new User("user", "password"); // Beispielbenutzer
    }

    // Startmethode für die Anwendung
    public void start() {
        Scanner scanner = new Scanner(System.in);

        // Login
        System.out.print("Benutzername: ");
        String enteredUsername = scanner.nextLine();
        System.out.print("Passwort: ");
        String enteredPassword = scanner.nextLine();

        if (currentUser.authenticate(enteredUsername, enteredPassword)) {
            System.out.println("Login erfolgreich. Willkommen!");

            while (true) {
                System.out.println("1. Foto machen");
                System.out.println("2. Alle Dateien auf der SD-Karte anzeigen");
                System.out.println("3. Beenden");
                System.out.print("Option wählen: ");

                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        smartphone.takePhoto();
                        break;
                    case 2:
                        smartphone.displayFiles();
                        break;
                    case 3:
                        System.out.println("Programm wird beendet.");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Ungültige Option. Bitte erneut wählen.");
                }
            }
        } else {
            System.out.println("Login fehlgeschlagen. Programm wird beendet.");
            System.exit(0);
        }
    }
}

