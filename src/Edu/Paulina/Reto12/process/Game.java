package edu.Paulina.Reto12.process;
import java.util.Scanner;
import edu.Paulina.Reto12.process.Game;
import edu.Paulina.Reto12.process.Player;
import edu.Paulina.Reto12.process.ScoreBoard;
import edu.Paulina.Reto12.process.ComputerPlayer;
import edu.Paulina.Reto12.ui.CLI;
import edu.Paulina.Reto12.ui.Main;
import edu.Paulina.Reto12.process.Board;
import java.io.FileWriter;
import java.io.IOException;
public class Game {
    private Board board;
    private Player player1;
    private Player player2;
    private CLI cli;

    public Game() {
        this.board = new Board();
        this.cli = new CLI();
    }

    public void playOneVsOne() {
        // Obtener nombres de los jugadores
        String player1Name = cli.getPlayerName(1);
        String player2Name = cli.getPlayerName(2);

        // Crear jugadores
        this.player1 = new Player(player1Name,1);
        this.player2 = new Player(player2Name,2);

        // Iniciar el juego
        boolean gameFinished = false;
        Player currentPlayer = player1;

        while (!gameFinished) {
            cli.displayBoard(board);
            int [] move = cli.getPlayerMove(currentPlayer);

            // Realizar el movimiento en el tablero
            board.makeMove(move[0],move[1], currentPlayer.getSymbol());

            // Verificar si hay un ganador
            if (board.checkWinner(currentPlayer.getSymbol())) {
                cli.displayWinner(currentPlayer);
                currentPlayer.incrementScore();
                gameFinished = true;
            } else if (board.isBoardFull()) {
                cli.displayDraw();
                gameFinished = true;
            }

            // Cambiar al siguiente jugador
            currentPlayer = (currentPlayer == player1) ? player2 : player1;
        }
        resetGame();
        saveScores();
    }

    public void playOneVsComputer() {
        // Obtener el nombre del jugador
        String playerName = cli.getPlayerName(1);

        // Crear jugadores
        this.player1 = new Player(playerName, 1);
        this.player2 = new ComputerPlayer();

        // Iniciar el juego
        boolean gameFinished = false;
        Player currentPlayer = player1;

        while (!gameFinished) {
            cli.displayBoard(board);

            int[] move;
            if (currentPlayer instanceof ComputerPlayer) {
                move = ((ComputerPlayer) currentPlayer).getComputerMove(board);
            } else {
                move = cli.getPlayerMove(currentPlayer);
            }

            // Realizar el movimiento en el tablero
            board.makeMove(move[0], move[1], currentPlayer.getSymbol());

            // Verificar si hay un ganador
            if (board.checkWinner(currentPlayer.getSymbol())) {
                cli.displayWinner(currentPlayer);
                currentPlayer.incrementScore();
                gameFinished = true;
            } else if (board.isBoardFull()) {
                cli.displayDraw();
                gameFinished = true;
            }

            // Cambiar al siguiente jugador
            currentPlayer = (currentPlayer == player1) ? player2 : player1;
        }

        // Reiniciar el juego y guardar puntajes
        resetGame();
        saveScores();
    }

    private void resetGame() {
        // Reinicia el tablero
        board.resetBoard();

        // Establece al primer jugador como el jugador actual

    }

    private void saveScores() {
        // Guarda los puntajes en un archivo
        try (FileWriter writer = new FileWriter("scores.txt")) {
            writer.write(player1.getName() + ": " + player1.getScore() + "\n");
            writer.write(player2.getName() + ": " + player2.getScore() + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
