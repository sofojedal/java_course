import java.util.Properties;

public class EjemploPropiedadesDeSistema {
    public static void main(String[] args) {

        /**
         * Buscar en Google, Java system getproperties
         */

        //Nombre de usuario del sistema operativo
        String username = System.getProperty("user.name");
        System.out.println("username = " + username);

        //Ruta del usuario del sistema operativo
        String home = System.getProperty("user.home");
        System.out.println("home = " + home);

        //Directorio del proyecto, se llama Hola
        String workspace = System.getProperty("user.dir");
        System.out.println("workspace = " + workspace);

        //Para listar las propiedades
        Properties p = System.getProperties();
        p.list(System.out);


    }
}
