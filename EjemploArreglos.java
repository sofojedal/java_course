import java.util.Arrays;

public class EjemploArreglos {
    public static void main(String[] args) {

        //Ejemplo de String y como ordenar un arreglo
        // Un arreglo de productos del tipo String = new (el tipo de dato) y [cantidad de elementos]
        String[] productos = new String[7];
        //El corchete puede ir ahi o aca
        // String productos[] = new String[7];

        //---------PARA ASIGNARLES VALOR A 7 ELEMENTOS-----------
        productos[0] = "Kigston Pendrive 64GB";
        productos[1] = "Samsung Galaxy";
        productos[2] = "Disco Duro SSD Samsung Externo";
        productos[3] = "Asus Notebook";
        productos[4] = "Macbook Air";
        productos[5] = "Chromecast 4ta generación";
        productos[6] = "Bicicleta Oxford";

        // La idea es que ordene de forma alfabetica los elementos del arreglo
        Arrays.sort(productos);

        // Para asignar los productos de forma individual
        String producto_1 = productos[0];
        String prodcuto_2 = productos[1];
        String prodcuto_3 = productos[2];
        String prodcuto_4 = productos[3];
        String prodcuto_5 = productos[4];
        String prodcuto_6 = productos[5];
        String prodcuto_7 = productos[6];

        // esos 7 elementos estan en null si no se le asigna nada
        System.out.println("productos[0] = " + producto_1);
        System.out.println("productos[1] = " + prodcuto_2);
        System.out.println("productos[2] = " + prodcuto_3);
        System.out.println("productos[3] = " + prodcuto_4);
        System.out.println("productos[4] = " + prodcuto_5);
        System.out.println("productos[5] = " + prodcuto_6);
        System.out.println("productos[6] = " + prodcuto_7);

        int[] numeros = new int[4];

        //Para asignar valores a los numeros del arreglo
        numeros[0] = 10;
        // Para hacer un unboxing, convertir un tipo de dato Integer a uno String
        numeros[1] = Integer.valueOf("2");
        //Para que pueda ser long, se debe hacer un cast, siempre y cuando el valor no exceda al maximo el numero
        numeros[2] = (int)35L;
        numeros[3] = -1;
        //Para agregar o forzar un nuevo elemento al arreglo, lo permite, pero al correrlo manda una excepción
        // Aparece: igual que para leer un valor que no existe
        // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4

        // Por lo tanto no corresponde, no se debe asignar mas que la cantidad máxima
        //numeros[4] = 5;

        Arrays.sort(numeros);

        int i = numeros[0];
        int j = numeros[1];
        int k = numeros[2];
        //¿Como podemos obtener el último elemento del arreglo?
        int l = numeros[numeros.length - 1];
        // el length me retorna la cantidad de elementos que es 4
        // Siempre colocar el total de elementos -1
        // Es lo mismo que
        //int m = numeros[4];
        // ya que 4 - 1 es 3, el array comienza con posicion 0

        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        System.out.println("l = " + l);


    }
}
