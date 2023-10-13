import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args) {
        String numeroStr = JOptionPane.showInputDialog(null, "Ingrese un numero entero");
        int numeroDecimal = 0;
        /*
        El propósito de un bloque try-catch es detectar y controlar
        una excepción generada por código en funcionamiento.
         */
        try{
            numeroDecimal = Integer.parseInt(numeroStr);
            //catch, bloque de codigo alternativo, recibe parametros, argumentos
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error, debe ingresar un número entero");
            main(args);
            System.exit(0);
        }

        System.out.println("numeroDecimal = " + numeroDecimal);

        String resultadoBinario = "numeroBinario = " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        System.out.println(resultadoBinario);

        int numeroBinario = 0b111110100; //0b - al inicio, corresponde a un sistema binario
        //Lo interpreta como binario pero se muestra como decimal
        System.out.println("numeroBinario = " + numeroBinario);

        String resultadoOctal = "numero octal de = " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        System.out.println(resultadoOctal);

        int numeroOctal = 0764; //0 - Al principio, corresponde al sistema octal
        //Corresponde al numero 500
        System.out.println("numeroOctal = " + numeroOctal);

        String resultadoHex = "numero hexadecimal de = " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);
        System.out.println(resultadoHex);

        int numeroHex = 0x1f4; //0x - numero hexadecimal
        int numeroHex2 = 0xB; //corresponde al 11 en Decimal
        System.out.println("numeroHex = " + numeroHex);
        System.out.println("numeroHex2 = " + numeroHex2);
        String mensaje = resultadoBinario;
        //mensaje = mensaje + " Es igual a mensaje +=";
        mensaje += "\n"+ resultadoOctal;
        mensaje += "\n" + resultadoHex;

        JOptionPane.showMessageDialog(null, mensaje);
    }
}
