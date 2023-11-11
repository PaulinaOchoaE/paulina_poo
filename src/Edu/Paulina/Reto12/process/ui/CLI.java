package edu.Paulina.Reto12.process.ui;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class CLI {
    public static void main(String[] args) {
        // Crear un escáner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese los resultados
        System.out.println("Ingrese el Resultado 1:");
        String resultado1 = scanner.nextLine();

        System.out.println("Ingrese el Resultado 2:");
        String resultado2 = scanner.nextLine();

        System.out.println("Ingrese el Resultado 3:");
        String resultado3 = scanner.nextLine();

        // Llamamos a la función para guardar los resultados en un archivo
        guardarResultadosEnArchivo(resultado1, resultado2, resultado3);

        // Cerramos el escáner
        scanner.close();

        System.out.println("Resultados guardados con éxito.");
    }

    public static void guardarResultadosEnArchivo(String... resultados) {
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
    }
}
