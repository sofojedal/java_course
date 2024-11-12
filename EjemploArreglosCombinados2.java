/**
 * Ahora la idea es copiar de cada arreglo de a y b, no solamente 1 elemento, sino 2 elementos o mas
 * Por ejemplo que vaya 2 elementos de a y 2 elementos de b - por cada iteracion
 * O 3 de a y 3 de b
 * los tamaños deben ser multiplos de cada uno,
 * por ej: si son 3 arreglos, el tamaño debe ser multiplo de 3
 */


/**
 * si es 10, todo sebe ser multiplo
 * si es 9, debe ser multiplo, por eso se cambio todo a 3
 */

public class EjemploArreglosCombinados2 {
    public static void main(String[] args) {
        int[] a, b, c;
        a = new int[9];
        b = new int[9];
        c = new int[18];

        for (int i = 0; i < a.length; i++){
            a[i] = i+1;
        }
        for (int i = 0; i < b.length; i++){
            b[i] = (i+1)*5;
        }
        /**
         * Vamos a agregar 2 de cada uno, por lo tanto tenemos que incrementar
         * el i en 2, que vaya sumando de a 2, que guarde 2 de a y 2 de b, eso
         * aumenta a 20
         */
        int aux = 0;
        for (int i = 0; i < b.length; i+=3){
            for (int j = 0; j < 3; j++){
                // i+j, porque cuando i vale 0, j también vale 0
                // Lo guardamos en la posicion 0 del arreglo 0
                c[aux++] = a[i+j];
            }
            for (int j = 0; j < 3; j++){
                c[aux++] = b[i+j];
            }
        }
        for (int i = 0; i < c.length; i++){
            System.out.println( i + ": " +c[i]);
        }
    }
}
