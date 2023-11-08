package at.eyu.basic.struct;

import java.util.Scanner;

public class ControlStructurelessVerschlüsslung {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Caesar-Verschlüsselung");//Menüeingabe
        System.out.println("1. Verschlüsseln");
        System.out.println("2. Entschlüsseln");
        System.out.print("Wählen Sie eine Option: ");
        int option = scanner.nextInt(); //Nächste int eingabe scannen
        scanner.nextLine(); // Nächste int eingabe scannen

        if (option == 1) {//1. Option Verschlüsseln
            System.out.print("Geben Sie den zu verschlüsselnden Text ein: ");
            String plaintext = scanner.nextLine();

            System.out.print("Geben Sie die Verschiebung ein: ");
            int shift = scanner.nextInt();

            String encryptedText = encrypt(shift, plaintext);
            System.out.println("Verschlüsselt: " + encryptedText);
        } else if (option == 2) {//2. Option Entschlüsseln
            System.out.print("Geben Sie den zu entschlüsselnden Text ein: ");
            String encryptedText = scanner.nextLine();

            System.out.print("Geben Sie die Verschiebung ein: ");
            int shift = scanner.nextInt();

            String decryptedText = decrypt(shift, encryptedText);
            System.out.println("Entschlüsselt: " + decryptedText);
        } else {
            System.out.println("Ungültige Option ausgewählt.");
        }

        scanner.close();
    }

    public static String encrypt(int shift, String stringToEncrypt) {
        String encryptedString = "";
        char[] inputData = stringToEncrypt.toCharArray();

        for (int i = 0; i < inputData.length; i++) {
            char currentChar = inputData[i];
            if (Character.isLetter(currentChar)) {
                char base = Character.isLowerCase(currentChar) ? 'a' : 'A';
                char encryptedChar = (char) (base + (currentChar - base + shift) % 26); //%26 damit es innerhalb 26 buchstaben bleibt
                encryptedString += encryptedChar;
            } else {
                // Wenn es kein Buchstabe ist (z.B. Leerzeichen), füge es unverändert hinzu.
                encryptedString += currentChar;
            }
        }

        return encryptedString;
    }

    public static String decrypt(int shift, String stringToDecrypt) {
        String decryptedString = "";
        char[] inputData = stringToDecrypt.toCharArray();

        for (int i = 0; i < inputData.length; i++) {
            char currentChar = inputData[i];
            if (Character.isLetter(currentChar)) { // Überprüfen ob Buchstabe
                char base = Character.isLowerCase(currentChar) ? 'a' : 'A'; //Bestimmt ob groß oder klein schreibung
                char decryptedChar = (char) (base + (currentChar - base - shift + 26) % 26); //%26 damit es innerhalb 26 buchstaben bleibt
                decryptedString += decryptedChar;
            } else {
                // Wenn es kein Buchstabe ist (z.B. Leerzeichen), füge es unverändert hinzu.
                decryptedString += currentChar;
            }
        }

        return decryptedString;
    }
}
