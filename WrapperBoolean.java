public class WrapperBoolean {
    public static void main(String[] args) {
        Integer num1, num2;
        num1 = 1;
        num2 = 2;
        // Primitivo
        boolean primBoolean = num1 > num2; //false
        // De referencia, se hace el autoboxing - de forma automatica
        // se convierte y se empaqueta en esta clase
        Boolean objBoolean = false;
        // Tambien tenemos esta forma explicita
        Boolean objBoolean2 = Boolean.valueOf(primBoolean);
        Boolean objBoolean3 = Boolean.valueOf("false");

        System.out.println("primBoolean = " + primBoolean);
        System.out.println("objBoolean = " + objBoolean);
        System.out.println("objBoolean2 = " + objBoolean2);
        System.out.println("objBoolean3 = " + objBoolean3);

        System.out.println("Comparar dos objetos boolean: " + (objBoolean == objBoolean2));
    }
}
