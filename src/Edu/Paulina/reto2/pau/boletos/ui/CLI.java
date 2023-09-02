package Edu.Paulina.reto2.pau.boletos.ui;
import Edu.Paulina.reto2.pau.boletos.process.boletos;
import java.util.Scanner;
public class CLI {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        showMenu();
    }

    public static void showMenu() {
        boletos boletos = new boletos();

        System.out.println("Bienvenido a la máquina de boletos del parque de diversiones");

        while (true) {
            /**
             * Utilize println para diseñar el menu de elecciones
             */
            System.out.println("Seleccione el tipo de boleto:");
            System.out.println("A - Adulto");
            System.out.println("N - Niño");
            System.out.println("I - Adulto Mayor con INAPAM");
            System.out.println("B - Adulto Mayor sin credencial");
            System.out.println("Q - Salir");

            String opcion = scanner.nextLine();

            switch (opcion) {
                /**
                 * Al poner la letra del case deseado, este te dara el precio del boleto
                 */
                case "A":
                    boletos.venderBoleto("Adulto");
                    break;
                case "N":
                    boletos.venderBoleto("Niño");
                    break;
                case "I":
                    boletos.venderBoleto("Adulto Mayor con INAPAM");
                    break;
                case "B":
                    boletos.venderBoleto("Adulto Mayor sin credencial");
                    break;
                case "Q":
                    System.out.println("Gracias por usar la máquina de boletos. ¡Disfrute su dia!");
                    return;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
            /**
             * Aqui al utilizar la letra S te devollvera al menu y usando la letra N se terminara el programa
             */
            System.out.println("¿Hay otro cliente que solicite boleto? (S/N)");
            String respuesta = scanner.nextLine();

            if (!respuesta.equalsIgnoreCase("S")) {
                System.out.println("Gracias por usar la máquina de boletos. ¡Hasta luego!");
                break;
            }
        }
    }
}
