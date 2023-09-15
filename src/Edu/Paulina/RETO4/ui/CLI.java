package edu.Paulina.RETO4.ui;

import java.util.Scanner;
import edu.Paulina.RETO4.process.calculo;
public class CLI {
    public static void showMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Elige una opcion");
        System.out.println("1.Trimestre que vende mas cafe ");
        System.out.println("2.Trimestre que vende mas en general");
        System.out.println("3 salir ");
        int opcionMenu = scanner.nextInt();

        System.out.println("Cuantos sabores o registros quieres analizar digita el numero?");
        int numeroSabores = scanner.nextInt();

        int[] trimestre1;
        int[] trimestre2;
        int[] trimestre3;
        int[] trimestre4;
        String[] sabores;
        sabores = new String[numeroSabores];
        trimestre1 = new int[numeroSabores];
        trimestre2 = new int[numeroSabores];
        trimestre3 = new int[numeroSabores];
        trimestre4 = new int[numeroSabores];

        for (int i = 0; i < numeroSabores; i++) {
            scanner.nextLine();

            System.out.println("Cual es el sabor?");
            String sabor = scanner.nextLine();

            System.out.println("Dijite el valor del trimestre 1 ");
            int trimestre1Input = scanner.nextInt();

            System.out.println("Dijite el valor del trimestre 2 ");
            int trimestre2Input = scanner.nextInt();

            System.out.println("Dijite el valor del trimestre 3 ");
            int trimestre3Input = scanner.nextInt();

            System.out.println("Dijite el valor del trimestre 4 ");
            int trimestre4Input = scanner.nextInt();

            sabores[i] = sabor;
            trimestre1[i] = trimestre1Input;
            trimestre2[i] = trimestre2Input;
            trimestre3[i] = trimestre3Input;
            trimestre4[i] = trimestre4Input;
        }

        switch (opcionMenu) {
            case 1:
                 edu.Paulina.RETO4.process.calculo.trimestreVendeMasPorSabor(trimestre1,trimestre2,trimestre3,trimestre4,sabores,numeroSabores);
                break;
            case 2:
                edu.Paulina.RETO4.process.calculo.trimestreVendeMasPorAnno(trimestre1,trimestre2,trimestre3,trimestre4,numeroSabores);
                break;
            case 3:
                break;
            default:
                System.out.println("esa opcion no existe");
        }
    }
}
