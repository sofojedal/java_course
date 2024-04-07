import java.util.Scanner;

public class Tarea_num_min_10 {
    public static void main(String[] args) {

        /**
         * Crear una clase con el método main donde el desafío es buscar
         * el número menor de mínimo 10 valores enteros, usando la clase
         * Scanner ingresar la cantidad de números a comparar, luego
         * utilizando una sentencia for iterar el numero de veces
         * (ingresado) para pedir el numero entero, entonces se
         * requiere:
         *
         * Calcular el menor número e imprimir el valor.
         *
         * Si el menor número es menor que 10, imprimir "El
         * número menor es menor que 10!". si no, imprimir " el
         * numero menor es igual o mayor que 10!".
         */

        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese 10 numeros");

        int num1 = s.nextInt();
        int num2 = s.nextInt();
        int num3 = s.nextInt();
        int num4 = s.nextInt();
        int num5 = s.nextInt();
        int num6 = s.nextInt();
        int num7 = s.nextInt();
        int num8 = s.nextInt();
        int num9 = s.nextInt();
        int num10 = s.nextInt();

        int[] numeros = {num1, num2, num3, num4, num5, num6, num7, num8, num9, num10};

        int menor = numeros[0];
        int mayor = numeros[0];

        for (int i = 0; i < numeros.length; i++){
            if (numeros[i] < menor){
                menor = numeros[i];
            } else if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
        }

        System.out.println("El numero menor es " + menor);
        System.out.println("El numero mayor es " + mayor);
    }
}
