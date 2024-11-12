/**
 * La idea es tener un arreglo de enteros de 10 elementos, por ejemplo de 1 a 10 y mostrar un orden
 * determinado, por ej: mostrar el primero con el último en la primera iteracion
 * en la segunda iteracion: el segundo con el penultimo
 * en la tercera el tercero con el antepenultimo
 * y asi sucesivamente
 */


/**
 * En el arreglo a, quiero guardar 10 elementos en el orden de array de numeros
 */

public class EjemploArreglosOrdenPrincipioFinal {
    public static void main(String[] args) {

        int[] numeros = new int[10];
        int[] a = new int[10];

        for(int i = 0; i < numeros.length; i++){
            // Para que muestre a partir de 1 y no desde 0
            numeros[i] = i + 1;
        }
        /**
         * En vez de :   numeros.length/2
         * podemos hacerlo de la siguiente manera
         * Decrementando el i
         */

        int aux = 0;
        for (int i = 0; i < numeros.length -i; i++){
            //Asignamos el iesimo por el principio, pero tambien por el final
            // Para que vaya incrementando
            a[aux++] = numeros[i];
            a[aux++] = numeros[numeros.length -1 -i];

            // Aqui mostramos el primer elemento desde el principio
            //System.out.print(numeros[i] + " ");
            //Para mostrar el largo, para que muestre el 10
            //System.out.println(numeros[numeros.length -1-i]);
            /**
             * Ya se muestra el iesimo por el principio y tambien por el final
             */
        }
        // Ahora mostramos los datos del arreglo
        for (int i = 0; i < a.length; i++){
            System.out.println("i = "+ i +" valor: " + a[i]);
        }
    }
}


/**
 * Vamos a analizar cada una de las partes del código que preguntas:
 *
 * ### Parte 1: `numeros.length / 2`
 *
 * En este caso, `numeros.length` representa el tamaño del arreglo `numeros`, que es 10. Dividirlo entre 2 (`numeros.length / 2`) da como resultado 5. Esta división es clave porque el bucle solo necesita iterar la mitad del tamaño del arreglo para que emparejes cada elemento desde el principio con su correspondiente desde el final.
 *
 * Si recorrieras todo el arreglo, volverías a emparejar valores ya mostrados antes (por ejemplo, el primero con el último, el segundo con el penúltimo, etc.).
 *
 * En resumen:
 * - `numeros.length / 2` asegura que el bucle solo haga cinco iteraciones, suficientes para mostrar todos los pares sin repeticiones.
 *
 * ### Parte 2: `System.out.println(numeros[numeros.length - 1 - i]);`
 *
 * Esta línea muestra los elementos del arreglo empezando desde el final y avanzando hacia el principio, en paralelo con la primera mitad que muestra desde el inicio. La expresión `numeros.length - 1 - i` calcula el índice desde el final del arreglo y va avanzando en cada iteración hacia el principio.
 *
 * Desglosando `numeros.length - 1 - i`:
 * - `numeros.length - 1` es el índice del último elemento (en este caso `10 - 1 = 9`).
 * - Luego se resta `i`, que es la variable de la iteración, para moverse hacia atrás en cada paso del bucle.
 *
 * Por ejemplo, en la primera iteración (`i = 0`):
 * - El índice calculado es `numeros[10 - 1 - 0]`, es decir, `numeros[9]`, que es el último elemento del arreglo.
 *
 * En la segunda iteración (`i = 1`):
 * - El índice calculado es `numeros[10 - 1 - 1]`, o sea, `numeros[8]`, que es el penúltimo elemento del arreglo, y así sucesivamente.
 *
 * Esta expresión permite que cada iteración muestre un elemento desde el principio y otro desde el final, avanzando hacia el centro del arreglo.
 */
