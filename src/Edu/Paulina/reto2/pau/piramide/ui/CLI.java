package Edu.Paulina.reto2.pau.piramide.ui;

import Edu.Paulina.reto2.pau.piramide.process.Piramide;

import java.util.Scanner;

public class CLI {
    public static void showMenu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa una altura de la piramide");
        int altura = scanner.nextInt();

        Piramide.ImprimirPiramide(altura);
    }
}

