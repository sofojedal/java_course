import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class EjemploArreglosForInversoMutable {
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

        Arrays.sort(productos);
        arregloInverso(productos);

        /**
         * Para realizar un inverso tambien se puede implementar con el api de collection de java, asi:
         * Este requiere de un tipo list de java
         * Convertir los productos String a una lista
         */

        /**
         * Con sort lo ordena y con reverse le da vuelta
         */
        Collections.reverse(Arrays.asList(productos));

        System.out.println("--------Usando for--------");
        for(int i =0; i < total; i++){
            System.out.println("Para indice " + i + " : " + productos[i]);
        }
        /**
         * La idea es modificar los datos
         * Como una regla de 3, dando vuelta
         *
         *
         * total/2 - punto de quiebre, punto de inflexion
         * Que ordene hasta la mitad, porque si despues sigue ordenando
         * mas alla de la mitad empieza a revertir lo que habia hecho anteriormente
         *
         * al final empieza a revertir el orden inverso, por lo tanto queda tal cual como estaba antes
         * pero si dividimos en 2 el total ahi tenemos la magia
         */

        /**
         *
         * for(int i = 0; i < total/2; i++){
         *             String actual = productos[i];
         *             String inverso = productos[total-1-i];
         *             // En la posicion actual colocamos el inverso
         *             productos[i] = inverso;
         *             // En la posicion inversa colocaos el actual
         *             productos[total-1-i] = actual;
         *         }
         *
         *         System.out.println("--------Usando for--------");
         *         for(int i =0; i < total; i++){
         *             System.out.println("Para indice " + i + " : " + productos[i]);
         *         }
         *
         *         int total2 = productos.length;
         *         for (int i = 0; i < total2; i++){
         *             String actual = productos[i];
         *             String inverso = productos[total-1-i];
         *             productos[i] = inverso;
         *             productos[total-1-i] = actual;
         *             total2--;
         *         }
         *
         */


    }
}
