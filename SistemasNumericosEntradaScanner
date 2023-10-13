import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemasNumericosEntradaScanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero entero");
        //Capturamos el parametro del usuario
        //String numeroStr = scanner.nextLine();
        int numeroDecimal = 0;
        /*
        El propósito de un bloque try-catch es detectar y controlar
        una excepción generada por código en funcionamiento.
         */
        try{ //Se puede obtener el entero directamente del scanner
            numeroDecimal = scanner.nextInt();//Integer.parseInt(numeroStr);
            //catch, bloque de codigo alternativo, recibe parametros, argumentos
        }catch(InputMismatchException e){
            System.out.println("Error, debe ingresar un número entero!");
            main(args);
            System.exit(0);
        }

        System.out.println("numeroDecimal = " + numeroDecimal);

        String resultadoBinario = "numeroBinario = " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);

        String resultadoOctal = "numero octal de = " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);

        String resultadoHex = "numero hexadecimal de = " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);

        String mensaje = resultadoBinario;
        mensaje += "\n"+ resultadoOctal;
        mensaje += "\n" + resultadoHex;

        System.out.println(mensaje);
    }
}
