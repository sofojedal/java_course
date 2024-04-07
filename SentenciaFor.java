public class SentenciaFor {
    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++){
            System.out.println("i = " + i);
        }
        // Partir de 10 y llegar a 0
        for(int i = 10; i >= 0; i--){
            System.out.println("i = " + i);
        }
        //Podemos tener mas de una variable de inicio en un for
        // Incrementar ambas, o decrementar, o hacer combinaciones
        for ( int i = 1,j = 10; i < j; i++, j--){
            // i parte en 1
            // j parte en 10
            // y después 2   9, y así hasta que ambos lleguen a 5
            // Y cuando i = 5, es menor que 5, ahi se va a salir
            System.out.println(i + " - " + j);
        }
        // Quiero solamente imprimir los numero impares: 1, 3, 5, 7, etc
        // Para los pares usamos la negación !
        for(int i = 0; i <= 10; i++){
            if(i % 2 != 0){
                //continua con la siguiente iteración
                continue;
            }
            System.out.println("i = " + i);
        }

    }
}
