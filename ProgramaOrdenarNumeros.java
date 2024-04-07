import java.util.Scanner;

public class ProgramaOrdenarNumeros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el numero 1: ");
        int num1 = scanner.nextInt();

        System.out.println("Ingrese el numero 2: ");
        int num2 = scanner.nextInt();

        String resultado = (num1 > num2) ? num1 + " y " + num2 : num2 + " y " + num1;

        System.out.println("El orden es: " + resultado);

    }
}
