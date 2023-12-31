/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package cine;

import conexion.Conexion;
import genero.Genero;
import genero.ListadoGenero;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author martin
 */
public class ListarPelis extends javax.swing.JPanel {

    /**
     * Creates new form ListarPelis
     */
    public ListarPelis() {
        initComponents();
        cargarTabla();
        cargarCombo(jComboBox1);
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
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        hasta = new javax.swing.JFormattedTextField();
        desde = new javax.swing.JFormattedTextField();

        setBackground(new java.awt.Color(51, 153, 255));
        setPreferredSize(new java.awt.Dimension(666, 750));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Listar Peliculas");

        jTable1.setBackground(new java.awt.Color(204, 204, 204));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Titulo", "Año", "Director", "Genero", "Duracion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setText("jLabel2");

        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Desde");

        jLabel4.setText("Hasta");

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        hasta.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("YYYY"))));
        hasta.setMinimumSize(new java.awt.Dimension(100, 26));
        hasta.setPreferredSize(new java.awt.Dimension(100, 26));

        desde.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("YYYY"))));
        desde.setMinimumSize(new java.awt.Dimension(100, 26));
        desde.setPreferredSize(new java.awt.Dimension(100, 26));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(desde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(hasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 293, Short.MAX_VALUE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(108, 108, 108))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(129, 129, 129))))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(desde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(106, 106, 106))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        // TODO add your handling code here:
        String query = jComboBox1.getSelectedItem().toString();
        DefaultTableModel modelo = cargarTabla();
        
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(modelo);
        jTable1.setRowSorter(tr);
        
        if (query != " "){
            tr.setRowFilter(RowFilter.regexFilter(query));
        }else{
            jTable1.setRowSorter(tr);
        }
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {
        try {
            int fila = jTable1.getSelectedRow();
            int id = Integer.parseInt(jTable1.getValueAt(fila, 0).toString());
            PreparedStatement ps;
            ResultSet rs;
            Connection con = Conexion.getConexion();
            ps = con.prepareStatement("SELECT id, titulo, annio, director, genero, duracion FROM peliculas WHERE id = ?");
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                // Recupera los detalles de la base de datos
                int movieId = rs.getInt("id");
                String titulo = rs.getString("titulo");
                int annio = rs.getInt("annio");
                String director = rs.getString("director");
                String genero = rs.getString("genero");
                String duracion = rs.getString("duracion");
    
                // Muestra los detalles en un JOptionPane
                String mensaje = "ID: " + movieId + "\nTítulo: " + titulo + "\nAño: " + annio + "\nDirector: " + director + "\nGénero: " + genero+ "\nDuracion" + duracion;
                JOptionPane.showMessageDialog(this, mensaje, "Detalles de la Película", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error al obtener detalles de la película: " + e.toString(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
private DefaultTableModel cargarTabla() {
    DefaultTableModel modeloTabla = (DefaultTableModel) jTable1.getModel(); // Reemplaza 'tblAlumnos' con el nombre correcto de tu JTable
    modeloTabla.setRowCount(0);
    PreparedStatement ps;
    ResultSet rs;
    ResultSetMetaData rsmd;
    int columnas;
    int[] anchos = {30, 50, 100, 30, 100}; // Ajusta los anchos de las columnas según tus necesidades

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
        } return modeloTabla;
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al cargar la tabla: " + e.toString());
    }
        return null;
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField desde;
    private javax.swing.JFormattedTextField hasta;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private void cargarCombo(JComboBox c) {
        DefaultComboBoxModel combo = new DefaultComboBoxModel();
        c.setModel(combo);
        ListadoGenero lg = new ListadoGenero();
        PreparedStatement ps;
        ResultSet rs;
        try {
            Connection con = Conexion.getConexion();
            ps = con.prepareStatement("SELECT DISTINCT genero FROM peliculas ORDER BY genero ASC");
            rs = ps.executeQuery();
            combo.addElement(" ");
            while (rs.next()){
                Genero g = new Genero();
                g.setNombre(rs.getString(1));
                lg.agregarGenero(g);
                combo.addElement(g.getNombre());
            } 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al cargar listado" + e.toString());
        }
    }
}
