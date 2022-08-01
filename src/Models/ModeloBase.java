package Models;

import java.sql.Connection;
import java.sql.DriverManager;

public class ModeloBase {
    protected Integer Id;
    protected String Nombre;
    protected String Apellido;
    protected String Correo;
    protected Connection conn;

    public ModeloBase(Integer Id, String Nombre, String Apellido, String Correo) {
        this.Id = Id;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Correo = Correo;
        try {
            this.conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Escuela", "root", "2541");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
