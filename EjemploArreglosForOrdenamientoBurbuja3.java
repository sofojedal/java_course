public class EjemploArreglosForOrdenamientoBurbuja3 {
    /**
     *
     * ORDENAR UN ARREGLO DE ENTEROS
     */
    public static void arregloInverso(String[] arreglo){
        int total2 = arreglo.length;
        int total = arreglo.length;
        for (int i = 0; i < total2; i++){
            String actual = arreglo[i];
            String inverso = arreglo[total-1-i];
            arreglo[i] = inverso;
            arreglo[total-1-i] = actual;
            total2--;
        }
    }

    /**
     * sortBurbuja, sera del tipo generico, para que podamos reutilizar este codigo e implementarlo cuantas veces queramos
     */

    public static void sortBurbuja(Object[] arreglo){

        int total = arreglo.length;
        int contador= 0;

        for(int i = 0; i < total -1; i++){
            for(int j = 0; j < total -1 -i; j++){
                //Debemos castear a un tipo Integer el metodo: numeros[j+1]
                // Comparable es tipo Integer

                /**
                 * Para que el metodo cambie de menor a mayor
                 *
                 * if(((Comparable)arreglo[j+1]).compareTo(arreglo[j]) < 0){
                 *
                 *
                 * pero si queremos que cambie de mayor a menor lo unico que toca cambiar es el signo
                 *
                 * if(((Comparable)arreglo[j+1]).compareTo(arreglo[j]) > 0){
                 *
                 */
                if(((Comparable)arreglo[j+1]).compareTo(arreglo[j]) > 0){
                    Object auxiliar = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = auxiliar;
                }
                contador ++;
            }
        }

        System.out.println("contador = " + contador);

    }

    public static void main(String[] args) {

        String[] productos = {"Kigston Pendrive 64GB", "Samsung Galaxy", "Disco Duro SSD Samsung Externo",
                "Asus Notebook", "Macbook Air", "Chromecast 4ta generación", "Bicicleta Oxford"};

        int total = productos.length;
        sortBurbuja(productos);

        System.out.println("--------Usando for--------");
        for(int i =0; i < total; i++){
            System.out.println("Para indice " + i + " : " + productos[i]);
        }


        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        /**
         * Array de numeros enteros
         */
        Integer[] numeros = new Integer[4];

        numeros[0] = 10;
        numeros[1] = Integer.valueOf("2");
        numeros[2] = (int)35L;
        numeros[3] = -1;

        /**
         * en este caso numeros es del tipo entero primitivo
         * por ello espera recibi una instancia
         * Es un arreglo de enteros no es un tipo entero
         *
         * Una forma es cambiar de:
         * int[] numeros = new int[4];
         * a
         * Tipo integer:
         * Integer[] numeros = new Integer[4];
         */
        sortBurbuja(numeros);

        // De esta forma ya deberia estar ordenado el
        for(int i = 0; i < numeros.length; i++){
            System.out.println("numeros = " + i+ " : " + numeros[i]);
        }
    }
}
