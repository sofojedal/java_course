/**
 * Es similar al for, pero de una forma mucho mas declarativa
 * y mucho mas facil de leer, solamente se utiliza para iterar sobre arreglos
 * o objetos de coleccion de java que son un tipo de iterable
 *
 * Entonces por cada elemento de un arreglo hacer algo con este elemento
 *
 * Se recorre cada elemento de forma automatica del arreglo e itera por caa elemento
 */

public class SentenciaForEach {
    public static void main(String[] args) {
        int[] numeros= {1, 3, 5, 7, 9, 11, 13, 15};
        for (int num: numeros){
            System.out.println("num = " + num);
        }
        String[] nombres = {"Andres", "Pepe", "Maria", "Paco", "Lalo",
        "Bea", "Pato", "Pepa"};
        //Recorre y ...
        //Por cada iteracion asigna el elemento en esa variable
        for (String nombre : nombres){
            System.out.println("nombre = " + nombre);
        }

    }
}
