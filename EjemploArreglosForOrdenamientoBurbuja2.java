public class EjemploArreglosForOrdenamientoBurbuja2 {
    /**
     *
     * SEGUNDA FORMA DEL METODO BURBUJA
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
    public static void main(String[] args) {

        String[] productos = {"Kigston Pendrive 64GB", "Samsung Galaxy", "Disco Duro SSD Samsung Externo",
                "Asus Notebook", "Macbook Air", "Chromecast 4ta generación", "Bicicleta Oxford"};

        int total = productos.length;
        //Arrays.sort(productos);
        //arregloInverso(productos);

        int contador= 0;

        for(int i = 0; i < total; i++){
            // como tenemos j+1, debemos restarle un elemento a total
            // no es necesario volver a ordenar las anteriores posiciones, ya estan ordenadas, por eso restamos i
            // al correrlo vemos como disminuye el contador
            for(int j = 0; j < total-1 -i; j++){
                if(productos[j+1].compareTo(productos[j]) < 0){
                 String auxiliar = productos[j];
                 productos[j] = productos[j+1];
                 productos[j+1] = auxiliar;
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
