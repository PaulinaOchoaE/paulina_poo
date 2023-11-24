package edu.Paulina.Reto12.ui;

import java.util.Scanner;
import edu.Paulina.Reto12.process.Game;
import edu.Paulina.Reto12.process.Player;
import edu.Paulina.Reto12.process.ScoreBoard;
import edu.Paulina.Reto12.process.ComputerPlayer;
import  edu.Paulina.Reto12.process.Board;

public class CLI {
    private Scanner scanner;
    private Board board;
    public CLI() {
        this.scanner = new Scanner(System.in);
    }
        public void displayMainMenu() {
            System.out.println("===== Tic-Tac-Toe Game =====");
            System.out.println("1. 1 vs 1");
            System.out.println("2. 1 Player vs Computer");
            System.out.println("3. Show Scoreboard");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
        }
        public void displayMainMenu2() {
            System.out.println("===== JuegoGato =====");
            System.out.println("1.Jugador vs Jugador");
            System.out.println("2. 1 Jugador vs Computadora1");
            System.out.println("3. Mostrar Tabla");
            System.out.println("4. Salir");
            System.out.print("Selecciona una opcion: ");
        }


    public int getMenuChoice() {
            int choice = -1;
            while (choice < 1 || choice > 4) {
                try {
                    choice = Integer.parseInt(scanner.nextLine());
                } catch (NumberFormatException e) {
                    System.out.print("Invalid input. Please enter a number: ");
                }

                if (choice < 1 || choice > 4) {
                    System.out.print("Invalid choice. Please enter a valid option: ");
                }
            }
            return choice;
        }
    public int getMenuChoice2() {
        int choice = -1;
        while (choice < 1 || choice > 2) {
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.print("Invalid input. Please enter a number: ");
            }

            if (choice < 1 || choice > 4) {
                System.out.print("Invalid choice. Please enter a valid option: ");
            }
        }
        return choice;
    }

        public void displayScoreBoard(ScoreBoard scoreBoard) {
            System.out.println("===== Scoreboard =====");
            System.out.println("Player\t\tScore");
            for (Player player : scoreBoard.getPlayers()) {
                System.out.println(player.getName() + "\t\t" + player.getScore());
            }
            System.out.println("======================");
        }

        // Otros métodos de interacción con el usuario, como ingresar nombres de jugadores, movimientos, etc.
        public String getPlayerName(int playerNumber) {
            System.out.print("Enter the name for Player " + playerNumber + ": ");
            return scanner.nextLine();
        }
    public void displayWinner(Player winner) {
        System.out.println("Congratulations, " + winner.getName() + "! You are the winner!");
    }
    public int[] getPlayerMove(Player player) {
        int[] move = new int[2];

        // Pregunta por la fila
        do {
            System.out.print(player.getName() + ", enter the row (1-" + Board.SIZE + "): ");
            move[0] = getIntegerInput();
            if (!isValidRow(move[0])) {
                System.out.println("Invalid input. Please enter a valid row.");
            }
        } while (!isValidRow(move[0]));

        // Pregunta por la columna
        do {
            System.out.print(player.getName() + ", enter the column (1-" + Board.SIZE + "): ");
            move[1] = getIntegerInput();
            if (!isValidColumn(move[1])) {
                System.out.println("Invalid input. Please enter a valid column.");
            }
        } while (!isValidColumn(move[1]));

        return move;
    }

    private int getIntegerInput() {
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a number.");
            return getIntegerInput();
        }
    }

    private boolean isValidRow(int row) {
        return row >= 0 && row <= Board.SIZE;
    }

    private boolean isValidColumn(int col) {
        return col >= 0 && col <= Board.SIZE;
    }


    public void displayDraw() {
        System.out.println("The game is a draw. It's a tie!");
    }
    public void displayBoard(Board board) {
        System.out.println("Current Board:");
        board.displayBoard();
        System.out.println();
    }
}

