package edu.Paulina.RETO9.Ayudante.Ayudante.process;
import java.util.Random;
public class Ayudante {
    private int numeroOjos;
    private String colorPiel;
    private String altura;
    private int nivelCreacion;
    private int nivelArreglo;
    private int nivelDestructivo;

    public Ayudante() {
        // Generar características al azar
        Random rand = new Random();
        this.numeroOjos = rand.nextInt(2) + 1; // 1 o 2 ojos
        this.colorPiel = (rand.nextBoolean()) ? "amarilla" : "morada";
        this.altura = (rand.nextBoolean()) ? "mediana" : "alta";
        this.nivelCreacion = rand.nextInt(5) + 1; // Nivel de 1 a 5
        this.nivelArreglo = rand.nextInt(5) + 1;
        this.nivelDestructivo = rand.nextInt(5) + 1;
    }

    @Override
    public String toString() {
        return "Ayudante{" +
                "numeroOjos=" + numeroOjos +
                ", colorPiel='" + colorPiel + '\'' +
                ", altura='" + altura + '\'' +
                ", nivelCreacion=" + nivelCreacion +
                ", nivelArreglo=" + nivelArreglo +
                ", nivelDestructivo=" + nivelDestructivo +
                '}';
    }


}
