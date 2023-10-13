public class EjemploStringExtensionArchivo {
    public static void main(String[] args) {
        String archivo = "alguna.imagen.jpeg";
        //int i = archivo.indexOf(".");
        int i = archivo.lastIndexOf(".");
        System.out.println("archivo.length() = " + archivo.length());
        //System.out.println("archivo.substring(14) = " + archivo.substring(14));
        //System.out.println("archivo.substring(archivo) = " + archivo.substring(archivo.length()-4));
        //Para obtener loa extensión de una forma más dinámica, independientemente de cuan largo sea
        System.out.println("archivo = " + archivo.substring(i+1));
    }
}
