package uce.ec.edu.dominio;
import java.util.Arrays;

public class Biblioteca {

    private Lector[] lectores;
    private int cantidad;

    public Biblioteca() {
        this(5);
    }

    public Biblioteca(int tamano) {
        this.lectores = new Lector[tamano];
        this.cantidad = 0;
    }
    //Metodo auxiliar
    private void redimensionar() {
        int nuevoTamano = lectores.length + 1;
        lectores = Arrays.copyOf(lectores, nuevoTamano);
    }

    public Lector[] listarLectores() {
        return Arrays.copyOf(lectores, cantidad);
    }

    public boolean agregarLector(Lector lector) {
        if (lector == null || buscar(lector.getNombreCompleto()) != null) {
            return false;
        }
        if (cantidad == lectores.length) {
            redimensionar();
        }
        lectores[cantidad] = lector;
        cantidad++;
        return true;
    }


    public Lector buscar(String nombreCompleto) {
        if (nombreCompleto == null) {
            return null;
        }
        for (int i = 0; i < cantidad; i++) {
            if (lectores[i].getNombreCompleto().equals(nombreCompleto)) {
                return lectores[i];
            }
        }
        return null;
    }

    public Lector buscarLector(Lector lector) {
        if (lector == null) {
            return null;
        }
        return buscar(lector.getNombreCompleto());
    }

    // Devuelve la posición del lector o -1 si no existe
    public int buscarIndice(Lector lector) {
        if (lector == null) {
            return -1;
        }
        for (int i = 0; i < cantidad; i++) {
            if (lectores[i].getNombreCompleto().equals(lector.getNombreCompleto())) {
                return i;
            }
        }
        return -1;
    }

    public boolean actualizar(String nombreCompleto, String nuevo) {
        Lector lector = buscar(nombreCompleto);
        if (lector == null || nuevo == null) {
            return false;
        }
        lector.setNombreCompleto(nuevo);
        return true;
    }


    public boolean actualizar(Lector lec, String nuevo) {
        Lector encontrado = buscarLector(lec);
        if (encontrado == null || nuevo == null) {
            return false;
        }
        encontrado.setNombreCompleto(nuevo);
        return true;
    }

    public boolean eliminar(String nombreCompleto) {
        if (nombreCompleto == null) {
            return false;
        }
        for (int i = 0; i < cantidad; i++) {
            if (nombreCompleto.equals(lectores[i].getNombreCompleto())) {
                for (int j = i; j < cantidad - 1; j++) {
                    lectores[j] = lectores[j + 1];
                }
                lectores[cantidad - 1] = null;
                cantidad--;
                return true;
            }
        }
        return false;
    }
}