/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Menu;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Date;
import javax.swing.JOptionPane;
import pitstop.Asesor;
import pitstop.Cliente;
import pitstop.OrdenServicio;
import pitstop.SqLite;
import pitstop.Tecnico;
import pitstop.Vehiculo;
import pitstop.tablas;

/**
 *
 * @author janss
 */
public class NuevaOrden extends javax.swing.JFrame {
    
    private tablas t;
    private int idCliente;
    private int idVehiculo;
    private int idAsesor;
    private int idTecnico;
    private MenuPrincipal menu;
    
    /**
     * Creates new form NuevaOrden
     */
    public NuevaOrden(MenuPrincipal menu) {
        initComponents();
        t = new tablas();
        t.llenadoTablaClientes(tblClientes);
        t.LlenadoComboAsesores(comboAsesores);
        t.LlenadoComboTecnicos(comboTecnicos);
        this.menu = menu;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton5 = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblClientes = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblVehiculos = new javax.swing.JTable();
        btnNuevoCliente = new javax.swing.JButton();
        btnNuevoVehiculo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtDia = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtMes = new javax.swing.JTextField();
        txtAno = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtServicio = new javax.swing.JTextField();
        btnAbrir = new javax.swing.JButton();
        txtBuscarCliente = new javax.swing.JTextField();
        btnBuscarCliente = new javax.swing.JButton();
        comboTipoServicio = new javax.swing.JComboBox<>();
        comboAsesores = new javax.swing.JComboBox<>();
        comboTecnicos = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        lblCliente = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lblVehiculo = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        lblMail = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        lblSerie = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        lblPlaca = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        lblKilometraje = new javax.swing.JLabel();

        jButton5.setText("jButton5");

        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                formComponentHidden(evt);
            }
        });

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTitulo.setText("Nueva orden");

        tblClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblClientes);

        tblVehiculos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblVehiculos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblVehiculosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblVehiculos);

        btnNuevoCliente.setText("Nuevo Cliente");
        btnNuevoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoClienteActionPerformed(evt);
            }
        });

        btnNuevoVehiculo.setText("Nuevo Vehiculo");
        btnNuevoVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoVehiculoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Cliente");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Vehiculo");

        jLabel4.setText("Tipo de servicio:");

        jLabel5.setText("Fecha promesa:");

        jLabel3.setText("Asesor:");

        jLabel6.setText("Tecnico:");

        jLabel7.setText("Servicio:");

        txtDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiaActionPerformed(evt);
            }
        });

        jLabel8.setText("Dia");

        jLabel9.setText("Mes");

        jLabel10.setText("Año");

        jLabel11.setText("/");

        jLabel12.setText("/");

        btnAbrir.setText("Abrir orden");
        btnAbrir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAbrirMouseClicked(evt);
            }
        });
        btnAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirActionPerformed(evt);
            }
        });

        txtBuscarCliente.setText("Buscar cliente");

        btnBuscarCliente.setText("Buscar");
        btnBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarClienteActionPerformed(evt);
            }
        });

        comboTipoServicio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Preventivo", "Correctivo" }));
        comboTipoServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboTipoServicioActionPerformed(evt);
            }
        });

        comboAsesores.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboAsesoresItemStateChanged(evt);
            }
        });

        jLabel13.setText("Cliente:");

        jLabel15.setText("Vehiculo:");

        jLabel14.setText("Telefono:");

        jLabel16.setText("eMail:");

        jLabel17.setText("Serie:");

        jLabel18.setText("Placa:");

        jLabel19.setText("Kilometraje:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(txtBuscarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(132, 132, 132)
                                        .addComponent(btnNuevoVehiculo))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(139, 139, 139)
                                        .addComponent(btnNuevoCliente)))))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(164, 164, 164)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAbrir, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(lblKilometraje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel16)
                            .addComponent(txtServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtDia, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel11))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(14, 14, 14)
                                                .addComponent(jLabel8)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtMes, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(jLabel9)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtAno, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(jLabel10)))
                                        .addGap(22, 22, 22))
                                    .addComponent(comboTipoServicio, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(comboAsesores, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(comboTecnicos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel13)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPlaca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblSerie, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblMail, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 4, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblTitulo)
                .addGap(305, 305, 305))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(comboTipoServicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(comboAsesores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(comboTecnicos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(lblCliente))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(lblTelefono))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(lblMail))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(lblVehiculo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSerie, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel17))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(lblPlaca))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(lblKilometraje)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscarCliente))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnNuevoCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNuevoVehiculo)
                            .addComponent(btnAbrir))))
                .addContainerGap(621, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoVehiculoActionPerformed
        NuevoVehiculo nuevo = new NuevoVehiculo(false, 0, idCliente);
        nuevo.setVisible(true);
        
        nuevo.btnAceptar.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent evt){
                t.llenadoTablaVehiculos(tblVehiculos, idCliente);
                clearVehiculo();
            }
        });
    }//GEN-LAST:event_btnNuevoVehiculoActionPerformed

    private void txtDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiaActionPerformed

    private void btnBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClienteActionPerformed
        String txt = txtBuscarCliente.getText();
        if(txt.equals("")){
            t.llenadoTablaClientes(tblClientes);
        }
        else{
            t.llenadoTablaClientesFiltrado(tblClientes, "Select * From Clientes Where nombre like ('%" + txt + "%')"
                + " or apellidoP like ('%" + txt + "%')"
                        + " or apellidoM like ('%" + txt + "%')");
        }
    }//GEN-LAST:event_btnBuscarClienteActionPerformed

    private void comboTipoServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboTipoServicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboTipoServicioActionPerformed

    private void tblClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClientesMouseClicked
        int row = tblClientes.rowAtPoint(evt.getPoint());
        int id = Integer.parseInt(tblClientes.getModel().getValueAt(row, 1).toString());
        idCliente = id;
        t.llenadoTablaVehiculos(tblVehiculos, id);
        llenarLblCliente();
        clearVehiculo();
    }//GEN-LAST:event_tblClientesMouseClicked

    private void tblVehiculosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblVehiculosMouseClicked
        int row = tblVehiculos.rowAtPoint(evt.getPoint());
        int id = Integer.parseInt(tblVehiculos.getModel().getValueAt(row, 0).toString());
        idVehiculo = id;
        if(id != 0){
            llenarLblVehiculo();
        }
    }//GEN-LAST:event_tblVehiculosMouseClicked

    private void btnNuevoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoClienteActionPerformed
        NuevoCliente nuevo = new NuevoCliente(false, 0);
        nuevo.setVisible(true);
        
        nuevo.btnAceptar.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent evt){
                t.llenadoTablaClientes(tblClientes);
                idCliente = 0;
                t.llenadoTablaVehiculos(tblVehiculos, 0);
                clearVehiculo();
                clearBusqueda();
            }
        });
    }//GEN-LAST:event_btnNuevoClienteActionPerformed

    private void btnAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirActionPerformed
        SqLite sql = new SqLite();
        java.util.Date utilDate = new java.util.Date();
        try{
            Date fechaIngreso = new java.sql.Date(utilDate.getTime());
            OrdenServicio.Estatus estatusActual = OrdenServicio.Estatus.Espera;
            OrdenServicio.Servicios tipoServicio = OrdenServicio.Servicios.valueOf(comboTipoServicio.getSelectedItem().toString());
            Date fechaPromesa = Date.valueOf(Integer.parseInt(txtAno.getText()) + "-" + Integer.parseInt(txtMes.getText()) + "-" + Integer.parseInt(txtMes.getText()));
            String a[] = comboAsesores.getSelectedItem().toString().split("/");
            Asesor asesor = sql.RetrieveAsesores("Select * From Empleados Where idEmpleado = " + a[0]).get(0);
            a = comboTecnicos.getSelectedItem().toString().split("/");
            Tecnico tecnico = sql.RetrieveTecnicos("Select * From Empleados Where idEmpleado = " + a[0]).get(0);
            Vehiculo vehiculo = sql.RetrieveVehiculos("Select * From Vehiculos Where idVehiculo = " + idVehiculo).get(0);
            String servicio = txtServicio.getText();
            
            if(!servicio.equals("")){
                OrdenServicio x = new OrdenServicio(0, fechaIngreso, estatusActual, tipoServicio, fechaPromesa, asesor, tecnico, vehiculo, servicio);
            
                int confirm = JOptionPane.showConfirmDialog(null, "¿Es correcta la informacion?","Confirmacion",0);
                if (confirm == 0){
                    x.Create();
                    this.setVisible(false);
                    menu.generarInfo();
                }
            }
            else{
                JOptionPane.showMessageDialog(this, "El campo de Servicio es requerido");
            }
        }
        catch(java.lang.IllegalArgumentException e1){
            JOptionPane.showMessageDialog(this, "Formato de fecha incorrecto. Favor de usar formato DD MM AAAA");
        }
        catch(java.lang.IndexOutOfBoundsException e2){
            JOptionPane.showMessageDialog(this, "Favor de seleccionar un vehiculo y un cliente para abrir la orden");
        }
        
        
    }//GEN-LAST:event_btnAbrirActionPerformed

    private void comboAsesoresItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboAsesoresItemStateChanged
        
    }//GEN-LAST:event_comboAsesoresItemStateChanged

    private void formComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentHidden

    private void btnAbrirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAbrirMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAbrirMouseClicked

    private void llenarLblCliente(){
        SqLite sql = new SqLite();
        Cliente cliente = sql.RetrieveClientes("Select * From Clientes Where idCliente = " + idCliente).get(0);
        
        lblCliente.setText(cliente.getFullName());
        lblTelefono.setText(cliente.getTelefono());
        lblMail.setText(cliente.geteMail());
    }
    
    private void llenarLblVehiculo(){
        SqLite sql = new SqLite();
        Vehiculo vehiculo = sql.RetrieveVehiculos("Select * From Vehiculos Where idVehiculo = " + idVehiculo).get(0);
        
        lblVehiculo.setText(vehiculo.getMarca() + " " + vehiculo.getModelo());
        lblKilometraje.setText(vehiculo.getKilometraje());
        lblPlaca.setText(vehiculo.getKilometraje());
        lblSerie.setText(vehiculo.getnSerie());
    }
    
    private void clearVehiculo(){
        idVehiculo = 0;
        lblVehiculo.setText("");
        lblKilometraje.setText("");
        lblPlaca.setText("");
        lblSerie.setText("");
    }
    
    private void clearBusqueda(){
        t.llenadoTablaClientes(tblClientes);
        txtBuscarCliente.setText("");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NuevaOrden.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NuevaOrden.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NuevaOrden.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NuevaOrden.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAbrir;
    private javax.swing.JButton btnBuscarCliente;
    private javax.swing.JButton btnNuevoCliente;
    private javax.swing.JButton btnNuevoVehiculo;
    private javax.swing.JComboBox<String> comboAsesores;
    private javax.swing.JComboBox<String> comboTecnicos;
    private javax.swing.JComboBox<String> comboTipoServicio;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblKilometraje;
    private javax.swing.JLabel lblMail;
    private javax.swing.JLabel lblPlaca;
    private javax.swing.JLabel lblSerie;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblVehiculo;
    private javax.swing.JTable tblClientes;
    private javax.swing.JTable tblVehiculos;
    private javax.swing.JTextField txtAno;
    private javax.swing.JTextField txtBuscarCliente;
    private javax.swing.JTextField txtDia;
    private javax.swing.JTextField txtMes;
    private javax.swing.JTextField txtServicio;
    // End of variables declaration//GEN-END:variables
}
