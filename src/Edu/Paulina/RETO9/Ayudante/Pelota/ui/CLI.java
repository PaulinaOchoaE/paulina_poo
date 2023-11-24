package edu.Paulina.RETO9.Ayudante.Pelota.ui;
import edu.Paulina.RETO9.Ayudante.Pelota.process.ui.process.Pelota;

import java.util.Scanner;
public class CLI {
    public static Object showMenu;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al Creador de Pelotas");

        // Menú para elegir el tipo de pelota
        System.out.println("Selecciona el tipo de pelota:");
        System.out.println("1. Fútbol");
        System.out.println("2. Baloncesto");
        System.out.println("3. Tenis");
        int tipo = scanner.nextInt();

        // Menú para elegir el color
        System.out.println("Selecciona el color de la pelota:");
        System.out.println("1. Rojo");
        System.out.println("2. Azul");
        System.out.println("3. Verde");
        int color = scanner.nextInt();

        // Pedir el tamaño de la pelota
        System.out.println("Ingresa el tamaño de la pelota (en centímetros):");
        double tamano = scanner.nextDouble();

        // Crear la pelota
        Pelota pelota = new Pelota(tipo, color, tamano);

        // Mostrar información de la pelota
        System.out.println("¡Pelota creada!");
        System.out.println(pelota);
    }
}
