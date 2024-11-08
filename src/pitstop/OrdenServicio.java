/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pitstop;
import java.sql.Date;
import java.time.LocalDateTime;

/**
 *
 * @author janss
 */
public class OrdenServicio {
    public enum Estatus {Espera, Proceso, Detenida, Terminada};
    public enum Servicios {Preventivo, Correctivo};
    
    private int ordenId;
    private LocalDateTime fechaIngreso;
    private Estatus estatusActual;
    private Servicios tipoServicio;
    private LocalDateTime fechaPromesa;
    private Asesor asesor;
    private Tecnico tecnico;
    private Vehiculo vehiculo;
    private String servicio;

    public int getOrdenId(){
        return ordenId;
    }
    
    public LocalDateTime getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDateTime fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Estatus getEstatusActual() {
        return estatusActual;
    }

    public void setEstatusActual(Estatus estatusActual) {
        this.estatusActual = estatusActual;
    }

    public Servicios getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(Servicios tipoServicio) {
        this.tipoServicio = tipoServicio;
    }
    
    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public LocalDateTime getFechaPromesa() {
        return fechaPromesa;
    }

    public void setFechaPromesa(LocalDateTime fechaPromesa) {
        this.fechaPromesa = fechaPromesa;
    }

    public Asesor getAsesor() {
        return asesor;
    }

    public void setAsesor(Asesor asesor) {
        this.asesor = asesor;
    }

    public Tecnico getTecnico() {
        return tecnico;
    }

    public void setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public OrdenServicio(LocalDateTime fechaIngreso, Estatus estatusActual, Servicios tipoServicio, LocalDateTime fechaPromesa, Asesor asesor, Tecnico tecnico, Vehiculo vehiculo, String servicio) {
        this.fechaIngreso = fechaIngreso;
        this.estatusActual = estatusActual;
        this.tipoServicio = tipoServicio;
        this.fechaPromesa = fechaPromesa;
        this.asesor = asesor;
        this.tecnico = tecnico;
        this.vehiculo = vehiculo;
        this.servicio = servicio;
    }
    
    public void Create(){
        SqLite sql = new SqLite();
        String query = "INSERT INTO OrdenesServicio (fechaCreacion, estatus, tipoServicio, fechaPromesa, idAsesor, idTecnico, idVehiculo, servicio)"
                + " VALUES (" + "now" + ", '" + getEstatusActual() + "', '" + getTipoServicio() + "', '"
                + getFechaPromesa().toString().replace('T', ' ') + "', '" + getAsesor().getId() + "', '" + getTecnico().getId() + "', '"
                + getVehiculo().getIdVehiculo() + "', '" + getServicio() + "');";
        sql.UpdateQuery(query);
    }
    
    public void Update(){
        SqLite sql = new SqLite();
        String query = "UPDATE OrdenesServicio SET estatus = '" + getEstatusActual() + "', tipoServicio = '" + getTipoServicio() + "', fechaPromesa = '"
                + getFechaPromesa().toString().replace('T', ' ') + "', idAsesor = '" + getAsesor().getId()
                + "', idTecnico = '" + getTecnico().getId() + "', idVehiculo = '" + getVehiculo().getIdVehiculo() + "', servicio = '" + getServicio()
                + "' WHERE idOrden = " + getOrdenId() + ";"; 
        sql.UpdateQuery(query);
    }
}
