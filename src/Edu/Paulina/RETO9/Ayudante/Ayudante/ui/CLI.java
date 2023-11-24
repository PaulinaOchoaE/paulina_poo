package edu.Paulina.RETO9.Ayudante.Ayudante.ui;

import edu.Paulina.RETO9.Ayudante.Ayudante.process.Ayudante;

public class CLI {
    public static class Main {
        public static void main(String[] args) {
            // Crear cinco ayudantes
            Ayudante[] ayudantes = new Ayudante[5];
            for (int i = 0; i < ayudantes.length; i++) {
                ayudantes[i] = new Ayudante();
            }

            // Imprimir la lista de ayudantes con sus características
            for (int i = 0; i < ayudantes.length; i++) {
                System.out.println("Ayudante " + (i + 1) + ": " + ayudantes[i]);
            }
        }
    }
}
