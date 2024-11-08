/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pitstop;

/**
 *
 * @author janss
 */
public class Asesor extends Empleado {

    public Asesor(String nombre, String apellidoP, String apellidoM, String telefono, String email) {
        super(nombre, apellidoP, apellidoM, telefono, email);
    }
    
    public void Create(){
        SqLite sql = new SqLite();
        String query = "INSERT INTO Empleados (nombre, apellidoP, apellidoM, numeroTel, eMail)"
                + " VALUES (" + getNombre() + ", " + getApellidoP() + ", " + getApellidoM() + ", " + getTelefono() + ", " + geteMail() + ");";
        sql.UpdateQuery(query);
    }
    
    public void Update(){
        SqLite sql = new SqLite();
        String query = "UPDATE Empleados SET nombre = " + getNombre() + ", apellidoP = " + getApellidoP() + ", apellidoM = " + getApellidoM() + ", numeroTel = " + getTelefono() + ""
                + ", eMail = " + geteMail() + " WHERE ID = " + getId() + ";";
        sql.UpdateQuery(query);
    }
}
