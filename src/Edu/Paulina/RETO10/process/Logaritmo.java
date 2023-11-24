package edu.Paulina.RETO10.process;

public abstract class Logaritmo {
    abstract double calcularLogaritmo(double numero);

    class LogaritmoNatural extends Logaritmo {
        @Override
        double calcularLogaritmo(double numero) {
            return Math.log(numero);
        }
    }

    // Clase derivada para logaritmo en base 10
    class LogaritmoBase10 extends Logaritmo {
        @Override
        double calcularLogaritmo(double numero) {
            return Math.log10(numero);
        }
    }

    // Clase principal
    public class Main {
        public void main(String[] args) {
            Logaritmo logNatural = new Logaritmo() {
                @Override
                double calcularLogaritmo(double numero) {
                    return 0;
                }
            };
            Logaritmo logBase10 = new LogaritmoBase10();

            double numero = 10.0;

            System.out.println("Logaritmo natural de " + numero + ": " +
                    logNatural.calcularLogaritmo(numero));

            System.out.println("Logaritmo en base 10 de " + numero + ": " +
                    logBase10.calcularLogaritmo(numero));
        }

}}
