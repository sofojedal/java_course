public class TareaStringArreglo {
/**
 * Se requiere desarrollar un programa que reciba los nombres
 * de los integrantes de tu familia y formatearlos
 */
    public static void main(String[] args) {
        
        String mama="Pilar";
        String papa="Alejandro";
        String hermana="Sara";
        System.out.println("mama = " + mama);
        System.out.println("papa = " + papa);
        System.out.println("hermana = " + hermana);

        char[] arregloMama = mama.toCharArray();
        int largo2 = arregloMama.length;

        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.length() = " + trabalenguas.length());
        //Convertirlo en un Array
        System.out.println("trabalenguas.to = " + trabalenguas.toCharArray());
        char[] arreglo = trabalenguas.toCharArray();
        int largo = arreglo.length;
        System.out.println("largo = " + largo);
        //Se hace un array porque la unica forma de mostrar los
        // elementos de un array es con una iteración (for) o (while)

        //Mientras el i sea menor que el largo -> Iteramos
        for(int i = 0; i < largo; i++){
            //System.out.println("arreglo = " + arreglo[i]);
            System.out.println("arreglo = " + arreglo[i]);
            System.out.print(arreglo[i]);
        }
        //Lo que va a hacer el split, es convertir
        // este string en un arreglo
        //Donde cada elemento del arreglo van a
        // ser las palabras o caracteres que estan separadas por la "a"

        //Salto de linea
        System.out.println();
        System.out.println("\ntrabalenguas = " + trabalenguas.split("a"));
        String[] arreglo2 = trabalenguas.split("a");
        int l = arreglo2.length;
        for (int j=0; j<l; j++){
            System.out.println(arreglo2[j]);
        }
        //Crear un arreglo a partir del nombre de archivo que contenga esos elementos
        String archivo = "alguna.imagen.pdf";
        // Con doble backslash indico que es el caracter ., ya que "." esta reservado
        String[] archivoArr = archivo.split("\\.");
        //ahora iteramos con el for
        // l para el largo de este nuevo arreglo
        l = archivoArr.length;
        System.out.println("l = " + l);
        System.out.println();
        for(int j=0; j<l; j++){
            System.out.println(archivoArr[j]);
        }
        //-1 porque el indice parte en 0

        System.out.println("extension = " +archivoArr[l-1]);

    }

}
