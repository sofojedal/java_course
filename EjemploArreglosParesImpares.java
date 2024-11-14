import java.util.Scanner;

public class EjemploArreglosParesImpares {
    public static void main(String[] args) {
        /**
         * Creamos el arreglo con 10 elementos, que se llama a
         * otros para pares e impares
         * Se inicializa en 0 un contador para pares e impares
         */
        int[] a, pares, impares;
        int totalPares = 0, totalImpares = 0;
        a = new int[10];
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese 10 numeros: ");
        for (int i = 0; i < a.length; i++){
            a[i] = s.nextInt();
         }
        /**
         * Llenamos el arreglo a
         * Luego calculamos la cantidad de los elementos que son pares e impares
         */
        for (int i = 0; i < a.length; i++){
            // Si su resto es 2 ---- a[i]%2 == 0, e spar
            if (a[i]%2 == 0){
                totalPares++;
            }else {
                totalImpares++;
            }
        }
        /**
         * Eso para poder crear las intancias del arreglo
         * [] con la cantidad de elementos
         */
        pares = new int[totalPares];
        impares = new int[totalImpares];
        int j = 0;   // donde se almacena pares
        int k = 0;   //impares
        /**
         * De acuerdo a eso volvemos a recorrer y llenamos pares e impares, cada uno con sus propios elementos
         * Y cada uno tiene su propio contador
         * j para pares
         * k para impares
         */
        for (int i = 0; i < a.length; i++){
            if (a[i]%2 == 0){
                pares[j++] = a[i];
            }else{
                impares[k++] = a[i];
            }
        }
        /**
         * Luego mostramos los resultados de cada uno
         */
        System.out.println("Pares: ");
        for (int i = 0; i < pares.length; i++){
            System.out.print(pares[i] + " ");
        }
        System.out.println();
        System.out.println("\r\nImpares: ");
        for (int i = 0; i < impares.length; i++){
            System.out.print(impares[i] + " ");
        }
        System.out.println();
    }
}
