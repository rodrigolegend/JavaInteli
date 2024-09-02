package Date08;
import java.text.SimpleDateFormat;
import java.util.Date;
public class EjemploUtildate {
    public static void main(String[] args) {
        Date fecha = new Date();
        System.out.println("fecha = " + fecha);

        SimpleDateFormat dateFormat = new SimpleDateFormat("'este es la hora de sistema:' EEEE dd-MMMM-yyyy");
        String fecha2 = dateFormat.format(fecha);
        System.out.println("fecha2 = " + fecha2);

        long k = 0;
        for(int i =0; i < 10000; i++){
            k+= i;

        }
        System.out.println("k = " + k);


        Date fecha3 = new Date();
        long tiempo= fecha3.getTime()-fecha.getTime();
        System.out.println("tiempo = " + tiempo);

    }
}
