package edu.Paulina.RETO10.process;

public class Potencia {
    double calcularPotencia(double base, int exponente) {
        return 0;
    }
}

// Clase derivada para potencia con exponente entero
class PotenciaEntero extends Potencia {
    @Override
    double calcularPotencia(double base, int exponente) {
        return Math.pow(base, exponente);
    }
}

// Clase derivada para potencia con exponente fraccionario
class PotenciaFraccionaria extends Potencia {
    @Override
    double calcularPotencia(double base, int exponente) {
        return Math.pow(base, 1.0 / exponente);
    }
}
