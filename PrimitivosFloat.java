public class PrimitivosFloat {
    static float varFlotante = 45.45f;
    public static void main(String[] args) {
        float realFloat = 2.12e3f;  //2120f;
        float realFloat2 = 1.5e4f;  //Se corre la (,) 4 veces hacia la derecha 150000f, osea 0.00000000015f
        //Cuando es exponente negativo, la (,) se corre tantas veces a la izquierda
        float realFloat3 = 0.00000000015f; //1.5e-10f
        System.out.println("realFloat = " + realFloat);
        System.out.println("realFloat2 = " + realFloat2);
        System.out.println("realFloat3 = " + realFloat3);

        /* CONSTANTES que tiene float
         *Todo primitivo tiene su contraparte en
         * una clase, una clase que envuelve al
         * ptimitivo para agregar mayor funcionalidad
         * ej: convertir direfentes tipos de datos entre
         * números a enteros, pero también a String
         */
        System.out.println("float corresponde en byte a = " + Float.BYTES);
        System.out.println("float corresponde en bites a = " + Float.SIZE);
        System.out.println("máximo valor para float = " + Float.MAX_VALUE);
        System.out.println("mínimo valor para float = " + Float.MIN_VALUE);

        double realDouble = 3.4028235E38;
        System.out.println("Double corresponde en byte a = " + Double.BYTES);
        System.out.println("Double corresponde en bites a = " + Double.SIZE);
        System.out.println("máximo valor para double = " + Double.MAX_VALUE);
        System.out.println("mínimo valor para double = " + Double.MIN_VALUE);

        //var varFlotante = 3.1416;
        System.out.println("varFlotante = " + varFlotante);
    }
}
