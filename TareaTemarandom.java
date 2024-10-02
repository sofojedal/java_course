import java.util.Scanner;

public class TareaTemarandom {
    public static void main(String[] args) {
        // Pedir el radio de un circulo y calcular su área
        // Usar la formula:       area = PI*r^2  (Constante PI multiplicado por el radio al cuadrado).

        // Crear un objeto Scanner para la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        //Pedir al usuario que introduzca el radio
        System.out.println("Introducir el radio del circulo");
        double radio = scanner.nextDouble();

        //Calcular el área utilizando la fórmula: área = PI * radio^2
        double area = Math.PI * Math.pow(radio,2);

        // Mostrar el resultado
        System.out.println("El área del círculo es: " + area);

        // Cerrar el escáner
        scanner.close();
    }
}
