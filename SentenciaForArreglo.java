import javax.swing.*;

public class SentenciaForArreglo {
    public static void main(String[] args) {
        // Para definir un arreglo,
        // Siempre con el tipo de dato y los corchetes
        // 6, cantidad de metodos
        //String[] nombress = new String[6];
        // ootra forma
        String[] nombres = {"Andres", "Pepe", "María", "Paco", "Lalo" +
                "Bea", "Pato", "Pepa"};
        // Para iterar sobre un arreglo o una lista, usaremos un for
        int count = nombres.length;
        for (int i = 0; i < count; i++){
            // recordar que || es OR
            // equals Ignore Case, para evitar el conflicto entre mayusculas y minusculas
            // tambien se podria utilizar el metodo contains, esto es para ver si contiene tal palabra o frase dentro del string
            // Pero con contains debemos colocar la palabra exacta, con mayusculas y minusculas exactas
            // solucion? convertirlo con toLowerCase() que combierte ambos a mayuscula o ambos a minuscula
            if(nombres[i].toLowerCase().contains("ANDRES".toLowerCase()) ||
                    nombres[i].equalsIgnoreCase("Pepa")){
                continue;
            }
            System.out.println( i + " - " + nombres[i]);

            // Buscar un nombre
            String buscar = JOptionPane.showInputDialog("Ingrese un nombre, ej: \"Pepe\" o \"Maria\": ");
            System.out.println("buscar = " + buscar);

            boolean encontrado = false;
            for(int j = 0; i < count; i++){
                if (nombres[i].equalsIgnoreCase(buscar)){
                    encontrado = true;
                    break;
                }
                // vamos a imprimir cada nombre hasta que lo encuentre, para ver como va recorriendo
                System.out.println("nombres = " + nombres);
            }
            if (encontrado){
                JOptionPane.showInputDialog(null, buscar + " fue encontrado");
            }else{
                JOptionPane.showInputDialog(null, buscar + " no existe en el sistema");

            }
        }
    }
}
