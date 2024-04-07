public class WrapperInteger {
    // wrapper - anidar
    public static void main(String[] args) {
        // Crear un objeto de tipo Integer - esta forma se conoce como boxing
        // Toma un valor entero primitivo (32168), y lo convierte a un objeto
        Integer intObjeto = Integer.valueOf(32168);
        // Ato - Boxing, de forma automatica, va a tomar de la literal y valor
        // primitivo y automaticamente lo convierte a un objeto de forma automatica
        Integer intObjeto2 = 32168;

        // Convertir un primitivo en un objeto wrapper, en vez de colocar
        // el entero se coloca la variable que se uso
        int intPrimitivo =32168;
        Integer intObjeto3 = Integer.valueOf(intPrimitivo);

        System.out.println("intObjeto3 = " + intObjeto3);

        // Ahora como convierto al reves: un objeto del tipo integer de referencia
        // a un entero primitivo

        // Toma el objeto integer y automaticamente se convierte en un primitivo
        int num = intObjeto3;
        // segunda forma de hacer lo anterior
        int num2 = intObjeto.intValue();

        System.out.println("num = " + num);
        System.out.println("num2 = " + num2);

        // Como convertir esto en un ENTERO?
        String valorTvLcd ="67000";
        Integer valor = Integer.valueOf(valorTvLcd);

        // Que pasa si convierto 32768 a un Short, a pesar de que no
        // soporta ese valor lo podemos hacer, un shor soporta 32767
        // Por lo tanto vamos a tener una perdida de informacion
        Short shortObjeto = intObjeto3.shortValue();
        System.out.println("shortObjeto = " + shortObjeto);

        // Así mismo va haber perdida de información
        Byte byteObjeto = intObjeto.byteValue();
        System.out.println("byteObjeto = " + byteObjeto);

        Long longObjeto = intObjeto.longValue();
        System.out.println("longObjeto = " + longObjeto);
    }
}
