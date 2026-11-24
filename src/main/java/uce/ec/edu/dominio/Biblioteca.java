package uce.ec.edu.dominio;


public class Biblioteca {
    private Lector[] lectores;
    private int cantidad;

    public Biblioteca() {
        this(5);
    }

    public Biblioteca(int tamano) {
        if (tamano <= 0) {
            throw new IllegalArgumentException("El tamaño debe ser mayor que 0.");
        }
        this.lectores = new Lector[tamano];
        this.cantidad = 0;
    }

    public int getCantidad() {
        return cantidad;
    }

    public int getCapacidad() {
        return lectores.length;
    }

    public boolean agregarLector(Lector lector) {
        if (lector == null || lector.getIdLector() == null || lector.getIdLector().isBlank()) {
            return false;
        }
        if (cantidad >= lectores.length) {
            return false;
        }
        if (buscarPorId(lector.getIdLector()) != null) {
            return false;
        }

        lectores[cantidad] = lector;
        cantidad++;
        return true;
    }

    public Lector buscarPorId(String idLector) {
        if (idLector == null || idLector.isBlank()) {
            return null;
        }
        for (int i = 0; i < cantidad; i++) {
            if (idLector.equals(lectores[i].getIdLector())) {
                return lectores[i];
            }
        }
        return null;
    }

    public Lector[] listarLectores() {
        Lector[] resultado = new Lector[cantidad];
        for (int i = 0; i < cantidad; i++) {
            resultado[i] = lectores[i];
        }
        return resultado;
    }


    public boolean actualizarLector(String idLector, String nuevoNombre, String nuevoCorreo, boolean estaActivo) {
        int indice = buscarIndicePorId(idLector);
        if (indice == -1) {
            return false;
        }

        Lector lectorExistente = lectores[indice];
        if (nuevoNombre != null && !nuevoNombre.isBlank()) {
            lectorExistente.setNombreCompleto(nuevoNombre);
        }
        if (nuevoCorreo != null && !nuevoCorreo.isBlank()) {
            lectorExistente.setCorreoInstitucional(nuevoCorreo);
        }
        lectorExistente.setEstaActivo(estaActivo);
        return true;
    }


    public boolean eliminarLector(String idLector) {
        int indice = buscarIndicePorId(idLector);
        if (indice == -1) {
            return false;
        }


        for (int i = indice; i < cantidad - 1; i++) {
            lectores[i] = lectores[i + 1];
        }

        lectores[cantidad - 1] = null;
        cantidad--;
        return true;
    }

    private int buscarIndicePorId(String idLector) {
        if (idLector == null || idLector.isBlank()) {
            return -1;
        }
        for (int i = 0; i < cantidad; i++) {
            if (idLector.equals(lectores[i].getIdLector())) {
                return i;
            }
        }
        return -1;
    }
}