public class SentenciaWhile {
    public static void main(String[] args) {
        int i = 0;
        while (i <= 5){
            System.out.println("i = " + i);
            i++;
        }

        i = 0;
        boolean prueba = true;
        while (prueba){
            if (i == 7){
                prueba = false;
            }
            System.out.println("i = " + i);
            i++;
        }
        prueba = false;
        do {
            System.out.println("se ejecuta al menos una vez");
        } while (prueba);

        prueba = true;
        // contador
        i = 0;
        do {
            if (i == 10){
                prueba = false;
            }
            System.out.println("i = " + i);
            i++;
        }while (prueba);

        /**
         * Recordar que el -while- es pre-prueba
         * Primero evalua y luego ejecuta e itera
         *
         *
         * Mientras que el -do while- es post-prueba
         * Primero ejecuta al menos una sola vez y después evalua la condicion
         *
         * Resulta util cuando necesitamos realizar cierta acción antes de verificar o evaluar una condicion
         */
    }
}
