package Controllers;

public class Tutor extends UsuarioBase {

    private Alumno al;



    public Tutor (Integer id, String Nombre, String Apellido, String Correo){
        super(id, Nombre, Apellido, Correo);
    }

    public void setAlumno (Alumno al){
        this.al = al;
    }

    public Double mostrarCalificaciones(){
        Double calificacion = this.al.mostrarCalificaciones();
        return calificacion;
    }

}