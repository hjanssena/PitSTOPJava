/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pitstop;

import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author edwin
 */
public class tablas {
    
    public void llenadoTablaClientes(JTable tabla){
        Vector<String> titulos = new Vector<String>();
        Vector<Vector<Object>> datos = new Vector<Vector<Object>>();
        
        titulos.add("Nombre ");
        titulos.add("ID");
        titulos.add("Telefono");
        titulos.add("Email");
        
        SqLite sql = new SqLite();
        ArrayList<Cliente> clientes = sql.RetrieveClientes("select * from Clientes");
        
        for(Cliente cliente : clientes){
            Vector<Object> fila = new Vector<Object>();
            fila.add(cliente.getFullName());
            fila.add(cliente.getIdCliente());
            fila.add(cliente.getTelefono());
            fila.add(cliente.geteMail());
            
            datos.add(fila); //Aquí se va armando la matriz de datos
        }
        
        DefaultTableModel modelo = new DefaultTableModel(datos, titulos);
        tabla.setModel(modelo);
    }
   public void llenadoTablaVehiculos(JTable tabla, int id){
       Vector<String> titulos = new Vector<String>();
        Vector<Vector<Object>> datos = new Vector<Vector<Object>>();
        
        titulos.add("ID");
        titulos.add("No.Serie");
        titulos.add("Marca");
        titulos.add("Modelo");
        titulos.add("Placa");
        titulos.add("Kilometraje");
                
        SqLite sql = new SqLite();
        ArrayList<Vehiculo> vehiculos = sql.RetrieveVehiculos("select * from Vehiculos");
        
        for(Vehiculo vehiculo : vehiculos ){
            if (vehiculo.getCliente().getIdCliente() == id){
                Vector<Object> fila = new Vector<Object>();
                fila.add(vehiculo.getIdVehiculo());
                fila.add(vehiculo.getnSerie());
                fila.add(vehiculo.getMarca());
                fila.add(vehiculo.getModelo());
                fila.add(vehiculo.getPlaca());
                fila.add(vehiculo.getKilometraje());
                datos.add(fila);
            }
        }
        
        DefaultTableModel modelo = new DefaultTableModel(datos, titulos);
        tabla.setModel(modelo);
   }
}
