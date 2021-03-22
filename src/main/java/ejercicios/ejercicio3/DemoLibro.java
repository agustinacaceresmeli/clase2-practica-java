package ejercicios.ejercicio3;


public class DemoLibro {

    public static void main(String[] args) {

        Libro libro = new Libro("Harry Potter", "9780545582889", "Rowling, J. K.");
        libro.prestamo();
        System.out.println(libro.toString());
    }
}
