package edu.Paulina.RETO10.ui;

import edu.Paulina.RETO10.process.Division;
import edu.Paulina.RETO10.process.RaizCuadrada;

import java.io.PrintStream;

public class Main {
    public static void main(String[] args) {
        RaizCuadrada raizEntero = new RaizCuadrada() {
            @Override
            public double calcularRaizCuadrada(double numero) {
                return 0;
            }
        };
        RaizCuadrada raizDouble = new RaizCuadrada() {
            @Override
            protected double calcularRaizCuadrada(double numero) {
                return 0;
            }
        };


        int numeroEntero = 16;
        double numeroDouble = 25.0;

        System.out.println("Raíz cuadrada de " + numeroEntero + ": " + raizEntero.calcularRaizCuadrada(numeroEntero));
        PrintStream printf = System.out.printf("El resultado de esta raiz cuadrada", numeroDouble, raizDouble.calcularRaizCuadrada((int) numeroDouble));
    }
}


