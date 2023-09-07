package Edu.Paulina.reto2.pau.piramide.process;

public class Piramide {
    public static void main (String[]args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10 - i; j++) {
                System.out.println("*");
            }
        }
        int[] arg = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i < arg.length; i++) {
            System.out.println(arg[i]);
        }
        for (int element : arg) {
            System.out.println(element);
        }
        boolean found = false;
        int index = 0;
        while(!found) {
            if (arg[index] == 15) {
                found = true;
            }
            index++;
        }   System.out.println(found);
    }


    public static void ImprimirPiramide(int altura) {
    }
}
