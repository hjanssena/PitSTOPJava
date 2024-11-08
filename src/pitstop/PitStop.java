/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pitstop;
import java.util.Scanner;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class PitStop {

    public static void main(String[] args) {
        ProbarCrearTecnico();
    }
    
    public static void ProbarCrearTecnico(){
//        String nombre = "John";
//        String apellidoP = "Wick";
//        String apellidoM = "Gonzalez";
//        String telefono = "9999441125";
//        String email = "john.wick@google.com";
//        Tecnico.nivel nivel = Tecnico.nivel.Intermedio;
//        
//        
//        Tecnico nuevo = new Tecnico(nombre, apellidoP, apellidoM, telefono, email, nivel);
//        nuevo.Create();
        SqLite sql = new SqLite();
        ResultSet res = sql.RetrieveQuery("Select * From Empleados");
        ArrayList<String[]> empleados = new ArrayList<String[]>();
        try{
            while(res.next()){
                String[] array = new String[6];
                array[0] = Integer.toString(res.getInt("IdEmpleado"));
                array[1] = res.getString("nombre");
                array[2] = res.getString("apellidoP");
                array[3] = res.getString("apellidoM");
                array[4] = res.getString("numeroTel");
                array[5] = res.getString("eMail");
                array[6] = res.getString("nivel");
                
                empleados.add(array);
            }
        }catch(SQLException e){
            e.printStackTrace(System.err);
        }
        
        for(String[] empleado : empleados){
            System.out.println("Nombre: " + empleado[1] + " Apellidos: " + empleado[2] + " " + empleado[3] + " Telefono: " + empleado[4] + " eMail: " + empleado[5] + " Nivel: " + empleado[6]);
        }
    }
}
