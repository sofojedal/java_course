// Of - Intancia (de)
public class OperadorInstanceOfTiposGenericos {
    /*
    Nos permite saber si una instancia o un objeto es referencia de un tipo
     por ejemplo de una clase, de una interfaz, de una clase abstracta, o
     incluso de un subtipo, es decir: puede que sea del tipo de una clase,
     pero a su vez esa clase extiende, hereda de otra clase, una clase mas
     generica y tambien se puede saber si ese objeto es descendiente de ese tipo.
      O si ese tipo es un ancestro de ese Objeto
     */
    public static void main(String[] args) {
        Object texto = new String("Creando un objeto de la clase String ... que tal!");

        Number num = Integer.valueOf(7); //7;

        Boolean b1 = texto instanceof String;
        System.out.println("texto es del tipo String = " + b1);

        b1 = texto instanceof  Object;
        System.out.println("texto es del tipo Object = " + b1);

        b1 = texto instanceof Integer;
        System.out.println("texto es el tipo integer = " + b1);

        b1 = num instanceof Integer;
        System.out.println("num es del tipo Integer = " + b1);

        b1 = num instanceof Number;
        System.out.println("num es del tipo Number = " + b1);
        
        b1 = num instanceof Object;
        System.out.println("num es del tipo Object = " + b1);

        b1 = num instanceof Long;
        System.out.println("num es del tipo LONG ?? = " + b1);

        b1 = num instanceof Double;
        System.out.println("num es del tipo Double = " + b1);
        
        Number decimal = Float.valueOf(45.54f);
        b1 = decimal instanceof Double;
        System.out.println("b1 es del tipo Double = " + b1);

        b1 = decimal instanceof Float;
        System.out.println("b1 es del tipo Float = " + b1);

        b1 = decimal instanceof Number;
        System.out.println("decimal es del tipo Number = " + b1);

        b1 =  b1 instanceof Boolean;
        System.out.println("b1 es del tipo Boolean = " + b1);

    }
}
