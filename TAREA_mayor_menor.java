import java.util.Scanner;

public class TAREA_mayor_menor {
    public static void main(String[] args) {

        //Pedir dos números y mostrarlos ordenados de mayor a menor

        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese el primer número");
        int num1 = s.nextInt();

        System.out.println("Ingrese el segundo número");
        int num2 = s.nextInt();

        if (num1 > num2){
            System.out.println("El número mayor es: " + num1);
            System.out.println("El número menor es: " + num2);
        }else if (num2 > num1){
            System.out.println("El número mayor es: " + num2);
            System.out.println("El número menor es: " + num1);

        }

    }
}
