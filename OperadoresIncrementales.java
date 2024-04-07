public class OperadoresIncrementales {
    public static void main(String[] args) {

        // Pre incremento
        int i = 1;
        int j = ++i; // j = i + 1, en este caso primero se incrementa y después se asigna

        System.out.println("i = " + i);
        System.out.println("j = " + j);

        // Pos incremento
        i = 2;
        System.out.println("inicial de i = " + i);
        j = i++;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        // Pre decremento
        i = 3;
        i = --i; // i = i - 1 = 2
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        // Post decremento
        i = 4;
        j = i--;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        System.out.println("j = " + (++j));
        System.out.println("j = " + (j++));

        System.out.println("j = " + j);
    }
}
