import java.util.Scanner;

public class EjemploArregloBuscarString {
    public static void main(String[] args) {
        String[] a = new String[4];
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            System.out.print("Ingrese un nombre: ");
            a[i] = s.nextLine(); // Permite nombres con espacios
        }
        System.out.println("\r\nIngrese un nombre a buscar: ");
        String nombre = s.nextLine(); // Permite buscar nombres con espacios también
        int i = 0;
        for (; i < a.length && !a[i].equalsIgnoreCase(nombre); i++) {
        }
        if (i == a.length) {
            System.out.println("Nombre no encontrado");
        } else {
            System.out.println("Encontrado en la posición: " + i);
        }
    }
}
