/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package cine;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author martin
 */
public class RemovePeli extends javax.swing.JPanel {

    /**
     * Creates new form RemovePeli
     */
    public RemovePeli() {
        initComponents();
        cargarTabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jLabel1 = new javax.swing.JLabel();
                jScrollPane1 = new javax.swing.JScrollPane();
                jTable1 = new javax.swing.JTable();
                AcceptRemove = new javax.swing.JButton();

                setBackground(new java.awt.Color(51, 153, 255));
                setPreferredSize(new java.awt.Dimension(666, 750));

                jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
                jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel1.setText("Remover Pelicula");

                jTable1.setBackground(new java.awt.Color(204, 204, 204));
                jTable1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
                jTable1.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {

                        },
                        new String [] {
                                "ID", "Titulo", "Año", "Director", "Genero", "Duracion"
                        }
                ));
                jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                jTable1MouseClicked(evt);
                        }
                });
                jScrollPane1.setViewportView(jTable1);

                AcceptRemove.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
                AcceptRemove.setText("Remover");
                AcceptRemove.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                AcceptRemoveActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
                this.setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(AcceptRemove)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 642, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
                                .addGap(91, 91, 91)
                                .addComponent(AcceptRemove)
                                .addGap(104, 104, 104))
                );
        }// </editor-fold>//GEN-END:initComponents

    private void AcceptRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AcceptRemoveActionPerformed
        // TODO add your handling code here:
        int fila = jTable1.getSelectedRow();
        int id = Integer.parseInt(jTable1.getValueAt(fila, 0).toString());
        int eleccion = JOptionPane.showConfirmDialog(null,
                "¿Esta seguro de Remover esta pelicula?", "Elija una opcion",JOptionPane.YES_NO_OPTION);
        if (eleccion == JOptionPane.YES_OPTION){
                try{
                        PreparedStatement elimi;
                        Connection con = Conexion.getConexion();
                        elimi = con.prepareStatement("DELETE FROM peliculas WHERE id ='"+id+"'");
                        elimi.executeUpdate();
                        cargarTabla();
                }catch (SQLException e){
                        JOptionPane.showMessageDialog(null, e.toString());
                }
        }
    }//GEN-LAST:event_AcceptRemoveActionPerformed

        private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
                
        }//GEN-LAST:event_jTable1MouseClicked
    private void cargarTabla() {
    DefaultTableModel modeloTabla = (DefaultTableModel) jTable1.getModel(); // Reemplaza 'tblAlumnos' con el nombre correcto de tu JTable
    modeloTabla.setRowCount(0);
    PreparedStatement ps;
    ResultSet rs;
    ResultSetMetaData rsmd;
    int columnas;
    int[] anchos = {30, 50, 100, 30, 100, 100}; // Ajusta los anchos de las columnas según tus necesidades

    // Ajusta el ancho de cada columna en la JTable
    for (int i = 0; i < jTable1.getColumnCount(); i++) {
        jTable1.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
    }

    try {
        Connection con = Conexion.getConexion();
        ps = con.prepareStatement("SELECT  id, titulo, annio, director, genero, duracion FROM peliculas ORDER BY id ASC");
        rs = ps.executeQuery();
        rsmd = rs.getMetaData();
        columnas = rsmd.getColumnCount();

        while (rs.next()) {
            Object[] fila = new Object[columnas];
            for (int indice = 0; indice < columnas; indice++) {
                fila[indice] = rs.getObject(indice + 1);
            }
            modeloTabla.addRow(fila);
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al cargar la tabla: " + e.toString());
    }
}

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton AcceptRemove;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JTable jTable1;
        // End of variables declaration//GEN-END:variables
}
