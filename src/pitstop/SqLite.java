package pitstop;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class SqLite {
//Funcion para escribir en la base de datos, pasar como argumento el query con la instruccion deseada
    public void UpdateQuery(String query){
        try
        (
          Connection connection = DriverManager.getConnection("jdbc:sqlite:data.db");
          Statement statement = connection.createStatement();
        )
        {
          statement.setQueryTimeout(30);
          statement.executeUpdate(query);          
        }
        catch(SQLException e)
        {
          e.printStackTrace(System.err);
        }
    }
    
//Regresa un ArrayList donde se contiene a todos los objetos de tipo empleado de la base de datos
    public ArrayList<Tecnico> RetrieveTecnicos(String query){
        try 
        (
            Connection conn = DriverManager.getConnection("jdbc:sqlite:data.db");
            Statement stmt = conn.createStatement();
        ) 
        {
            stmt.setQueryTimeout(30);
            ResultSet rs = stmt.executeQuery(query);
            ArrayList<Tecnico> resultado = new ArrayList<Tecnico>();
            while(rs.next()){
                int idEmpleado = rs.getInt("IdEmpleado");
                String nombre = rs.getString("nombre");
                String apellidoP = rs.getString("apellidoP");
                String apellidoM = rs.getString("apellidoM");
                String telefono = rs.getString("numeroTel");
                String email = rs.getString("eMail");
                String nivelS = rs.getString("nivel");
                if(nivelS != null){
                    Tecnico.nivel nivel = Tecnico.nivel.valueOf(nivelS);
                    Tecnico x = new Tecnico(idEmpleado, nombre, apellidoP, apellidoM, telefono, email, nivel);
                    resultado.add(x);
                }    
            }
            return resultado;
        } catch (SQLException e) {
            e.printStackTrace(System.err);
            return null;
        }
    }
    
        public ArrayList<Asesor> RetrieveAsesores(String query){
        try 
        (
            Connection conn = DriverManager.getConnection("jdbc:sqlite:data.db");
            Statement stmt = conn.createStatement();
        ) 
        {
            stmt.setQueryTimeout(30);
            ResultSet rs = stmt.executeQuery(query);
            ArrayList<Asesor> resultado = new ArrayList<Asesor>();
            while(rs.next()){
                int idEmpleado = rs.getInt("IdEmpleado");
                String nombre = rs.getString("nombre");
                String apellidoP = rs.getString("apellidoP");
                String apellidoM = rs.getString("apellidoM");
                String telefono = rs.getString("numeroTel");
                String email = rs.getString("eMail");
                String nivel = rs.getString("nivel");
                
                if(nivel == null){
                    Asesor x = new Asesor(idEmpleado, nombre, apellidoP, apellidoM, telefono, email);
                    resultado.add(x);  
                }
            }
            return resultado;
        } catch (SQLException e) {
            e.printStackTrace(System.err);
            return null;
        }
    }
}
