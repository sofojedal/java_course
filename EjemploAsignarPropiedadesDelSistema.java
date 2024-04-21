/**
 * src -> new -> file 
 * 
 * config.puerto.servidor=8090
 * otra=algun valor
 * config.texto.ambiente=Configurando ambiente de desarrollo
 * config.autor.nombre=Andrés
 * config.autor.email=andresg@correo.com
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class EjemploAsignarPropiedadesDelSistema {
    public static void main(String[] args) {
        /**
         * instancia de una clase = file input stream
         * Se encarga de leer eel archivo config y obtiene el contenido
         * Pero en formato byte
         */

        // En el constructor como argumento se pasa la ruta
        try {
            FileInputStream archivo = new FileInputStream("src/config.properties");
            // Le agregamos todas las configuraciones que tenemos en el sistema
            // System.getProperties(), de esta forma cargamos las configuraciones del sistema
            Properties p = new Properties(System.getProperties());
            // ademas le agregamos las nuevas configuraciones del archivo
            p.load(archivo);
            // Recibe un String y un value
            p.setProperty("mi.propiedad.personalizada", "Mi valor guardado en el objeto properties");

            System.setProperties(p);
            Properties ps = System.getProperties();
            System.out.println("ps.getProperty(...) = " + ps.getProperty("mi.propiedad.personalizada"));
            System.out.println(System.getProperty("config.puerto.servidor"));
            System.out.println(System.getProperty("config.autor.nombre"));
            System.out.println(System.getProperty("config.autor.email"));

            ps.list(System.out);
        } catch(Exception e){
            System.out.println("No existe el archivo = " + e);
        }


    }
}
