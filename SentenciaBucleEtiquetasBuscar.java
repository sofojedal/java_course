public class SentenciaBucleEtiquetasBuscar {
    public static void main(String[] args) {
        String frase = "trigo tres tristes tigres tragan trigotrigo en un trigaltrigo";
        String palabra = "trigo";

        int maxPalabra = palabra.length();
        int maxFrase = frase.length() - maxPalabra;

        int max = frase.length();
        int cantidad = 0;
        char letra = 'g';
        // La etiqueta indica que el continue es para el for padre, osea el primer for
        buscar:
        for (int i = 0; i <= maxFrase;){
            /**
             * Necesitamos otra variable distinta a la "i", para poder empezar a recorrer la
             * palabra en la frase de forma independiente a la iteración prinicipal, al for
             * principal sin afectar a "i", sin interrumpir a "i", por eso k toma el valor de "i"
             * y lo que se incrementa es "k", toma el valor inicial de "i", y a partir de ese valor inicial
             * comenzamosa a recorrer la palabra pero en la frase
             *
             *
             *En el siguiente for, primero incrementa el "j", cuando encuentra el caracter que es igual a la palbra
             * Si son iguales se incrementa el "j", y comienza a buscar el siguiente, por ejemplo
             * t - r - y compara la r, pero para poder incrementar la r con la frase, tambié
             * tiene que inccrementar el k, para que vayan de forma sincronizada, porque si utilizamos
             * el "i", permanece permanece de forma estatica, con el valor por ejemplo 0, el valor inicial que seria la -t--
             * por eso usos la "k", se incrementa, si son iguales en el caso de la t - r - continua, mueve el cursor
             * incrementa el "j", y tmabién incrementa el "k", se mueve a "i" en frase y en palabra "j",  asi encuentra una palabra
             * y la encuentra.
             *
             * el k, recorre la palabra de forma independiente
             */
            int k = i;
            for (int j = 0; j < maxPalabra; j++) {
                /**
                 * charAt: para obtener el carácter en una posición específica de una cadena de texto y luego incrementar el valor de k en 1.
                 */
                if (frase.charAt(k++) != palabra.charAt(j)) {
                    i++;
                    continue buscar;
                }
            }
            cantidad++;
            i = i + maxPalabra;
        }
        System.out.println("Encontrado = " + cantidad + " veces el caracter " + ": " + palabra + ", en la frase");
    }

}
