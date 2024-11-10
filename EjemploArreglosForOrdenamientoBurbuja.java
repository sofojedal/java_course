import java.util.Arrays;
import java.util.Collections;

public class EjemploArreglosForOrdenamientoBurbuja {
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
    public static void main(String[] args) {

        String[] productos = {"Kigston Pendrive 64GB", "Samsung Galaxy", "Disco Duro SSD Samsung Externo",
                "Asus Notebook", "Macbook Air", "Chromecast 4ta generación", "Bicicleta Oxford"};

        int total = productos.length;
        /**
         * Vamos a crear nuestro propio codigo  para
         * sort: ordenamiento
         * arregloInverso
         *
         * ---------------------------------------------------------------------------------------
         *
         * El primer for va a rrecorrer cada elemento y el segundo compara cada elemento
         * con cada uno del resto del arreglo al final lo que hace es comparar todos con todos
         * Cada elemento con cada elemento del arreglo
         *
         */
        //Arrays.sort(productos);
        //arregloInverso(productos);

        /**
         * Colocamos un contador para ver cuantas veces itera
         */

        int contador= 0;

        for(int i = 0; i < total; i++){
            for(int j = 0; j < total; j++){
                //cada elemento del i lo comparamos con el j, usando elemento compar to
                // si i esta en un nivel mas bajo de j, entonces intercambia de posicion
                // dejamos el valor del i en el j y el valor que tiene j en el i
                if(productos[i].compareTo(productos[j]) < 0){
                 // Usamos el auxiliar para guardar la posicion que tenia i
                 String auxiliar = productos[i];
                 productos[i] = productos[j];
                 productos[j] = auxiliar;
                }
                contador ++;
            }
        }
        System.out.println("contador = " + contador);

        //Collections.reverse(Arrays.asList(productos));

        System.out.println("--------Usando for--------");
        for(int i =0; i < total; i++){
            System.out.println("Para indice " + i + " : " + productos[i]);
        }
    }
}
