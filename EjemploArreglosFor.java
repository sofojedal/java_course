import java.util.Arrays;

public class EjemploArreglosFor {
    public static void main(String[] args) {

        String[] productos = new String[7];

        int total = productos.length;

        productos[0] = "Kigston Pendrive 64GB";
        productos[1] = "Samsung Galaxy";
        productos[2] = "Disco Duro SSD Samsung Externo";
        productos[3] = "Asus Notebook";
        productos[4] = "Macbook Air";
        productos[5] = "Chromecast 4ta generación";
        productos[6] = "Bicicleta Oxford";

        //Ordenamos antes de mostrar los elementos
        Arrays.sort(productos);

        /**
         * 0, es menos a total?
         * Si, suma 1
         * 1, menos a total?
         * Si, suma y asi sucesivamente
         */

        /**
         * El for itera con limites, cuando se conoce la cantidad de elementos
         */
        System.out.println("--------Usando for--------");
        for(int i =0; i < total; i++){
            System.out.println("Para indice " + i + " : " + productos[i]);
        }
        /**
         * ¿Como seria usando foreach?
         * Itera de forma automatica 1 por 1
         */

        System.out.println("--------Usando foreach--------");
        for(String prod:productos){
            System.out.println("prod = " + prod);
        }

        /**
         * Como seria el ejemplo con while
         * while solamente evalua una condición
         */
        System.out.println("--------Usando While------------");
        int i = 0;
        while (i < total){
            System.out.println("Para indice " + i + " : " + productos[i]);
            i++;
        }


        /**
         * Como seria con el do while
         * Itera una vez
         * Muestra el 0
         * Y después pregunta
         */
        System.out.println("--------Usando ---- do while-------");
        int j = 0;
        do{
            System.out.println("Para indice " + j + " : " + productos[j]);
            j++;
        }while(i > total);

        System.out.println("--------Llenando un for-------");
        int[] numeros = new int[10];

        int totalNumeros = numeros.length;
        // llenar los datos en el arreglo
        for (int k = 0; k < totalNumeros; k++) {
            numeros[k] = k * 3; // Asigna el valor calculado a cada elemento
        }

        // mostrar los datos
        for (int k = 0; k < totalNumeros; k++) {
            System.out.println("numeros[" + k + "] = " + numeros[k]);
        }
    }
}
