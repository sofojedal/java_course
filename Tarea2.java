import java.util.Scanner;

public class Tarea2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un nombre para la factura:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese un precio de producto:");
        double precio1 = scanner.nextDouble();

        System.out.println("Ingrese un segundo precio de producto:");
        double precio2 = scanner.nextDouble();

        double totalBruto = precio1 + precio2;
        double impuesto = totalBruto * 0.19;
        double totalNeto = totalBruto + impuesto;

        String detalle = "La factura " + nombre + " tiene un total bruto de " + totalBruto
                + ", con un impuesto de " + impuesto
                + " y el monto despues de impuesto es de " + totalNeto;

        System.out.println(detalle);
    }
}
