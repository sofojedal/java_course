import java.util.Scanner;

/**
 * Ejemplo de calcular el numero mayor de un arreglo de enteros
 * La idea es llenar los datos del arreglo, ingresar los numeros
 * mediante la consola o utilizando la clase scanner
 */

public class EjemploArreglosNumMayor {
    public static void main(String[] args) {
        int[] a = new int[5];
        System.out.println("Ingrese 5 enteros o numeros: ");
        Scanner s = new Scanner(System.in);

        for(int i = 0; i < a.length; i++){
            a[i] = s.nextInt();
        }
        // Esta variable va a guardar el número mayor
        int max = 0;
        // En este for se calcula el numero mayor
        for (int i = 1; i < a.length; i++){
            max = (a[max] > a[i])? max: i;
        }
        System.out.println("max = " + a[max]);
    }
}
