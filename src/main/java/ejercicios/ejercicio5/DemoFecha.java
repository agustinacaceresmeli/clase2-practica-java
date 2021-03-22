package ejercicios.ejercicio5;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DemoFecha {

    public static void main (String []args) {

        Calendar c1 = GregorianCalendar.getInstance();

        System.out.println("Fecha actual: " + c1.getTime().toString());

        c1.set(2021, Calendar.MARCH, 22);

        System.out.println("Fecha 22 de marzo de 2021: " + c1.getTime().toString());

        c1.set(Calendar.DAY_OF_MONTH, 23);

        System.out.println("Fecha si le sumo un dia: " + c1.getTime().toString());

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MMMMM/yyyy hh:mm:ss");

        System.out.println("Fecha Formateada: " + sdf.format(c1.getTime()));
    }

}
