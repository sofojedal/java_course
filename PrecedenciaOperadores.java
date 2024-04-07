public class PrecedenciaOperadores {
    public static void main(String[] args) {

        int i = 14;
        int j = 8;
        int k = 20;

        //Para que el resultado sea mas exacto colocamos Double, en este caso = (3d)
        double promedio = (i +j + k) / 3d;
        System.out.println("promedio = " + promedio);

        // Pre incremento, pos decremento
        // ¿Cómo se resuelve?
        promedio = ++i + j-- + k / 3d * 10; // (15 + 8) + 66.6
        // 1. incrementar, ya que es un PRE incremento
        // PRE: Primero incrementa y después asigna el valor
        System.out.println("promedio = " + promedio);
        System.out.println("i = " + i);
        System.out.println("j = " + j);

    }
}
