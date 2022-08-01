package Models;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

public class Maestro extends ModeloBase implements SaveData{


    public Maestro(Integer Id, String Nombre, String Apellido, String Correo) {
        super(Id, Nombre, Apellido, Correo);
    }

    @Override
    public void GetDataOn(Integer ID){

    }

    @Override
    public void SaveDataOn() {
        try{
            Statement stmt = (Statement) this.conn.createStatement();
            String sql_query = String.format("insert into User (Nombre, Apellido, Correo)  values ('%s','%s','%s')", this.Nombre, this.Apellido, this.Correo);
            Boolean insert = stmt.execute(sql_query); //insert.getClass().getSimpleName()
            String result = insert == true ? "Insertado": insert;
            System.out.println(result);
        }catch(Exception e ){
            System.out.println(e);
        }
    }
}
