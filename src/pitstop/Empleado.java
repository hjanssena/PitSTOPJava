/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pitstop;

/**
 *
 * @author janss
 */
public abstract class Empleado implements Nombre {
    private int idEmpleado;
    private String nombre;
    private String apellidoP;
    private String apellidoM;
    private int telefono;
    private String email;
    
    public int getId(){
        return idEmpleado;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoP() {
        return apellidoP;
    }

    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    public String getApellidoM() {
        return apellidoM;
    }

    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Empleado(int id, String nombre, String apellidoP, String apellidoM, int telefono, String email) {
        idEmpleado = id;
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.telefono = telefono;
        this.email = email;
    }
    
    public String getFullName(){
        return getNombre() + " " + getApellidoP() + " " + getApellidoM();
    }
}
