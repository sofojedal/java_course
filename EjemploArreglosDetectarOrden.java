import java.util.Scanner;

public class EjemploArreglosDetectarOrden {
    public static void main(String[] args) {
        int[] a = new int[7];
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese 7 números");
        for (int i = 0; i < a.length; i++){
            a[i] = s.nextInt();
        }

        /**
         * Debe ser el total -1, porque vamos a compararlo con el elemento siguiente, con el +1
         * Y cuando llegamos al ultimo elemento no es necesario llegar al ultimo elemento sino que con el
         * penultimo esta bien, porque el penultimo se compara con el ultimo
         */
        boolean ascendente = false;
        boolean descendente = false;
        for (int i = 0; i < a.length- 1; i++){
            if (a[i] > a[i+1]){
                descendente = true;
            }
            if (a[i] < a[i+1]){
                ascendente = true;
            }
        }
        if (ascendente == true && descendente == true){
            System.out.println("Arreglo = desordenado");
        }
        if (ascendente == false && descendente == false){
            System.out.println("Arreglo = todos son iguales");
        }
        if (ascendente == true && descendente == false){
            System.out.println("Arreglo = arreglo ordenado de forma ascendente");
        }
        if (ascendente == false && descendente == true){
            System.out.println("Arreglo = arreglo ordenado de forma descendente");
        }
    }
}
