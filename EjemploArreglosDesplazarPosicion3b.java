/**
 * La idea es agregar un elemento cualquiera, pero que quede insertado en una posicion especifica de tal forma
 * que se mantenga ordenado
 */


import java.util.Scanner;

public class EjemploArreglosDesplazarPosicion3b {
    public static void main(String[] args) {
        int[] a = new int[7];
        int numero, posicion, ultimo;

        Scanner s = new Scanner(System.in);
        // -1, dejamos un espacio para poder insertar el número
        /**
         * Llenando el arreglo
         */
        for(int i = 0; i < a.length; i++){
            System.out.print("Ingrese un número: ");
            a[i] = s.nextInt();
        }
        /**
         * Insertando el número
         */
        System.out.println();
        System.out.println("Ingrese un número a insertar ");
        numero = s.nextInt();

        ultimo = a[a.length - 1];
        posicion = 0;
        while(posicion < 6 && numero > a[posicion]){
            posicion++;
        }
        // Desplazamos los elementos desde el penultimos, ya que el penultimo debe ir en el ultimo y asi bajando de posicion
        for (int i = a.length-2; i >= posicion; i--){
            a[i+1] = a[i];
        }
        //Para esta nueva versiòn creamos un nuevo arreglo
        int[] b = new int[a.length + 1];
        System.arraycopy(a, 0, b, 0, a.length);

        if (numero > ultimo){
            b[b.length-1] = numero;
        }else {
            b[b.length - 1] = ultimo;
            // Ahora asignamos
            b[posicion] = numero;
        }
        System.out.println("El nuevo arreglo ordenado: ");
        for (int i = 0; i < b.length; i++){
            System.out.println(i + " => " + b[i]);
        }
    }
}
