public class AutoboxingInteger {
    public static void main(String[] args) {
        // Arreglo de enteros
        // De forma automatica se van convirtiendo
        Integer[] enteros = {Integer.valueOf(1), 2, 3, 4,5 ,6 ,7, 8, 9, 10, 11, 12, 13, 14, 15};

        int suma = 0;
        for (Integer i: enteros){
            if(i.intValue()%2==0){
             // suma = suma + i.intValue():
                suma+=i.intValue();
            }
        }
        // suma todos los numero pares
        System.out.println("suma = " + suma);

// --------- Esto es similar a: ----------------
// Tomo el objeto mismo, calculo el modulo y comparo con 0
        int suma2 = 0;
        for (Integer i: enteros){
            if(i%2==0){
                // suma = suma + i.intValue():
                suma2+=i;
            }
        }
        System.out.println("suma2 = " + suma2);

    }
}
