package edu.Paulina.Reto12.process.process;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
public class RETO12 {

    public class GuardarResultados {

        public void main(String[] args) {
            // Verifica que se proporcionen argumentos en la línea de comandos
            if (args.length < 1) {
                System.out.println("Por favor, proporciona al menos un resultado para guardar.");
                return;
            }

            // Recoge el resultado de la línea de comandos
            String resultado = args[0];

            // Llama al método para guardar el resultado
            guardarResultadoEnArchivo(resultado);
        }

        public void guardarResultadoEnArchivo(String resultado) {
            // Nombre del archivo donde se guardarán los resultados
            String nombreArchivo = "resultados.txt";

            try {
                // Abre el archivo en modo de adición (append)
                FileWriter fileWriter = new FileWriter(nombreArchivo, true);
                PrintWriter printWriter = new PrintWriter(fileWriter);

                // Escribe el resultado en el archivo
                printWriter.println(resultado);

                // Cierra el archivo
                printWriter.close();
                System.out.println("Resultado guardado en " + nombreArchivo);
            } catch (IOException e) {
                System.out.println("Error al intentar guardar el resultado en el archivo.");
                e.printStackTrace();
            }
        }

    }
}
