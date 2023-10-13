public class PrimitivosEnteros {
    public static void main(String[] args) {
        byte numeroByte = 127;
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("Tipo en byte, correspode en byte a " + Byte.BYTES);
        System.out.println("Tipo en byte, correspode en byte a " + Byte.SIZE);
        System.out.println("Valor máximo de un byte: " + Byte.MAX_VALUE);
        System.out.println("Valor mínimo de un byte: " + Byte.MIN_VALUE);

        short numeroShort = 32767; //Valor máximo
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("Tipo en short, correspode en byte a " + Short.BYTES);
        System.out.println("Tipo en short, correspode en bites a " + Short.SIZE);
        System.out.println("Valor máximo de un short: " + Short.MAX_VALUE);
        System.out.println("Valor mínimo de un short: " + Short.MIN_VALUE);

        int numeroInt = 32768;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("Tipo en int, correspode en byte a " + Integer.BYTES);
        System.out.println("Tipo en int, correspode en bites a " + Integer.SIZE);
        System.out.println("Valor máximo de un int: " + Integer.MAX_VALUE);
        System.out.println("Valor mínimo de un int: " + Integer.MIN_VALUE);

        long numeroLong = 9223372036854775807L;
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("Tipo en long, correspode en byte a " + Long.BYTES);
        System.out.println("Tipo en long, correspode en bites a " + Long.SIZE);
        System.out.println("Valor máximo de un long: " + Long.MAX_VALUE);
        System.out.println("Valor mínimo de un long: " + Long.MIN_VALUE);

        var numeroVar = 3276789987667787666D;



    }
}
