package at.eyu.basic;

import java.util.Scanner;
public class TicTacToeSpiel {
    public static void main(String[]args) {
        char[][] board = new char[3][3]; //Zweidimensionales Array erstellen
        initializeBoard(board); //Zellen von dem Spielfeld auf leer setzen

        char currentPlayer = 'X';
        boolean gameWon = false;
        int moves = 0;

        while (moves < 9 && !gameWon){
            printBoard(board); //Anzeigen des Spielfeldes
            int[] move = getPlayerMove(board, currentPlayer);
            int row = move[0];
            int col = move[1];

            if (board[row][col] == ' '){
                board[row][col] == currentPlayer;
                gameWon = checkWin(board, currentPlayer, row, col);
                currentPlayer = (currentPlayer == 'X')? '0' : 'X';
                moves


            }
        }
    }

}
