/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pitstop;

/**
 * 
 * @author janss
 */
public class Tecnico extends Empleado {
    public enum nivel {Principiante, Intermedio, Master};
    public nivel nivelTecnico;

    public nivel getNivelTecnico() {
        return nivelTecnico;
    }

    public void setNivelTecnico(nivel nivelTecnico) {
        this.nivelTecnico = nivelTecnico;
    }

    public Tecnico(int IdEmpleado, String nombre, String apellidoP, String apellidoM, String telefono, String email, nivel nivelTecnico) {
        super(IdEmpleado, nombre, apellidoP, apellidoM, telefono, email);
        this.nivelTecnico = nivelTecnico;
    }
    
    public void Create(){
        SqLite sql = new SqLite();
        String query = "INSERT INTO Empleados (nombre,apellidoP,apellidoM,numeroTel,eMail,nivel)"
                + " VALUES ('" + getNombre() + "', '" + getApellidoP() + "', '" + getApellidoM() + "', '" + getTelefono() + "', '" + geteMail() + "', '" + getNivelTecnico() + "');";
        System.out.print(query);
        sql.UpdateQuery(query);
    }
    
    public void Update(){
        SqLite sql = new SqLite();
        String query = "UPDATE Empleados SET nombre = '" + getNombre() + "', apellidoP = '" + getApellidoP() + "', apellidoM = '" + getApellidoM() + "', numeroTel = '" + getTelefono() + "'"
                + ", eMail = '" + geteMail() + "', nivel = '" + getNivelTecnico() + "' WHERE IdEmpleado = '" + getId() + "';"; 
        sql.UpdateQuery(query);
    }
}
