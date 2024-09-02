package Date08;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ClaseCalendario {
    public static void main(String[] args) {
        Calendar calendario= Calendar.getInstance();

        calendario.set(2024,8,02,15,26,14);


        Date fecha = calendario.getTime();
        calendario.set(Calendar.YEAR,2024);
        calendario.set(Calendar.MONTH,8);
        calendario.set(Calendar.DAY_OF_MONTH,Calendar.SEPTEMBER);
     //   calendario.set(Calendar.HOUR_OF_DAY,15);
        calendario.set(Calendar.HOUR,4);
        calendario.set(Calendar.AM_PM,Calendar.PM); // asignamos en pm en vez
        // de hour del day que son 24 horas aqui es de 12 horas pero con am o pm
        calendario.set(Calendar.MINUTE,32);
        calendario.set(Calendar.MILLISECOND,121);
        

        calendario.set(Calendar.HOUR,04);
        
        System.out.println("calendario = " + fecha);
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MMMM-dd HH:mm:ss:SSS a");
        String strFecha = formato.format(fecha);
        System.out.println("strFecha = " + strFecha);
        


    }
}
