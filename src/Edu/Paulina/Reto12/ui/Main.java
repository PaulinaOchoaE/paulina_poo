package edu.Paulina.Reto12.ui;
import edu.Paulina.Reto12.process.Game;
import edu.Paulina.Reto12.process.ScoreBoard;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        CLI cli = new CLI();
        Game game = new Game();
        ScoreBoard scoreBoard = new ScoreBoard();

        scoreBoard.loadScoreBoardFromFile("scoreboard.txt");

        boolean exit = false;

        do {
            System.out.println("===== Seleccionar idioma =====");
            System.out.println("1.Ingles");
            System.out.println("2. Español");
            int idioma = cli.getMenuChoice2();
            if(idioma == 1){
                cli.displayMainMenu();
            }
            if (idioma == 2){
                cli.displayMainMenu2();
            }
            int choice = cli.getMenuChoice();

            switch (choice) {
                case 1:
                    // Modo 1 vs 1
                    game.playOneVsOne();
                    break;
                case 2:
                    // Modo 1 jugador vs Computadora
                    game.playOneVsComputer();
                    break;
                case 3:
                    // Mostrar el marcador
                    cli.displayScoreBoard(scoreBoard);
                    break;
                case 4:
                    // Salir del juego
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;
            }

        } while (!exit);

        // Guardar el marcador en el archivo al cerrar el juego
        scoreBoard.saveScoreBoardToFile("scoreboard.txt");

        System.out.println("Thanks for playing!");
    }

}
