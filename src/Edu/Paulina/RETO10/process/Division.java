package edu.Paulina.RETO10.process;

public class Division {
    abstract class OperacionDivision {
        abstract double dividir(double numerador, double denominador);
    }

    // Clase derivada para división de números reales
    class DivisionReal extends OperacionDivision {
        @Override
        double dividir(double numerador, double denominador) {
            if (denominador != 0) {
                return numerador / denominador;
            } else {
                System.out.println("Error: División por cero.");
                return Double.NaN; // NaN representa "Not a Number"
            }
        }    }
}
