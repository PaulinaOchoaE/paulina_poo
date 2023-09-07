package Edu.Paulina.reto1.proceso;
/**
 * @author paulina ochoa
 * Esta clase contiene la logica de las operaciones aritmetica basica, suma, resta,multiplicacion y divicion
 */

public class calculadora {
    /**
     *
     * @param num1 primer operando de la suma
     * @param  num2 segundo operando de la suma
     * @return resultado de la num1 y num2
     *
     * Este metodo sirve para sumar dos numeros enteros
     */
    public static int sumaEnteros(int num1,int num2) {
        return num1 + num2;
    }
    public static int restaEnteros(int num1,int num2) {
        return num1 - num2;
    }
    public static int multipliqueEnteros(int num1,int num2) {
        return num1 * num2;
    }
    public static int dividirEnteros(int num1,int num2) {
        return num1 / num2;
    }
    public static int moduloEnteros(int num1,int num2) {
        return num1 / num2;
    }


}






