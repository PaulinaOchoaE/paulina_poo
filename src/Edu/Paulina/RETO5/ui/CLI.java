package edu.Paulina.RETO5.ui;

import java.util.Scanner;

public class CLI {
    public static void showMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Elige la dificultad que quieras jugar");
        System.out.println("1: Facil");
        System.out.println("2: Intermedio");
        System.out.println("3: Dificil");
        int Nivel = scanner.nextInt();

        switch (Nivel) {
            case 1:
                edu.Paulina.RETO5.process.excepciones.Facil();
                break;
            case 2:
                edu.Paulina.RETO5.process.excepciones.Intermedio();
                break;
            case 3:
                edu.Paulina.RETO5.process.excepciones.Dificil();
                break;
            default:
                System.out.println("Esa opción no existe");
        }

        scanner.close(); // Cierre del scanner después de su uso
    }
}
