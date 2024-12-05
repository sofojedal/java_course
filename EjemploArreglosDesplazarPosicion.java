import java.util.Scanner;

public class EjemploArreglosDesplazarPosicion {
    public static void main(String[] args) {
        int[] a = new int[10];
        int ultimo;
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < a.length; i++){
            System.out.print("Ingrese el numero: ");
            a[i] = s.nextInt();
        }
        // haremos un salto de linea
        System.out.println();
        // con esto obtenemos el ultimo elemento
        ultimo = a[a.length-1];

        // y empezamos a cambiar deposiciones de arriba hacia abajo
        // -1: es el ultimo, -2: es el penultimo
        // corre mientras sea mayor o igual a 0, e i--, va decrementando
        for (int i = a.length -2; i>=0; i--){
            // el valor actual se lo asignamos a la posicion i +1
            // la posicion actual del iterador se lo pasamos al a+1
            a[i+1] = a[i];
        }
        // llega a 0 y valor de ultimo se lo pasa a la segunda posicion, es decir al indice 1
        // pero en la posicion 0 tiene que ir el 10, como lo tenemos respaldado en la posicion 0
        // pasamos el ultimo valor
        // Entonces el ultimo valor pasa a ser el primer valor
        a[0] = ultimo;
        // El arreglo final
        System.out.println("El arreglo ");
        for (int i = 0; i < a.length; i++){
            // y mostramos cada elemento
            System.out.println(a[i]);
        }
    }
}
