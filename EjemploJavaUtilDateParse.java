import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

//Parse es para comvertir un String a una fecha
public class EjemploJavaUtilDateParse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        System.out.println("Ingrese una fecha con formato -> \"dd-MM-yyyy\" ");
        try {
            Date fecha = format.parse(s.nextLine());
            //Imprimir la fecha convertida
            System.out.println("fecha = " + fecha);
            //Fecha com el formato
            System.out.println("format = " + format.format(fecha));

            //Fecha2 es la fecha actual
            Date fecha2 = new Date();
            System.out.println("Fecha Actual = " + fecha2);
            if (fecha.after(fecha2)){
                System.out.println("Fecha1 (del usuario) es después que la fecha2 (actual)");
            }else if (fecha.before(fecha2)){
                System.out.println("Fecha1 es anterior que fecha2");
            } else if (fecha.equals(fecha2)) {
                System.out.println("Fecha1 es igual a fecha2");
            }

            if (fecha.compareTo(fecha2) > 0){
                System.out.println("fecha1 (del usuario) es después que fecha2 (actual)");
            } else if (fecha.compareTo(fecha2) < 0) {
                System.out.println("fecha1 es anterior que fecha2");
            } else if (fecha.compareTo(fecha2) == 0){
                System.out.println("Fecha1 es igual a fecha2");
            }

        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
