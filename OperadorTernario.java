import java.sql.SQLOutput;
import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {
        // condicional, true o false, expresión booleana
        // TERNARIO: esta formado por 3 partes, elementos, argumentos, devuelve un valor
        // La primera evalua una expresión booleana, si se cumple devuelve un valor, y si no se cumple, devuelve otro valor

        //Estructura   ->   variable = condicion ? si es verdadero: si es falso;
        // ESTRUCTURA  ->  String variable = 7 == 7 ? "s es verdadero" :(ELSE) si es falso
        String variable = 7 == 9 ? "si es verdadero" : "si es falso";
        System.out.println("variable = " + variable);
        String estado = "";
        double promedio = 0.0;

        double matematicas = 0.0;
        double ciencias  = 0.0;
        double historia = 0.0;

        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese la nota de matemáticas entre 2.0 - 7.0: ");
        //Obtenemos el valor desde el Scanner, desde la consola
        matematicas = s.nextDouble();

        System.out.println("Ingrese la nota de ciencias entre 2.0 - 7.0: ");
        //Obtenemos el valor desde el Scanner, desde la consola
        ciencias = s.nextDouble();

        System.out.println("Ingrese la nota de historia entre 2.0 - 7.0: ");
        //Obtenemos el valor desde el Scanner, desde la consola
        historia = s.nextDouble();

        promedio = (matematicas + ciencias + historia)/3;

        estado = promedio >= 5.49 ? "Aprobado" : "Rechazado";
        System.out.println("estado = " + estado);
        System.out.println("promedio = " + promedio);

        /*if(promedio >= 5.49){
            estado = "Aprovado";
        }else{
            estado = "Rechazado";
        }*/

    }
}
