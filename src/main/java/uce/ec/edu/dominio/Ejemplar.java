package uce.ec.edu.dominio;

public class Ejemplar {
    private String codigoBarras;
    private String estado;
    private Libro libro;

    public Ejemplar() {
    }

    public Ejemplar(String codigoBarras, String estado, Libro libro) {
        this.codigoBarras = codigoBarras;
        this.estado = estado;
        this.libro = libro;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    @Override
    public String toString() {
        return "Ejemplar{" +
                "codigoBarras='" + codigoBarras + '\'' +
                ", estado='" + estado + '\'' +
                ", libro=" + libro +
                '}';
    }
}