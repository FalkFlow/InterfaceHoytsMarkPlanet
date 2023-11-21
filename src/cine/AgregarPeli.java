/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package cine;
 
/**
 *
 * @author martin
 */

import conexion.Conexion;
import java.sql.*;
import javax.swing.JOptionPane;

public class AgregarPeli extends javax.swing.JPanel {

    /**
     * Creates new form AgregarPeli
     */
    public AgregarPeli() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nameGroup = new javax.swing.JLabel();
        cleanFields = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        idText = new javax.swing.JTextField();
        titleText = new javax.swing.JTextField();
        titleLabel = new javax.swing.JLabel();
        directorLabel = new javax.swing.JLabel();
        directorText = new javax.swing.JTextField();
        annoLabel = new javax.swing.JLabel();
        idLabel = new javax.swing.JLabel();
        annoText = new javax.swing.JTextField();
        genLabel = new javax.swing.JLabel();
        genText = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        duracion_peli = new javax.swing.JTextField();
        Send = new javax.swing.JButton();

        setBackground(new java.awt.Color(51, 153, 255));
        setForeground(new java.awt.Color(0, 51, 255));
        setPreferredSize(new java.awt.Dimension(666, 750));

        nameGroup.setBackground(new java.awt.Color(51, 153, 255));
        nameGroup.setFont(new java.awt.Font("DejaVu Math TeX Gyre", 1, 36)); // NOI18N
        nameGroup.setForeground(new java.awt.Color(224, 214, 34));
        nameGroup.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nameGroup.setText("Agregar Pelicula");

        cleanFields.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        cleanFields.setText("Limpiar Campos");
        cleanFields.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cleanFieldsActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));

        idText.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        titleText.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        titleLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        titleLabel.setText("Titulo:");

        directorLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        directorLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        directorLabel.setText("Director:");

        directorText.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        annoLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        annoLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        annoLabel.setText("Año:");

        idLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        idLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        idLabel.setText("ID:");

        annoText.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        genLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        genLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        genLabel.setText("Genero:");

        genText.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        jLabel1.setText("Duracion:");

        duracion_peli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                duracion_peliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(titleLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(annoLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(directorLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                            .addComponent(idLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(genLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(51, 51, 51))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(directorText, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)
                            .addComponent(annoText)
                            .addComponent(titleText)
                            .addComponent(idText)
                            .addComponent(genText))
                        .addGap(13, 13, 13))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(duracion_peli, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idLabel)
                    .addComponent(idText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 38, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titleLabel)
                    .addComponent(titleText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 38, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(annoLabel)
                    .addComponent(annoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 38, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(directorLabel)
                    .addComponent(directorText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 39, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genLabel)
                    .addComponent(genText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(duracion_peli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        Send.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Send.setText("Enviar");
        Send.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SendActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameGroup, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(118, Short.MAX_VALUE)
                .addComponent(cleanFields)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                .addComponent(Send)
                .addContainerGap(117, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {Send, cleanFields});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(nameGroup, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cleanFields)
                    .addComponent(Send))
                .addContainerGap(163, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void SendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SendActionPerformed
        String id = idText.getText();
        String title = titleText.getText();
        String anno = annoText.getText();
        String director = directorText.getText();
        String gen = genText.getText();
        String duracion = duracion_peli.getText();
        try {
            Connection con = Conexion.getConexion();
            PreparedStatement ps = con.prepareStatement("INSERT INTO peliculas (id, titulo, annio, director, genero, duracion) VALUES (?, ?, ?, ?, ?, ?)");
            ps.setString(1, id);
            ps.setString(2, title);
            ps.setString(3, anno);
            ps.setString(4, director);
            ps.setString(5, gen);
            ps.setString(5, duracion);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Película agregada correctamente");
            idText.setText("");
            titleText.setText("");
            annoText.setText("");
            directorText.setText("");
            genText.setText("");
            duracion_peli.setText("");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, e.getMessage());

        }
    }//GEN-LAST:event_SendActionPerformed

    private void cleanFieldsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cleanFieldsActionPerformed
        // TODO add your handling code here:
        idText.setText("");
        titleText.setText("");
        annoText.setText("");
        directorText.setText("");
        genText.setText("");
        duracion_peli.setText("");
    }//GEN-LAST:event_cleanFieldsActionPerformed

    private void duracion_peliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_duracion_peliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_duracion_peliActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Send;
    private javax.swing.JLabel annoLabel;
    private javax.swing.JTextField annoText;
    private javax.swing.JButton cleanFields;
    private javax.swing.JLabel directorLabel;
    private javax.swing.JTextField directorText;
    private javax.swing.JTextField duracion_peli;
    private javax.swing.JLabel genLabel;
    private javax.swing.JTextField genText;
    private javax.swing.JLabel idLabel;
    private javax.swing.JTextField idText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nameGroup;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JTextField titleText;
    // End of variables declaration//GEN-END:variables
}
