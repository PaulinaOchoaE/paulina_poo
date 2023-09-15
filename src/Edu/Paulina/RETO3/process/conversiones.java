package edu.Paulina.RETO3.process;
import java.util.Scanner;
public class Conversiones {
    private static Scanner scanner = new Scanner(System.in);

    public static void convertirDecimalABinario() {
        System.out.println("Ingrese un número decimal:");
        int decimal = scanner.nextInt();
        scanner.nextLine();

        String binario = Integer.toBinaryString(decimal);
        System.out.println("El número binario es: " + binario);
    }

    public static void convertirDecimalAOctal() {
        System.out.println("Ingrese un número decimal:");
        int decimal = scanner.nextInt();
        scanner.nextLine();

        String octal = Integer.toOctalString(decimal);
        System.out.println("El número octal es: " + octal);
    }

    public static void convertirBinarioADecimal() {
        System.out.println("Ingrese un número binario:");
        String binario = scanner.nextLine();

        int decimal = Integer.parseInt(binario, 2);
        System.out.println("El número decimal es: " + decimal);
    }

    public static void convertirOctalADecimal() {
        System.out.println("Ingrese un número octal:");
        String octal = scanner.nextLine();

        int decimal = Integer.parseInt(octal, 8);
        System.out.println("El número decimal es: " + decimal);
    }

    public static void convertirHexadecimalADecimal() {
        System.out.println("Ingrese un número hexadecimal:");
        String hexadecimal = scanner.nextLine();

        int decimal = Integer.parseInt(hexadecimal, 16);
        System.out.println("El número decimal es: " + decimal);
    }
}
