import java.util.Arrays;

/**
 * Como iterar o recorrer un arreglo de forma inversa
 */

public class EjemploArreglosForInverso {
    public static void main(String[] args) {

        //String[] productos = new String[7];
        String[] productos = {"Kigston Pendrive 64GB", "Samsung Galaxy", "Disco Duro SSD Samsung Externo",
                "Asus Notebook", "Macbook Air", "Chromecast 4ta generación", "Bicicleta Oxford"};

        int total = productos.length;

        //productos[0] = "Kigston Pendrive 64GB";
        //productos[1] = "Samsung Galaxy";
        //productos[2] = "Disco Duro SSD Samsung Externo";
        //productos[3] = "Asus Notebook";
        //productos[4] = "Macbook Air";
        //productos[5] = "Chromecast 4ta generación";
        //productos[6] = "Bicicleta Oxford";

        Arrays.sort(productos);

        System.out.println("--------Usando for--------");
        for(int i =0; i < total; i++){
            System.out.println("Para indice " + i + " : " + productos[i]);
        }
        System.out.println();

        System.out.println("---------------------------------------");
        System.out.println("-------Usando for inverso---------------");

        for(int i = 0; i < total; i++){
            System.out.println("para i = " + (total-1-i) + " valor: " + productos[total-1-i]);
        }
        /**
         * Con total - 1 se obtiene el ultimo elemento - imprime : Bicicleta Oxford
         * Pero debemos ir decreciendo
         * Despues le restamos el i para que me muestre el 5, luego 4, 3, 2, 1, 0
         *
         *
         *
         * Osea:
         *
         * Para i = 0, esta expresión se convierte en total - 1 - 0,
         * lo cual da total - 1, el índice del último elemento.
         *
         * Para i = 1, el índice es total - 1 - 1, lo cual da total - 2, el penúltimo elemento.
         *
         * Y así sucesivamente, hasta que i alcanza total - 1, y la expresión se convierte
         * en total - 1 - (total - 1), que es 0, el índice del primer elemento.
         */

        System.out.println("-------Usando for inverso 2-------------");
        for (int i = total-1; i >= 0; i--){
            System.out.println("para i = " + i + ", valor " + productos[i]);
        }

    }
}
