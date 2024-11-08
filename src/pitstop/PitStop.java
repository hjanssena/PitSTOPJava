/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pitstop;
import java.util.Scanner;
import java.util.ArrayList;

public class PitStop {

    public static void main(String[] args) {
        ProbarCrearAsesor();
    }
    
    
    
//FUNCION DE PRUEBA, IGNORAR
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
        ArrayList<Tecnico> res = sql.RetrieveTecnicos("Select * From Empleados;");
        for(Tecnico empleado : res){
            System.out.println("Nombre: " + empleado.getFullName() + " Telefono: " + empleado.getTelefono() + " eMail: " + empleado.geteMail() + " Nivel: " + empleado.getNivelTecnico());
        }
    }
    
    public static void ProbarCrearAsesor(){
//        String nombre = "Jorge";
//        String apellidoP = "Sansores";
//        String apellidoM = "Paaafasfa";
//        String telefono = "1234567891011";
//        String email = "paaafasfa@google.com";
//        
//        
//        Asesor nuevo = new Asesor(0, nombre, apellidoP, apellidoM, telefono, email);
//        nuevo.Create();
        
        SqLite sql = new SqLite();
        ArrayList<Asesor> res = sql.RetrieveAsesores("Select * From Empleados;");
        for(Asesor empleado : res){
            System.out.println("Nombre: " + empleado.getFullName() + " Telefono: " + empleado.getTelefono() + " eMail: " + empleado.geteMail());
        }
        
//        res.get(0).setNombre("Jerry");
//        res.get(0).setApellidoP("Mendez");
//        res.get(0).setApellidoM("Carvajo");
//        res.get(0).setTelefono("9992458892");
//        res.get(0).seteMail("jerry.mendez@juarez.net");
//        res.get(0).Update();
    }
}
