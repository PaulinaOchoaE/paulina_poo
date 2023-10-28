package edu.Paulina.RETO10.process;

public abstract class RaizCuadrada {
    public Object calcularRaizCuadrada(int numeroEntero) {
        return null;
    }

    protected abstract double calcularRaizCuadrada(double numero);

    class RaizCuadradaEntero extends RaizCuadrada {
        @Override
        double calcularRaizCuadrada(double numero) {
            return Math.sqrt((double) numero);
        }
    }

    // Clase derivada para números de punto flotante
    class RaizCuadradaDouble extends RaizCuadrada {
        @Override
        double calcularRaizCuadrada(double numero) {
            return Math.sqrt(numero);
        }
}   }
