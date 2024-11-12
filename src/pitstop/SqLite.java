package pitstop;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Date;
import java.util.ArrayList;
import java.text.SimpleDateFormat;

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
    
    public ArrayList<Cliente> RetrieveClientes(String query){
        try 
        (
            Connection conn = DriverManager.getConnection("jdbc:sqlite:data.db");
            Statement stmt = conn.createStatement();
        ) 
        {
            stmt.setQueryTimeout(30);
            ResultSet rs = stmt.executeQuery(query);
            ArrayList<Cliente> resultado = new ArrayList<Cliente>();
            while(rs.next()){
                int idCliente = rs.getInt("IdCliente");
                String nombre = rs.getString("nombre");
                String apellidoP = rs.getString("apellidoP");
                String apellidoM = rs.getString("apellidoM");
                String telefono = rs.getString("numeroTel");
                String email = rs.getString("eMail");
                
                Cliente x = new Cliente(idCliente, nombre, apellidoP, apellidoM, telefono, email);
                resultado.add(x);  
            }
            return resultado;
        } catch (SQLException e) {
            e.printStackTrace(System.err);
            return null;
        }
    }
    
    public ArrayList<Vehiculo> RetrieveVehiculos(String query){
        try 
        (
            Connection conn = DriverManager.getConnection("jdbc:sqlite:data.db");
            Statement stmt = conn.createStatement();
        ) 
        {
            stmt.setQueryTimeout(30);
            ResultSet rs = stmt.executeQuery(query);
            ArrayList<Vehiculo> resultado = new ArrayList<Vehiculo>();
            while(rs.next()){
                int idVehiculo = rs.getInt("IdVehiculo");
                String marca = rs.getString("marca");
                String modelo = rs.getString("modelo");
                String serie = rs.getString("serie");
                String placa = rs.getString("placa");
                String kilometraje = rs.getString("kilometraje");
                int idCliente = rs.getInt("idCliente");
                
                ArrayList<Cliente> cliente = RetrieveClientes("Select * From Clientes Where idCliente = " + idCliente);
                
                Vehiculo x = new Vehiculo(idVehiculo, serie, marca, modelo, placa, kilometraje, cliente.get(0));
                resultado.add(x);  
            }
            return resultado;
        } catch (SQLException e) {
            e.printStackTrace(System.err);
            return null;
        }
    }
    
    public ArrayList<OrdenServicio> RetrieveOrdenServicio(String query){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try 
        (
            Connection conn = DriverManager.getConnection("jdbc:sqlite:data.db");
            Statement stmt = conn.createStatement();
        ) 
        {
            stmt.setQueryTimeout(30);
            ResultSet rs = stmt.executeQuery(query);
            ArrayList<OrdenServicio> resultado = new ArrayList<OrdenServicio>();
            while(rs.next()){
                int ordenId = rs.getInt("idOrden");
                Date fechaIngreso = Date.valueOf(rs.getString("fechaCreacion"));
                OrdenServicio.Estatus estatusActual = OrdenServicio.Estatus.valueOf(rs.getString("estatus"));
                OrdenServicio.Servicios tipoServicio = OrdenServicio.Servicios.valueOf(rs.getString("tipoServicio"));
                Date fechaPromesa = Date.valueOf(rs.getString("fechaPromesa"));
                Asesor asesor = RetrieveAsesores("Select * From Empleados Where idEmpleado = " + rs.getInt("idAsesor")).get(0);
                Tecnico tecnico = RetrieveTecnicos("Select * From Empleados Where idEmpleado = " + rs.getInt("idTecnico")).get(0);
                Vehiculo vehiculo = RetrieveVehiculos("Select * From Vehiculos Where idVehiculo = " + rs.getInt("idVehiculo")).get(0);
                String servicio = rs.getString("servicio");
                
                OrdenServicio x = new OrdenServicio(ordenId, fechaIngreso, estatusActual, tipoServicio, fechaPromesa, asesor, tecnico, vehiculo, servicio);
                resultado.add(x);  
            }
            return resultado;
        } catch (SQLException e) {
            e.printStackTrace(System.err);
            return null;
        }
    }
}
