package ejercicios.ejercicio5;

import java.util.GregorianCalendar;

public class Fecha {

    private GregorianCalendar fecha = new GregorianCalendar();

    public GregorianCalendar getFecha() {
        return fecha;
    }

    public void setFecha(GregorianCalendar fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Fecha: " + fecha.getTime().toString();
    }


}
