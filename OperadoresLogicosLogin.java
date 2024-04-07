import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {
        /*String[] usernames = new String[3];
        String[] passwords = new String[3];
        usernames[0] = "laura";
        passwords[0] = "12345";

        usernames[1] = "admin";
        passwords[1] = "6789";

        usernames[2] = "pepe";
        passwords[2] = "101112";*/

        String[] usernames = {"laura", "admin", "pepe"};
        String[] passwords = {"12345", "6789", "101112"};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el username");
        String u = scanner.next();

        System.out.println("Ingrese el password");
        String p = scanner.next();

        boolean esAutenticado = false;

        for (int i = 0; i < usernames.length; i++){

            esAutenticado = (usernames[i].equals(u) && passwords[i].equals(p))? true: esAutenticado;

            /*if (usernames[i].equals(u) && passwords[i].equals(p)){
                esAutenticado = true;
                //Es para salirse del for y no continuar con la iteración
                break;
            }*/
        }

        // el true sobra porque "esAutenticado" es una expresión booleana

        String mensaje = esAutenticado ? "Bienvenido usuario ".concat(u).concat("!") :
                "Username o contraseña incorrecta \n Lo sentimos, requiere autenticación";
        System.out.println("mensaje = " + mensaje);
        /*if (esAutenticado == true){
            System.out.println("Bienvenido usuario ".concat(u).concat("!"));
        }else{
            System.out.println("Lo siento, requiere autenticación");
            System.out.println("Username o contraseña incorrecta");
        }*/
    }
}
