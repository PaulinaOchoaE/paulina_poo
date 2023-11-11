package edu.Paulina.Reto12.process.ui;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public class GuardarResultados {

        public void main(String[] args) {
            // Supongamos que tienes algunos resultados para guardar
            String resultado1 = "Resultado 1";
            String resultado2 = "Resultado 2";
            String resultado3 = "Resultado 3";

            // Llamamos a la función para guardar los resultados en un archivo
            guardarResultadosEnArchivo(resultado1, resultado2, resultado3);

            System.out.println("Resultados guardados con éxito.");
        }

        public void guardarResultadosEnArchivo(String... resultados) {
            try {
                // Especifica la ruta del archivo donde quieres guardar los resultados
                String rutaArchivo = "resultados.txt";

                // Crea FileWriter y BufferedWriter para escribir en el archivo
                FileWriter fileWriter = new FileWriter(rutaArchivo);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

                // Escribe cada resultado en una nueva línea del archivo
                for (String resultado : resultados) {
                    bufferedWriter.write(resultado);
                    bufferedWriter.newLine();
                }

                // Cierra BufferedWriter
                bufferedWriter.close();

            } catch (IOException e) {
                // Manejo de excepciones en caso de error al escribir en el archivo
                e.printStackTrace();
            }
        }    }
}
