package edu.Paulina.Reto12.process;
import java.util.Random;
import edu.Paulina.Reto12.process.Player;
public class ComputerPlayer extends Player {

    public ComputerPlayer() {
        super("Computer",2); // Nombre del jugador controlado por la computadora
        this.setSymbol('O'); // Símbolo del jugador (por ejemplo, 'O' para el jugador controlado por la computadora)
    }

    public int[] getComputerMove(Board board) {
        Random random = new Random();
        int[] move = new int[2];

        do {
            move[0] = random.nextInt(Board.SIZE) + 1; // Fila
            move[1] = random.nextInt(Board.SIZE) + 1; // Columna
        } while (!board.isMoveValid(move[0],move[1]));

        return move;
    }

}
