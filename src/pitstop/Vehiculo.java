/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pitstop;

/**
 *
 * @author janss
 */
public class Vehiculo {
    private int idVehiculo;
    private String nSerie;
    private String marca;
    private String modelo;
    private String placa;
    private int kilometraje;
    private Cliente cliente;

    public Vehiculo(String nSerie, String marca, String modelo, String placa, int kilometraje, Cliente cliente) {
        this.nSerie = nSerie;
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.kilometraje = kilometraje;
        this.cliente = cliente;
    }

    public int getIdVehiculo() {
        return idVehiculo;
    }

    public String getnSerie() {
        return nSerie;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setnSerie(String nSerie) {
        this.nSerie = nSerie;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public void Create(){
        SqLite sql = new SqLite();
        String query = "INSERT INTO Vehiculos (modelo, marca, serie, placa, kilometraje, idCliente)"
                + " VALUES ('" + getModelo() + "', '" + getMarca() + "', '" + getnSerie() + "', '"
                + getPlaca() + "', '" + getKilometraje() + "', '" + getCliente().getIdCliente() + "');";
        sql.UpdateQuery(query);
    }
    
    public void Update(){
        SqLite sql = new SqLite();
        String query = "UPDATE Vehiculos SET modelo = '" + getModelo() + "', marca = '" + getMarca() + "', serie = '"
                + getnSerie() + "', placa = '" + getPlaca() + "', kilometraje = '" + getKilometraje()
                + "' WHERE ID = " + getIdVehiculo() + ";"; 
        sql.UpdateQuery(query);
    }
}
