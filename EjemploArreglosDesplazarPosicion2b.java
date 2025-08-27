import java.util.Scanner;

public class EjemploArreglosDesplazarPosicion2b {
    public static void main(String[] args) {
        int[] a = new int[10];
        int elemento, posicion, ultimo;
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

        ultimo = a[a.length -1];

        //Desplazar hasta la posicion en el cual vamos a insertar el nuevo elemento
        for (int i = a.length -2; i>=posicion; i--){
            a[i+1] = a[i];
        }
        int[] b = new int[a.length+1];
        System.arraycopy(a, 0, b, 0, a.length);
        a=b;
        a[posicion] = elemento;

        a[a.length -1] = ultimo;
        System.out.println("El arreglo: ");
        for (int i = 0; i < a.length; i++){
            System.out.println( i + " -> " + a[i]);
        }
    }
}
