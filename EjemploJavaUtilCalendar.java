import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class EjemploJavaUtilCalendar {
    public static void main(String[] args) {
        // Calse abstracta, quiere decir que no permite crear la
        // instancia concreta con el operador 'new'

        // .getInstance: realiza el new por debajo
        Calendar calendario = Calendar.getInstance();

        //calendario.set(2020, Calendar.SEPTEMBER, 25, 19, 20, 10);
        calendario.set(Calendar.YEAR, 2020);
        calendario.set(Calendar.MONTH, Calendar.JULY);
        calendario.set(Calendar.DAY_OF_MONTH, 25);

        //calendario.set(Calendar.HOUR_OF_DAY, 21);
        calendario.set(Calendar.HOUR, 7);
        calendario.set(Calendar.AM_PM, Calendar.PM);
        calendario.set(Calendar.MINUTE, 20);
        calendario.set(Calendar.MILLISECOND, 125);

        Date fecha = calendario.getTime();
        System.out.println("fecha sin formato = " + fecha);

        System.out.println("calendario = " + fecha);
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss:SSS a");
        String fechaconformato = formato.format(fecha);
        System.out.println("fecha con formato = " + fechaconformato);

    }
}
