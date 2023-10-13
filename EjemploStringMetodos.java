import java.lang.module.FindException;

public class EjemploStringMetodos {
    public static void main(String[] args) {
        String nombre = "Laura";
        System.out.println("nombre.length() = " + nombre.length());
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        System.out.println("nombre.equals(\"Laura\") = " + nombre.equals("Laura"));
        System.out.println("nombre.equals(\"Laura\") = " + nombre.equals("laura"));
        //Ignora mayúsculas y minúsculas
        System.out.println("nombre = " + nombre.equalsIgnoreCase("laura"));
        //Comparar caracteres, según un orden numerico de cada codigo, 
        //si el valor es cero, siempre serán iguales 
        System.out.println("nombre = " + nombre.compareTo("Laura"));
        System.out.println("nombre.compareTo(\"Aaron\") = " + nombre.compareTo("Aaron"));
        //comvertir un String en caracteres, o podemos obtener un caracter en particular
        // 0 corresponde a la L mayúscula
        System.out.println("nombre.charAt() = " + nombre.charAt(0));
        System.out.println("nombre.charAt(4) = " + nombre.charAt(4));
        //Para obtener el último de una forma dinamica, se usa
        System.out.println("nombre = " + nombre.charAt(nombre.length()-1));
        // Incluye la posición colocada en adelante
        System.out.println("nombre.substring(1) = " + nombre.substring(1));
        // puede recibir el desde, hasta el hasta, el desde se incluye,
        // pero el hasta no lo incluye
        System.out.println("nombre.substring(1,3) = " + nombre.substring(1,3));
        System.out.println("nombre.substring(3,4) = " + nombre.substring(3,4));

        //Solo el obtener el último caracter de forma dinámica
        System.out.println("nombre = " + nombre.substring(nombre.length()-1));
        //Para obtener los dos útimos, sera -2
        System.out.println("nombre = " + nombre.substring(nombre.length()-2));

        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas = " + trabalenguas.replace("a", "."));
        System.out.println("trabalenguas = " + trabalenguas);
        //Entrega la prima posición de lo que se le indique
        System.out.println("index = " + trabalenguas.indexOf('a'));
        //Para que retorne la ultima posicion del caracter que se le indique
        System.out.println("trabalenguas.lastIndexOf('a') = " + trabalenguas.lastIndexOf('a'));
        //Si retorna -1, significa que no esta
        System.out.println("trabalenguas.indexOf('z') = " + trabalenguas.indexOf('z'));
        //contains, lo contiene si o no, true or false
        System.out.println("trabalenguas.contains(\"t\") = " + trabalenguas.contains("t"));
        System.out.println("trabalenguas.startsWith(\"lenguas\") = " + trabalenguas.startsWith("lenguas"));
        System.out.println("trabalenguas.startsWith(\"traba\") = " + trabalenguas.startsWith("traba"));
        System.out.println("  trabalenguas ");
        //para quitar los espacios
        System.out.println("  trabalenguas ".trim());

    }
}
