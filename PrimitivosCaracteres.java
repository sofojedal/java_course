public class PrimitivosCaracteres {
    public static void main(String[] args) {
        //Para definir un caracter, UNO SOLO, tanto letras como números
        var caracter0 = 'a';
        char caracter = 'a';
        //unicode characters table
        char caracter2 = '\u0040';
        //Codigo del @ en html
        char decimal = 64;
        System.out.println("caracter = " + caracter);
        System.out.println("caracter2 = " + caracter2);
        System.out.println("decimal = caracter2: " + (decimal==caracter2));
        char simbolo = '@';
        System.out.println("simbolo = caracter2: " + (simbolo == caracter2));
        char espacio = '\u0020'; //Espacio en unicode
        char retroceso = '\b'; //Espacio hacia atras, o el que nos funciona para borrar
        char tabulador = '\t';
        char nuevaLinea = '\n'; //lineSeparator()
        char retornoCarro = '\r'; //lineSeparator()
        System.out.println("Char \t corresponde en byte =" +System.lineSeparator() + Character.BYTES);
        System.out.println("Char corresponde en bites = " + retornoCarro+Character.SIZE);
        System.out.println("Valor máximo de un Character: " + Character.MAX_VALUE);
        System.out.println("Valor mínimo de un Character: " + Character.MIN_VALUE);

    }
}
