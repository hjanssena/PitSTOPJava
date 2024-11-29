/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pitstop;

import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JComboBox;
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
                datos.add(fila);
            }
        }
        
        DefaultTableModel modelo = new DefaultTableModel(datos, titulos);
        tabla.setModel(modelo);
   }
   
       public void llenadoTablaClientesFiltrado(JTable tabla, String query){
        Vector<String> titulos = new Vector<String>();
        Vector<Vector<Object>> datos = new Vector<Vector<Object>>();
        
        titulos.add("Nombre ");
        titulos.add("ID");
        titulos.add("Telefono");
        titulos.add("Email");
        
        SqLite sql = new SqLite();
        ArrayList<Cliente> clientes = sql.RetrieveClientes(query);
        
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
   public void llenadoTablaVehiculosFiltrado(JTable tabla, int id, String query){
       Vector<String> titulos = new Vector<String>();
        Vector<Vector<Object>> datos = new Vector<Vector<Object>>();
        
        titulos.add("ID");
        titulos.add("No.Serie");
        titulos.add("Marca");
        titulos.add("Modelo");
        titulos.add("Placa");
                
        SqLite sql = new SqLite();
        ArrayList<Vehiculo> vehiculos = sql.RetrieveVehiculos(query);
        
        for(Vehiculo vehiculo : vehiculos ){
            if (vehiculo.getCliente().getIdCliente() == id){
                Vector<Object> fila = new Vector<Object>();
                fila.add(vehiculo.getIdVehiculo());
                fila.add(vehiculo.getnSerie());
                fila.add(vehiculo.getMarca());
                fila.add(vehiculo.getModelo());
                fila.add(vehiculo.getPlaca());
                datos.add(fila);
            }
        }
        
        DefaultTableModel modelo = new DefaultTableModel(datos, titulos);
        tabla.setModel(modelo);
   }
   
   public void LlenadoComboAsesores(JComboBox<String> combo){
       SqLite sql = new SqLite();
       ArrayList<Asesor> asesores = sql.RetrieveAsesores("select * from Empleados");
       
       for(Asesor asesor : asesores){
           combo.addItem(asesor.getId() + "/" + asesor.getFullName());
       }
   }
   
      public void LlenadoComboTecnicos(JComboBox<String> combo){
       SqLite sql = new SqLite();
       ArrayList<Tecnico> tecnicos = sql.RetrieveTecnicos("select * from Empleados");
       
       for(Tecnico tecnico : tecnicos){
           combo.addItem(tecnico.getId() + "/" + tecnico.getFullName());
       }
   }
}
