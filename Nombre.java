import java.util.Locale;

public class Nombre {
    public static void main(String[] args){
        String saludar = "Hola tu";
        System.out.println("saludar.toUpperCase(Locale.ROOT) = " + saludar.toUpperCase(Locale.ROOT));

        int numero = 11;

        boolean valor = true;
        int numero2 = 5;
        if (valor) {
            System.out.println("numero = " + numero);
            numero2 = 10;
        }
        System.out.println("numero2 = " + numero2);
        var numero3 = 15;

        String nombre = "Laura";
        if (numero > 10){
            nombre = "Juan";
        }
        System.out.println("nombre = " + nombre);
    }
}
