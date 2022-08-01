package Controllers;

public class Alumno extends UsuarioBase {

    private Double calificacion;

    public Alumno(Integer id, String Nombre, String Apellido, String Correo) {
        super(id, Nombre, Apellido, Correo);
    }

    // seter
    public boolean guardarCalificacion(Double calificacion) {
        try {
            this.calificacion = calificacion;
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    // geter
    public double mostrarCalificaciones() {
        return this.calificacion;
    }
}
