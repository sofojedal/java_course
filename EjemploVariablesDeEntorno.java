import java.util.Map;

public class EjemploVariablesDeEntorno {
    public static void main(String[] args) {
        // Map, arreglo asociativo, asocia valores que estan guardados con un nombre
        // Guardamos un valor asociado a un nombre
         Map<String, String> varEnv = System.getenv();
        System.out.println("Variable de ambiente, o entorno del sistema = " + varEnv);

        /**
         * Podemos crear nuestra propia variable de ambiente en el
         * sistema operativo
         *
         * Los que aparecen en null, es porque asi no se llaman las variables
         *
         * Debe ser exactamente igual como se registra en el sistema operativo
         */

        System.out.println("Listando varibales de entorno de sistema");
        // Set, retorna un conjunto con los nombres de llaves
        for (String key: varEnv.keySet()){
            // Por cada nombre, voy a imprimir su valor
            // se obtienen con el metodo get
            // por cada nombre de key, leemos y retornamos el valor
            System.out.println("key = " + varEnv.get(key));
        }

        String logname = System.getenv("LOGNAME");
        System.out.println("logname = " + logname);

        String javaHome = System.getenv("HOME");
        System.out.println("javaHome = " + javaHome);

        String temDir = System.getenv("TEMP");
        System.out.println("temDir = " + temDir);

        String path = System.getenv("PATH");
        System.out.println("path = " + path);


    }
}
