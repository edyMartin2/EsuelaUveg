package Controllers;

import java.util.ArrayList;
import java.util.List;

public class UsuarioBase {
    private Integer Id;
    private String Nombre;
    private String Apellido;
    private String Correo;

    public UsuarioBase(Integer id , String Nombre, String Apellido, String Correo){
        this.Id = id;
        this.Nombre =Nombre;
        this.Apellido = Apellido;
        this.Correo = Correo;
    }

    public  List<String> ImprimirPerfil (){
        List<String> Perfil = new ArrayList<>();
        String id = String.valueOf(Id);
        Perfil.add(Nombre);
        Perfil.add(Apellido);
        Perfil.add(Correo);
        Perfil.add(id);
        return Perfil;
    }

    
}
