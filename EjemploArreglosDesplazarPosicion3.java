/**
 * La idea es agregar un elemento cualquiera, pero que quede insertado en una posicion especifica de tal forma
 * que se mantenga ordenado
 */


import java.util.Scanner;

public class EjemploArreglosDesplazarPosicion3 {
    public static void main(String[] args) {
        int[] a = new int[7];
        int numero, posicion;

        Scanner s = new Scanner(System.in);
        // -1, dejamos un espacio para poder insertar el número
        /**
         * Llenando el arreglo
         */
        for(int i = 0; i < a.length-1; i++){
            System.out.print("Ingrese un número: ");
            a[i] = s.nextInt();
        }
        /**
         * Insertando el número
         */
        System.out.println();
        System.out.println("Ingrese un número a insertar ");
        numero = s.nextInt();

        posicion = 0;
        while(posicion < 6 && numero > a[posicion]){
            posicion++;
        }
        // Desplazamos los elementos desde el penultimos, ya que el penultimo debe ir en el ultimo y asi bajando de posicion
        for (int i = a.length-2; i >= posicion; i--){
            a[i+1] = a[i];
        }
        // Ahora asignamos
        a[posicion] = numero;
        System.out.println("El nuevo arreglo ordenado: ");
        for (int i = 0; i < a.length; i++){
            System.out.println(i + " => " + a[i]);
        }
    }
}
