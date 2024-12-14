import java.util.Scanner;

public class EjemploArreglosDesplazarPosicion2 {
    public static void main(String[] args) {
        int[] a = new int[10];
        int elemento, posicion;
        Scanner s = new Scanner(System.in);
        // - 1 asi dejamos uno vacio con el valor 0
        for (int i = 0; i < a.length - 1; i++){
            System.out.print("Ingrese el numero: ");
            a[i] = s.nextInt();
        }
        System.out.println();
        //se lo pedimos al usuario
        System.out.println("Nuevo elemento: ");
        elemento = s.nextInt();

        System.out.println("Posición donde agregar de (0 a 9)");
        posicion = s.nextInt();

        //Desplazar hasta la posicion en el cual vamos a insertar el nuevo elemento
        for (int i = a.length -2; i>=posicion; i--){
            a[i+1] = a[i];
        }
        a[posicion] = elemento;
        System.out.println("El arreglo ");
        for (int i = 0; i < a.length; i++){
            System.out.println( i + " -> " + a[i]);
        }
    }
}
