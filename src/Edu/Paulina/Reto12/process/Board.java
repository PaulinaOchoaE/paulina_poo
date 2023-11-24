package edu.Paulina.Reto12.process;

public class Board {
    public static final int SIZE = 3; // Tamaño del tablero (puedes ajustar según tu juego)

    private char[][] cells; // Representa las celdas del tablero

    public Board() {
        cells = new char[SIZE][SIZE];
        initializeBoard();
    }

    private void initializeBoard() {
        // Inicializa todas las celdas del tablero con un valor por defecto (por ejemplo, '-')
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                cells[i][j] = '-';
            }
        }
    }

    public void displayBoard() {
        // Muestra el tablero en la consola
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(cells[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean isMoveValid(int row, int col) {
        // Verifica si una celda está disponible y dentro de los límites del tablero
        return row >= 0 && row < SIZE && col >= 0 && col < SIZE && cells[row][col] == '-';
    }

    public void makeMove(int row, int col, char symbol) {
        // Realiza un movimiento en el tablero
        cells[row][col] = symbol;
    }

    public boolean checkWinner(char symbol) {
        // Verifica si hay un ganador en el tablero
        return checkRows(symbol) || checkCols(symbol) || checkDiagonals(symbol);
    }

    private boolean checkRows(char symbol) {
        for (int i = 0; i < SIZE; i++) {
            if (cells[i][0] == symbol && cells[i][1] == symbol && cells[i][2] == symbol) {
                return true;
            }
        }
        return false;
    }

    private boolean checkCols(char symbol) {
        for (int i = 0; i < SIZE; i++) {
            if (cells[0][i] == symbol && cells[1][i] == symbol && cells[2][i] == symbol) {
                return true;
            }
        }
        return false;
    }

    private boolean checkDiagonals(char symbol) {
        return (cells[0][0] == symbol && cells[1][1] == symbol && cells[2][2] == symbol) ||
                (cells[0][2] == symbol && cells[1][1] == symbol && cells[2][0] == symbol);
    }

    public boolean isBoardFull() {
        // Verifica si todas las celdas del tablero están ocupadas
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (cells[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }
    public void resetBoard() {
        initializeBoard();
    }
}
