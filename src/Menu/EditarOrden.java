/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Menu;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Date;
import java.util.ArrayList;
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
public class EditarOrden extends javax.swing.JFrame {
    
    private tablas t;
    private int idOrden;
    private MenuPrincipal menu;
    
    /**
     * Creates new form NuevaOrden
     */
    public EditarOrden(MenuPrincipal menu, int idOrden) {
        this.idOrden = idOrden;
        initComponents();
        t = new tablas();
        t.LlenadoComboAsesores(comboAsesores);
        t.LlenadoComboTecnicos(comboTecnicos);
        setInfo();
        
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
        btnConfirmar = new javax.swing.JButton();
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
        btnEditarCliente = new javax.swing.JButton();
        btnEditarVehiculo = new javax.swing.JButton();

        jButton5.setText("jButton5");

        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                formComponentHidden(evt);
            }
        });

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTitulo.setText("Editar orden");

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

        btnConfirmar.setText("Confirmar");
        btnConfirmar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConfirmarMouseClicked(evt);
            }
        });
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
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

        lblCliente.setText("cliente");

        jLabel15.setText("Vehiculo:");

        lblVehiculo.setText("vehiculo");

        jLabel14.setText("Telefono:");

        lblTelefono.setText("telefono");

        jLabel16.setText("eMail:");

        lblMail.setText("mail");

        jLabel17.setText("Serie:");

        lblSerie.setText("serie");

        jLabel18.setText("Placa:");

        lblPlaca.setText("placa");

        jLabel19.setText("Kilometraje:");

        lblKilometraje.setText("kilometraje");

        btnEditarCliente.setText("Editar Cliente");
        btnEditarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarClienteActionPerformed(evt);
            }
        });

        btnEditarVehiculo.setText("Editar Vehiculo");
        btnEditarVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarVehiculoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel18))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblKilometraje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblPlaca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblSerie, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblMail, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnEditarVehiculo)
                                .addGap(103, 103, 103))))
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
                            .addComponent(comboTecnicos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEditarCliente)
                        .addGap(107, 107, 107))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(238, 238, 238)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(253, 253, 253)
                .addComponent(lblTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
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
                            .addComponent(comboAsesores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel16))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTelefono)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEditarCliente)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(comboTecnicos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel18))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblVehiculo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSerie)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPlaca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblKilometraje)
                            .addComponent(jLabel19))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEditarVehiculo)))
                .addGap(18, 18, 18)
                .addComponent(btnConfirmar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiaActionPerformed

    private void comboTipoServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboTipoServicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboTipoServicioActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        SqLite sql = new SqLite();
        java.util.Date utilDate = new java.util.Date();
        OrdenServicio orden = sql.RetrieveOrdenServicio("Select * From OrdenesServicio Where idOrden = " + idOrden).get(0);
        try{
            orden.setEstatusActual(orden.getEstatusActual());
            orden.setTipoServicio(OrdenServicio.Servicios.valueOf(comboTipoServicio.getSelectedItem().toString()));
            orden.setFechaPromesa(Date.valueOf(txtAno.getText() + "-" + txtMes.getText() + "-" + txtMes.getText()));
            String a[] = comboAsesores.getSelectedItem().toString().split("/");
            orden.setAsesor(sql.RetrieveAsesores("Select * From Empleados Where idEmpleado = " + a[0]).get(0));
            a = comboTecnicos.getSelectedItem().toString().split("/");
            orden.setTecnico(sql.RetrieveTecnicos("Select * From Empleados Where idEmpleado = " + a[0]).get(0));
            orden.setServicio(txtServicio.getText()); 
            
            if(!orden.getServicio().equals("")){            
                int confirm = JOptionPane.showConfirmDialog(null, "¿Es correcta la informacion?","Confirmacion",0);
                if (confirm == 0){
                    orden.Update();
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
        
        
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void comboAsesoresItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboAsesoresItemStateChanged
        
    }//GEN-LAST:event_comboAsesoresItemStateChanged

    private void formComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentHidden

    private void btnConfirmarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfirmarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConfirmarMouseClicked

    private void btnEditarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarClienteActionPerformed
        SqLite sql = new SqLite();
        OrdenServicio orden = sql.RetrieveOrdenServicio("Select * From OrdenesServicio Where idOrden = " + idOrden).get(0);
        boolean open = true;
        NuevoCliente edit = new NuevoCliente(open, orden.getVehiculo().getCliente().getIdCliente());
        edit.btnAceptar.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent evt){
                setInfo();
            }
        });
        edit.setVisible(true);
    }//GEN-LAST:event_btnEditarClienteActionPerformed

    private void btnEditarVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarVehiculoActionPerformed
        SqLite sql = new SqLite();
        OrdenServicio orden = sql.RetrieveOrdenServicio("Select * From OrdenesServicio Where idOrden = " + idOrden).get(0);
        boolean open = true;
        NuevoVehiculo edit = new NuevoVehiculo(open, orden.getVehiculo().getIdVehiculo(), orden.getVehiculo().getCliente().getIdCliente());
        edit.btnAceptar.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent evt){
                setInfo();
            }
        });
        edit.setVisible(true);
    }//GEN-LAST:event_btnEditarVehiculoActionPerformed

    private void setInfo(){
        SqLite sql = new SqLite();
        OrdenServicio orden = sql.RetrieveOrdenServicio("Select * From OrdenesServicio Where idOrden = " + idOrden).get(0);
        llenarLblCliente(orden.getVehiculo().getCliente());
        llenarLblVehiculo(orden.getVehiculo());
        
        comboTipoServicio.setSelectedItem(orden.getTipoServicio().toString());
        comboAsesores.setSelectedItem(orden.getAsesor().getId() + "/" + orden.getAsesor().getFullName());
        comboTecnicos.setSelectedItem(orden.getTecnico().getId() + "/" + orden.getTecnico().getFullName());
        
        txtServicio.setText(orden.getServicio());
        txtDia.setText(orden.getFechaPromesa().toLocalDate().getDayOfMonth() + "");
        txtMes.setText(orden.getFechaPromesa().toLocalDate().getMonthValue() + "");
        txtAno.setText(orden.getFechaPromesa().toLocalDate().getYear() + "");
    }
    
    private void llenarLblCliente(Cliente cliente){
        lblCliente.setText(cliente.getFullName());
        lblTelefono.setText(cliente.getTelefono());
        lblMail.setText(cliente.geteMail());
    }
    
    private void llenarLblVehiculo(Vehiculo vehiculo){
        lblVehiculo.setText(vehiculo.getMarca() + " " + vehiculo.getModelo());
        lblKilometraje.setText(vehiculo.getKilometraje());
        lblPlaca.setText(vehiculo.getPlaca());
        lblSerie.setText(vehiculo.getnSerie());
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
            java.util.logging.Logger.getLogger(EditarOrden.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarOrden.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarOrden.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarOrden.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnEditarCliente;
    private javax.swing.JButton btnEditarVehiculo;
    private javax.swing.JComboBox<String> comboAsesores;
    private javax.swing.JComboBox<String> comboTecnicos;
    private javax.swing.JComboBox<String> comboTipoServicio;
    private javax.swing.JButton jButton5;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblKilometraje;
    private javax.swing.JLabel lblMail;
    private javax.swing.JLabel lblPlaca;
    private javax.swing.JLabel lblSerie;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblVehiculo;
    private javax.swing.JTextField txtAno;
    private javax.swing.JTextField txtDia;
    private javax.swing.JTextField txtMes;
    private javax.swing.JTextField txtServicio;
    // End of variables declaration//GEN-END:variables
}
