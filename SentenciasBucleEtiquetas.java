public class SentenciasBucleEtiquetas {
    //Se aplica tanto para el for, como para el While
    public static void main(String[] args) {

        //Etiqueta a la sentencia, pegado al for

        /**
         * Quiero iterar por dias de la semana, y por cada dia, 8 horas de trabajo
         * Menos sabado y domingo
         */
        bucle:
        for (int i = 1; i <= 7; i++) {
            int j = 1;
            while (j <= 8){
                if (i == 6 || i == 7) {
                    System.out.println("Dia" + i + ": descanso de fin de semana!");
                    continue bucle;
                }
                System.out.println("Dia = " + i + ", trabajando = " + j + " hrs. ");
                j++;
            }
        }

        System.out.println("\n=========================================");

        bucle1:
        for (int i = 0; i < 5; i++) {

            System.out.println();
            for (int j = 0; j < 5; j++) {
                if (i == 2) {
                    continue bucle1;
                }
                System.out.print("[i = " + i + ", j = " + j + "], ");
            }
        }

        System.out.println("\n=========================================");

        etiqueta:
        for (int i = 0; i < 5; i++) {

            System.out.println();
            for (int j = 0; j < 5; j++) {
                if (i == 2) {
                    break etiqueta;
                }
                System.out.print("[i = " + i + ", j = " + j + "], ");
            }
        }

    }
}
