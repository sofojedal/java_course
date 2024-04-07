import java.util.Scanner;

public class Tarea_reportes_notas_alumnos {
    public static void main(String[] args) {
        /**
         * Pedir 20 notas finales de alumnos en una escala de 1 a 7, manejar decimales en las notas (double).
         * Mostrar el promedio de las notas mayores a 5, promedio de notas inferiores a 4 y la cantidad de
         * notas 1, ademas mostrar el promedio total.
         *
         * Ayuda: usar un bucle for que itere hasta 20 (notas) y dentro del ciclo pedir las notas una a una
         * para realizar los cálculos (contadores, sumas).
         *
         * Opcional: si una de las notas ingresadas es 0 debe salirse del ciclo for y mostrar un mensaje
         * de error finalizando el programa.
         */

        Scanner s = new Scanner(System.in);
        System.out.println("Ingresar 20 notas del 1 al 7");

        double n1 = s.nextDouble();
        double n2 = s.nextDouble();
        double n3 = s.nextDouble();
        double n4 = s.nextDouble();
        double n5 = s.nextDouble();
        double n6 = s.nextDouble();
        double n7 = s.nextDouble();
        double n8 = s.nextDouble();
        double n9 = s.nextDouble();
        double n10 = s.nextDouble();
        double n11 = s.nextDouble();
        double n12 = s.nextDouble();
        double n13 = s.nextDouble();
        double n14 = s.nextDouble();
        double n15 = s.nextDouble();
        double n16 = s.nextDouble();
        double n17 = s.nextDouble();
        double n18 = s.nextDouble();
        double n19 = s.nextDouble();
        double n20 = s.nextDouble();

        double[] notas = {n1, n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, n12, n13, n14, n15, n16, n17, n18, n19, n20};


        for (double i = 0; notas.length < 0;i++){
            if (notas.length == 0){
                System.out.println("Las notas deben ser mayores a 0 - ERROR");
            } else if (notas.length == 0) {
                System.exit(0);
            }
        }

        double promedio = 0;

        for (double i = 0; i < notas.length; i++){

            promedio = (n1 + n2 + n3 + n4 + n5 + n6 + n7 + n8 + n9 + n10 + n11 + n12 + n13 + n14 + n15 + n16 + n17 + n18 + n19 + n20) / 20;
        }
        if (promedio > 5){
            System.out.println("El promedio es mayor a 5, felicidades: " + promedio);
        } else if (promedio < 5) {
            System.out.println("El promedio es menor a 5, estudie mas :( " + promedio);
        }
    }
}
