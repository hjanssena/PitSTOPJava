/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pitstop;

/**
 *
 * @author janss
 */
public class Cliente implements Nombre {
    private int idCliente;
    private String nombre;
    private String apellidoP;
    private String apellidoM;
    private String telefono;
    private String eMail;

    public int getIdCliente() {
        return idCliente;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public Cliente(int idCliente, String nombre, String apellidoP, String apellidoM, String telefono, String eMail) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.telefono = telefono;
        this.eMail = eMail;
    }
    
    public String getFullName(){
        return getNombre() + " " + getApellidoP() + " " + getApellidoM();
    }
    
    public void Create(){
        SqLite sql = new SqLite();
        String query = "INSERT INTO Clientes (nombre, apellidoP, apellidoM, numeroTel, eMail)"
                + " VALUES (" + getNombre() + ", " + getApellidoP() + ", " + getApellidoM() + ", " + getTelefono() + ", " + geteMail() + ");";
        sql.UpdateQuery(query);
    }
    
    public void Update(){
        SqLite sql = new SqLite();
        String query = "UPDATE Clientes SET nombre = " + getNombre() + ", apellidoP = " + getApellidoP() + ", apellidoM = " + getApellidoM() + ", numeroTel = " + getTelefono() + ""
                + ", eMail = " + geteMail() + " WHERE ID = " + getIdCliente() + ";"; 
        sql.UpdateQuery(query);
    }
}
