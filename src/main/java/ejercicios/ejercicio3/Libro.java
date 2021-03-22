package ejercicios.ejercicio3;

public class Libro {

    private String titulo;
    private String isbn;
    private String autor;
    private boolean prestado = false;

    public Libro(){
    }

    public Libro(String titulo, String isbn, String autor){
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
    }

    public void prestamo(){
        this.prestado = true;
    }

    public void devolucion(){
        this.prestado = false;
    }

    @Override
    public String toString(){
        return this.titulo + ", " + this.autor + ", " + this.isbn + ".";
    }
}
