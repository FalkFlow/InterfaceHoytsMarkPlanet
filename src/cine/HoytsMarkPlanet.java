/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cine;

/**
 *
 * @author martin
 */
public class HoytsMarkPlanet extends javax.swing.JFrame {

    /**
     * Creates new form HoytsMarkPlanet
     */
    public HoytsMarkPlanet() {
        initComponents();
        
        Bienvenida bv = new Bienvenida();
        bv.setSize(666,750);
        bv.setLocation(0,0);
        
        contains.removeAll();
        contains.add(bv);
        contains.revalidate();
        contains.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        barSide = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        addMovie = new javax.swing.JButton();
        listsMovies = new javax.swing.JButton();
        modMovies = new javax.swing.JButton();
        removeMovies = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        contains = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        exitButton = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HMPAPP");
        setMaximumSize(new java.awt.Dimension(1000, 750));
        setMinimumSize(new java.awt.Dimension(1000, 750));
        setName("Principal"); // NOI18N
        setResizable(false);

        barSide.setBackground(new java.awt.Color(51, 153, 255));
        barSide.setPreferredSize(new java.awt.Dimension(333, 750));

        jPanel2.setBackground(new java.awt.Color(51, 153, 255));

        addMovie.setBackground(new java.awt.Color(51, 153, 255));
        addMovie.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        addMovie.setForeground(new java.awt.Color(255, 255, 0));
        addMovie.setText("Agregar Pelicula");
        addMovie.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255)));
        addMovie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMovieActionPerformed(evt);
            }
        });

        listsMovies.setBackground(new java.awt.Color(51, 153, 255));
        listsMovies.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        listsMovies.setForeground(new java.awt.Color(255, 255, 0));
        listsMovies.setText("Listar Peliculas");
        listsMovies.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255)));
        listsMovies.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listsMoviesActionPerformed(evt);
            }
        });

        modMovies.setBackground(new java.awt.Color(51, 153, 255));
        modMovies.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        modMovies.setForeground(new java.awt.Color(255, 255, 0));
        modMovies.setText("Modificar Pelicula");
        modMovies.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255)));
        modMovies.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modMoviesActionPerformed(evt);
            }
        });

        removeMovies.setBackground(new java.awt.Color(51, 153, 255));
        removeMovies.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        removeMovies.setForeground(new java.awt.Color(255, 255, 0));
        removeMovies.setText("Remover Pelicula");
        removeMovies.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255)));
        removeMovies.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeMoviesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(removeMovies, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                    .addComponent(modMovies, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                    .addComponent(listsMovies, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addMovie, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(addMovie, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(listsMovies, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(modMovies, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(removeMovies, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(89, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("HoysMarkPlanet");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout barSideLayout = new javax.swing.GroupLayout(barSide);
        barSide.setLayout(barSideLayout);
        barSideLayout.setHorizontalGroup(
            barSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barSideLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        barSideLayout.setVerticalGroup(
            barSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barSideLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(132, Short.MAX_VALUE))
        );

        contains.setBackground(new java.awt.Color(153, 153, 153));
        contains.setPreferredSize(new java.awt.Dimension(666, 750));

        javax.swing.GroupLayout containsLayout = new javax.swing.GroupLayout(contains);
        contains.setLayout(containsLayout);
        containsLayout.setHorizontalGroup(
            containsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 661, Short.MAX_VALUE)
        );
        containsLayout.setVerticalGroup(
            containsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jDesktopPane1.setLayer(barSide, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(contains, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addComponent(barSide, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contains, javax.swing.GroupLayout.PREFERRED_SIZE, 661, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(barSide, javax.swing.GroupLayout.DEFAULT_SIZE, 729, Short.MAX_VALUE)
            .addComponent(contains, javax.swing.GroupLayout.DEFAULT_SIZE, 729, Short.MAX_VALUE)
        );

        exitButton.setText("Salir");
        exitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitButtonMouseClicked(evt);
            }
        });
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });
        jMenuBar1.add(exitButton);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addMovieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMovieActionPerformed
        // TODO add your handling code here:
        AgregarPeli annadir = new AgregarPeli();
        annadir.setSize(666,750);
        annadir.setLocation(0, 0);
        
        contains.removeAll();
        contains.add(annadir);
        contains.revalidate();
        contains.repaint();
    }//GEN-LAST:event_addMovieActionPerformed

    private void modMoviesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modMoviesActionPerformed
        ModificarPeli mood = new ModificarPeli();
        mood.setSize(666,750);
        mood.setLocation(0,0);
        
        contains.removeAll();
        contains.add(mood);
        contains.revalidate();
        contains.repaint();
    }//GEN-LAST:event_modMoviesActionPerformed

    private void listsMoviesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listsMoviesActionPerformed
        ListarPelis lp = new ListarPelis();
        lp.setSize(666,750);
        lp.setLocation(0,0);
        
        contains.removeAll();
        contains.add(lp);
        contains.revalidate();
        contains.repaint();
        
    }//GEN-LAST:event_listsMoviesActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        Bienvenida bv = new Bienvenida();
        bv.setSize(666,750);
        bv.setLocation(0,0);
        
        contains.removeAll();
        contains.add(bv);
        contains.revalidate();
        contains.repaint();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void removeMoviesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeMoviesActionPerformed
        RemovePeli rp = new RemovePeli();
        rp.setSize(666,750);
        rp.setLocation(0,0);
        
        contains.removeAll();
        contains.add(rp);
        contains.revalidate();
        contains.repaint();
    }//GEN-LAST:event_removeMoviesActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed

    }//GEN-LAST:event_exitButtonActionPerformed

    private void exitButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButtonMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitButtonMouseClicked

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
            java.util.logging.Logger.getLogger(HoytsMarkPlanet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HoytsMarkPlanet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HoytsMarkPlanet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HoytsMarkPlanet.class.getName()).log(java.uAddMovieing.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HoytsMarkPlanet().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addMovie;
    private javax.swing.JPanel barSide;
    private javax.swing.JPanel contains;
    private javax.swing.JMenu exitButton;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton listsMovies;
    private javax.swing.JButton modMovies;
    private javax.swing.JButton removeMovies;
    // End of variables declaration//GEN-END:variables
}
