import java.sql.Connection;
import java.util.List;
import Controllers.*;
import Models.*;
import Models.Maestro;

public class App {
    private Connection conn;

    public static void main(String[] args) throws Exception {
        // Alumno Al = new Alumno(2, "Edgar", "Valerio", "edgar.edgarroman@gmail.com");
        // boolean nueva_calificacion = Al.guardarCalificacion(9.1);
        // Double obtener_calificacion = Al.mostrarCalificaciones();
        // List<String> perfil = Al.ImprimirPerfil();
        // perfil.add(String.valueOf(obtener_calificacion));
        // System.out.println(perfil);

        // Maestro Ma = new Maestro(1, "Nombre", "Apellido", "Correo");
        // List<String> info = Ma.ImprimirPerfil();
        // System.out.print(info);

        // Tutor Tu = new Tutor(1, "Nombre", "Apellido", "Correo");
        // List<String> infoTu = Tu.ImprimirPerfil();
        // Tu.setAlumno(Al);   
        // Double x = Tu.mostrarCalificaciones();
        // System.err.println(infoTu);

        Maestro mdm = new Maestro(1, "Edgar", "valerio", "Maerin");
        mdm.SaveDataOn();


    }

}
