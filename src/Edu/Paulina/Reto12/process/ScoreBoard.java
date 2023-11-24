package edu.Paulina.Reto12.process;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class ScoreBoard {
    private List<Player> players;

    public ScoreBoard() {
        this.players = new ArrayList<>();
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void addPlayer(Player player) {
        players.add(player);
    }



    public void saveScoreBoardToFile(String fileName) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(players);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void loadScoreBoardFromFile(String fileName) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            players = (List<Player>) ois.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("Scoreboard file not found. Creating a new one.");
            saveScoreBoardToFile(fileName);  // Crea el archivo si no existe
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
    }   }
    public void displayTopPlayers(int numPlayers) {
        // Ordenar jugadores por puntaje descendente
        List<Player> sortedPlayers = new ArrayList<>(players);
        Collections.sort(sortedPlayers, (p1, p2) -> Integer.compare(p2.getScore(), p1.getScore()));

        System.out.println("===== Top Players =====");
        for (int i = 0; i < Math.min(numPlayers, sortedPlayers.size()); i++) {
            Player player = sortedPlayers.get(i);
            System.out.println((i + 1) + ". " + player.getName() + " - Score: " + player.getScore());
        }
        System.out.println("=======================");
    }
}
