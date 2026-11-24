package uce.ec.edu.dominio;

public class Docente extends Lector {
    private String departamentoAcademico;

    public Docente() {
        super();
    }

    public Docente(String idLector, String nombreCompleto, String correoInstitucional, boolean estaActivo, String departamentoAcademico) {
        super(idLector, nombreCompleto, correoInstitucional, estaActivo);
        this.departamentoAcademico = departamentoAcademico;
    }

    public String getDepartamentoAcademico() {
        return departamentoAcademico;
    }

    public void setDepartamentoAcademico(String departamentoAcademico) {
        this.departamentoAcademico = departamentoAcademico;
    }

    @Override
    public String toString() {
        return "Docente{" +
                "departamentoAcademico='" + departamentoAcademico + '\'' +
                ", " + super.toString() +
                '}';
    }

    @Override
    public int calcularDiasPrestamo() {
        return 15;
    }

    @Override
    public double calcularMulta(int diasAtraso, double valorAPagar) {
        return super.calcularMulta(diasAtraso, valorAPagar)/2;
    }
}