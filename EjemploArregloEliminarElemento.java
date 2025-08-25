import java.util.Scanner;

public class EjemploArregloEliminarElemento {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] a = new int[10]; // Declarar el arreglo con tamaño 10

        for(int i = 0; i < a.length; i++){
            System.out.print("Ingrese un número: ");
            a[i] = s.nextInt();
        }

        System.out.print("Ingrese una posición para eliminar entre 0 - 9: ");
        int posicion = s.nextInt();

        // Comienza desde la posición que queremos eliminar, a partir de esa posición,
        // empezamos a colocar los elementos siguientes a la posición actual.
        // Desplazamos los elementos un lugar hacia abajo desde la posición eliminar hasta el final de arreglo.

        // Restamos uno para que quede en la posición actual, porque estamos usando el +1,
        // es decir el elemento siguiente lo dejamos en la posición actual.
        // Si no restamos 1, cuando estemos en el último elemento vamos a acceder a un +1,
        // no existe y nos va a lanzar un error de que se desbordó el arreglo.
        // Hasta el penúltimo, de esa forma dejamos el valor que tiene el último, el 10.
        // Es decir, desplazamos hacia abajo.

        // En i++, incrementamos porque tenemos que avanzar hacia arriba a diferencia
        // de cuando queremos agregar una posición.
        // Cuando agregamos, los elementos se desplazan hacia arriba y a partir de arriba hacia abajo.
        // Cuando queremos eliminar, se desplazan hacia abajo, hasta llegar a esta posición para
        // eliminar el elemento en la posición dada, y en esa posición de este elemento toma el siguiente
        // y así sucesivamente, se van desplazando hacia abajo.

        for(int i = posicion; i < a.length - 1; i++){
            // En la posición actual dejamos el siguiente
            a[i] = a[i+1];
        }

        // Mostrar el resultado
        /**
         * for(int i = 0; i < a.length -1; i++){
         *             System.out.println(i + " => " + a[i]);
         *}
         */

        int[] b = new int[a.length-1];
        System.arraycopy(a, 0, b, 0, b.length);
        for (int i = 0; i<b.length; i++){
            System.out.println(i + " =>" + b[i]);
        }
    }
}
