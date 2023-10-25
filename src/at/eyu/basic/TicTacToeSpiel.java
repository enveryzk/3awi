package at.eyu.basic;

import java.util.Scanner;

public class TicTacToeSpiel {

    static char[] board = {'1', '2', '3', '4', '5', '6', '7', '8', '9'}; // Spielfeld (Array mit den Feldern 1-9)

    public static void main(String[] args) {
        welcome(); // Begrüßungsfunktion aufrufen
        playGame(); // Funktion für den Spielablauf aufrufen
    }

    public static void welcome() {
        System.out.println("Willkommen zum Tic-Tac-Toe-Spiel!");
        displayBoard(board); // Spielfeld anzeigen
    }

    public static void playGame() {
        boolean isPlayerX = true; // Spieler X beginnt
        boolean gameWon = false; // Zeigt an, ob das Spiel gewonnen wurde
        Scanner scanner = new Scanner(System.in);

        while (!gameWon) { //Solang das Spiel nicht gewonnen ist
            char currentPlayerSymbol = isPlayerX ? 'X' : 'O'; //Symbol des aktuellen Spielers festlegen
            int move = getPlayerMove(scanner, currentPlayerSymbol); //Zug des spielers mit dem Scanner zu erhalten

            if (isValidMove(move)) {
                board[move - 1] = currentPlayerSymbol; // Gültigen Zug auf dem Spielfeld setzen
                displayBoard(board); // Spielfeld anzeigen

                gameWon = checkWin(currentPlayerSymbol); // Überprüfen, ob der Spieler gewonnen hat

                if (gameWon) { //Spiel gewonnen
                    System.out.println("Spieler " + currentPlayerSymbol + " hat gewonnen!");
                } else if (isBoardFull()) {
                    System.out.println("Unentschieden! Das Spiel ist vorbei.");
                    break;
                } else {
                    isPlayerX = !isPlayerX; // Spielerwechsel
                }
            } else {
                System.out.println("Ungültige Eingabe. Bitte wählen Sie ein freies Feld (1-9).");
            }
        }
    }

    public static void displayBoard(char[] board) { //Struktur des Spielfeldes
        System.out.println("  " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println(" -----------");
        System.out.println("  " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println(" -----------");
        System.out.println("  " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    public static int getPlayerMove(Scanner scanner, char currentPlayerSymbol) {
        int move;
        while (true) {
            System.out.print("Spieler " + currentPlayerSymbol + ", wählen Sie ein Feld (1-9): ");
            move = scanner.nextInt();
            if (isValidMove(move)) {
                break;
            }
        }
        return move;
    }

    public static boolean isValidMove(int move) {
        return move >= 1 && move <= 9 && (board[move - 1] != 'X' && board[move - 1] != 'O');
        // Die Methode gibt 'true' zurück, wenn die folgenden Bedingungen erfüllt sind:
        // 1. 'move' liegt im Bereich von 1 bis 9 (gültige Felder).
        // 2. Das Feld, auf das der Zug gesetzt werden soll, ist nicht bereits mit 'X' oder 'O' belegt.
        // Andernfalls wird 'false' zurückgegeben, was auf einen ungültigen Zug hinweist.
    }

    public static boolean checkWin(char symbol) {
        // Gewinnkombinationen überprüfen
        return (board[0] == symbol && board[1] == symbol && board[2] == symbol) || //Horizontal
                (board[3] == symbol && board[4] == symbol && board[5] == symbol) || //Horizontal
                (board[6] == symbol && board[7] == symbol && board[8] == symbol) || //Horizontal
                (board[0] == symbol && board[3] == symbol && board[6] == symbol) || //Vertikal
                (board[1] == symbol && board[4] == symbol && board[7] == symbol) || //Vertikal
                (board[2] == symbol && board[5] == symbol && board[8] == symbol) || //Vertikal
                (board[0] == symbol && board[4] == symbol && board[8] == symbol) || //Diagonal
                (board[2] == symbol && board[4] == symbol && board[6] == symbol); //Diagonal
    }

    public static boolean isBoardFull() {
        for (char c : board) {
            // Schleife durchläuft jedes Feld im Spielfeld (Array 'board')

            if (c != 'X' && c != 'O') {
                // Überprüfen, ob das aktuelle Feld nicht mit 'X' und nicht mit 'O' belegt ist

                return false;
                // Wenn ein leeres Feld gefunden wird, wird 'false' zurückgegeben
            }
        }

        // Wenn die Schleife durchlaufen wird, ohne ein leeres Feld zu finden,
        // werden alle Felder auf dem Spielfeld als belegt angesehen
        return true;
        // 'true' wird zurückgegeben, was auf ein Unentschieden hinweist
    }
}