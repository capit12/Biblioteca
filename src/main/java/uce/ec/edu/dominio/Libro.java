package uce.ec.edu.dominio;

public class Libro {
    private String isbn;
    private String titulo;
    private String editorial;
    private int anioEdicion;

    public Libro() {
    }

    public Libro(String isbn, String titulo, String editorial, int anioEdicion) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.editorial = editorial;
        this.anioEdicion = anioEdicion;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getAnioEdicion() {
        return anioEdicion;
    }

    public void setAnioEdicion(int anioEdicion) {
        this.anioEdicion = anioEdicion;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "isbn='" + isbn + '\'' +
                ", titulo='" + titulo + '\'' +
                ", editorial='" + editorial + '\'' +
                ", anioEdicion=" + anioEdicion +
                '}';
    }
}