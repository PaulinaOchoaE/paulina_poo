package edu.Paulina.RETO10.process;

public class multiplicacion {

    abstract class OperacionMultiplicacion {
        abstract double multiplicar(double factor1, double factor2);
    }

    // Clase derivada para multiplicación de números reales
    class MultiplicacionReal extends OperacionMultiplicacion {
        @Override
        double multiplicar(double factor1, double factor2) {
            return factor1 * factor2;
        }
    }

    // Clase derivada para multiplicación de números enteros
    class MultiplicacionEntera extends OperacionMultiplicacion {
        @Override
        double multiplicar(double factor1, double factor2) {
            return (int)factor1 * (int)factor2; // Se realiza la multiplicación como enteros
        }
}   }
