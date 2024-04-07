import java.lang.reflect.Method;

public class EjemploMetodoGetClass {
    public static void main(String[] args) {
        String texto = "Hola que tal";
        Class srtClass =  texto.getClass();

        System.out.println("srtClass.getName() = " + srtClass.getName());
        System.out.println("srtClass.getSimpleName() = " + srtClass.getSimpleName());
        System.out.println("srtClass.getPackageName() = " + srtClass.getPackageName());
        System.out.println("srtClass = " + srtClass);

        // for each
        for(Method metodo: srtClass.getMethods()){
            System.out.println("metodo = " + metodo.getName());
        }

        Integer num = 34;
        Class intClass = num.getClass();
        System.out.println("intClass = " + intClass.getName());
        System.out.println("intClass = " + intClass.getSimpleName());
        System.out.println("intClass = " + intClass.getPackageName());
        System.out.println("intClass = " + intClass.getSuperclass());
    }
}
