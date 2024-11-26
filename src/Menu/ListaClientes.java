/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Menu;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import pitstop.tablas;

/**
 *
 * @author janss
 */
public class ListaClientes extends javax.swing.JFrame {
    public tablas tablas = new tablas();
    public int idCliente;
    public int idVehiculo;
    /**
     * Creates new form ListaClientes
     */
    public ListaClientes() {
        initComponents();
        tablaClientes();
        desactivarEdicion();
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lClientes = new javax.swing.JLabel();
        bEditarClientes = new javax.swing.JToggleButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tVehiculos = new javax.swing.JTable();
        lVehiculos = new javax.swing.JLabel();
        bEditarVehiculos = new javax.swing.JToggleButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tClientes = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        lClientes.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        lClientes.setText("Clientes");

        bEditarClientes.setText("Editar Clientes");
        bEditarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEditarClientesActionPerformed(evt);
            }
        });

        tVehiculos.setModel(new javax.swing.table.DefaultTableModel(
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
        tVehiculos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tVehiculosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tVehiculos);

        lVehiculos.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        lVehiculos.setText("Vehiculos");

        bEditarVehiculos.setText("Editar Vehiculos");
        bEditarVehiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEditarVehiculosActionPerformed(evt);
            }
        });

        tClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        )

    );
    tClientes.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            tClientesMouseClicked(evt);
        }
    });
    jScrollPane3.setViewportView(tClientes);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addContainerGap())
        .addGroup(layout.createSequentialGroup()
            .addGap(164, 164, 164)
            .addComponent(lClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGap(50, 50, 50)
            .addComponent(bEditarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(177, 177, 177)
            .addComponent(lVehiculos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGap(40, 40, 40)
            .addComponent(bEditarVehiculos, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(51, 51, 51))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGap(15, 15, 15)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(bEditarClientes)
                .addComponent(lClientes)
                .addComponent(bEditarVehiculos)
                .addComponent(lVehiculos))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane2)
                .addComponent(jScrollPane3))
            .addContainerGap())
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bEditarVehiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEditarVehiculosActionPerformed
        boolean open = true;
        NuevoVehiculo edit = new NuevoVehiculo(open, idVehiculo, idCliente);
        edit.btnAceptar.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent evt){
                tablaClientes();
                tablaVehiculos(idCliente);
            }
        });
        edit.setVisible(true);
    }//GEN-LAST:event_bEditarVehiculosActionPerformed

    private void bEditarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEditarClientesActionPerformed
        // TODO add your handling code here:
        boolean open = true;
        NuevoCliente edit = new NuevoCliente(open, idCliente);
        edit.btnAceptar.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent evt){
                tablaClientes();
                tablaVehiculos(idCliente);
            }
        });
        edit.setVisible(true);
    }//GEN-LAST:event_bEditarClientesActionPerformed

    private void tClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tClientesMouseClicked
        // TODO add your handling code here:
        int row = tClientes.rowAtPoint(evt.getPoint());
        int id = Integer.parseInt(tClientes.getModel().getValueAt(row, 1).toString());
        idCliente = id;
        tablaVehiculos(id);
    }//GEN-LAST:event_tClientesMouseClicked

    private void tVehiculosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tVehiculosMouseClicked
        int row = tVehiculos.rowAtPoint(evt.getPoint());
        int id = Integer.parseInt(tVehiculos.getModel().getValueAt(row, 0).toString());
        idVehiculo = id;
    }//GEN-LAST:event_tVehiculosMouseClicked

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowGainedFocus

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_formFocusGained
    public void tablaClientes(){
        tablas.llenadoTablaClientes(tClientes);
    }
    
    public void tablaVehiculos(int id){
        if(id != 0){
            tablas.llenadoTablaVehiculos(tVehiculos, id);
        }
    }
   
    public void desactivarEdicion(){
        tClientes.setDefaultEditor(Object.class, null); 
        tVehiculos.setDefaultEditor(Object.class, null);
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
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
            java.util.logging.Logger.getLogger(ListaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton bEditarClientes;
    private javax.swing.JToggleButton bEditarVehiculos;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lClientes;
    private javax.swing.JLabel lVehiculos;
    private javax.swing.JTable tClientes;
    private javax.swing.JTable tVehiculos;
    // End of variables declaration//GEN-END:variables
}
