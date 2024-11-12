/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pitstop;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author janss
 */
public class Testing {

//FUNCIONES DE PRUEBA, IGNORAR
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
    
    public static void ProbarCliente(){
        int idCliente = 0;
        String nombre = "Juan";
        String apellidoP = "Juanes";
        String apellidoM = "Juanson";
        String telefono = "9999999999";
        String email = "juan.juanes@juanson.com";

        Cliente x = new Cliente(idCliente, nombre, apellidoP, apellidoM, telefono, email);
        x.Create();
        SqLite sql = new SqLite();
        ArrayList<Cliente> res = sql.RetrieveClientes("Select * From Clientes WHERE nombre = 'Juan';");
        for(Cliente cliente : res){
            System.out.println("Nombre: " + cliente.getFullName() + " Telefono: " + cliente.getTelefono() + " eMail: " + cliente.geteMail());
        }
    }
    
    public static void ProbarVehiculo(){
        SqLite sql = new SqLite();
//        int idVehiculo = 0;
//        String marca = "Renault";
//        String modelo = "Clio";
//        String serie = "12345678901234567";
//        String placa = "abc1234";
//        String kilometraje = "199222";
//        int idCliente = 1;
//        ArrayList<Cliente> cliente = sql.RetrieveClientes("Select * From Clientes WHERE idCliente = " + idCliente);
//        
//        Vehiculo x = new Vehiculo(idVehiculo, serie, marca, modelo, placa, kilometraje, cliente.get(0));
//        x.Create();
        
        ArrayList<Vehiculo> vehiculos = sql.RetrieveVehiculos("Select * FROM Vehiculos");
        for(Vehiculo vehiculo : vehiculos){
            System.out.println("Marca: " + vehiculo.getMarca() + " Modelo: " + vehiculo.getModelo() + " Serie: " + vehiculo.getnSerie());
        }
    }
    
    public static void ProbarOrdenes(){
        SqLite sql = new SqLite();
//        int ordenId = 0;
//        Date fechaIngreso = Date.valueOf(LocalDate.now());
//        OrdenServicio.Estatus estatusActual = OrdenServicio.Estatus.Espera;
//        OrdenServicio.Servicios tipoServicio = OrdenServicio.Servicios.Preventivo;
//        Date fechaPromesa = Date.valueOf("2024-11-22");
//        
//        Asesor asesor = sql.RetrieveAsesores("Select * From Empleados Where idEmpleado = " + 4).get(0);
//        Tecnico tecnico = sql.RetrieveTecnicos("Select * From Empleados Where idEmpleado = " + 2).get(0);
//        Vehiculo vehiculo = sql.RetrieveVehiculos("Select * From Vehiculos Where idVehiculo = " + 2).get(0);
//
//        String servicio = "Pendiente reparacion";
//        
//        OrdenServicio x = new OrdenServicio(ordenId, fechaIngreso, estatusActual, tipoServicio, fechaPromesa, asesor, tecnico, vehiculo, servicio);
//        x.Create();
        
        ArrayList<OrdenServicio> ordenes = sql.RetrieveOrdenServicio("Select * From OrdenesServicio");
        for (OrdenServicio orden : ordenes){
            System.out.println("ID: " + orden.getOrdenId() + " Cliente: " + orden.getVehiculo().getCliente().getFullName() + " Vehiculo: " + orden.getVehiculo().getModelo() + " Servicio: " + orden.getServicio() + ""
                    + " Fecha ingreso: " + orden.getFechaIngreso() + " Fecha promesa: " + orden.getFechaPromesa());
        }
    }
}
