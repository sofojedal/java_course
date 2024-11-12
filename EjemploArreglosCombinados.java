/**
 * La idea ahora es tener 2 arreglos y a partir de este crear uno tercero que
 * contenga los datos combinados de los otros 2 arreglos
 *
 * Ej: que contenga el primero del arreglo a, con el primero del arreglo b, luego contenga el segundo del a
 * con el segundo del b
 * Despues el tercero del a, con el tercero del b
 * y asi sucesivamente
 * Por lo tanto debe tener el tamaño del tamaño de los dos arreglos
 *
 * que a y b tengan un tamaño de 10
 * c debe tener de 20, para almacenar los elementos de ambos arreglos
 */

public class EjemploArreglosCombinados {
    public static void main(String[] args) {
        int[] a, b, c;
        a = new int[10];
        b = new int[10];
        c = new int[20];        // O se puede sumar:         c = new int[a.length + b.length];

        for (int i = 0; i < a.length; i++){
            a[i] = i+1;
        }
        for (int i = 0; i < b.length; i++){
            b[i] = (i+1)*5;
        }
        /**
         * 10 o       a.length         o           b.length
         * 10, porque primero vamos a recorrer los elementos de a y b
         * y en cada iteracion vamos a gregar 2 elemtos, uno de a y
         * otro de c, por lo tanto en 10 iteraciones vamos a tener 20
         *
         *
         * Debemos colocar tambien una variable auxiliar
         * que parta en 0, pero esta se va incrementando en cada iteracion 2 veces
         * una por cada indice, para que vaya recorriendo ambos arreglos a y b
         */
        int aux = 0;
        for (int i = 0; i < b.length; i++){
            c[aux++] = a[i];
            c[aux++] = b[i];
        }
        for (int i = 0; i < c.length; i++){
            System.out.println( i + ": " +c[i]);
        }
    }
}
