/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentacion;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;

/**
 *
 * @author gta_2
 */
public class FrmRuleta extends javax.swing.JFrame {

    private JInternalFrame currentInternalFrame = null;
    Color defaultColor, clickedColor;

    /**
     * Creates new form FrmRuleta
     */
    public FrmRuleta() {
        initComponents();
        this.setLocationRelativeTo(null);

        /* IFrmJuegoRuleta rl = new IFrmJuegoRuleta();
         rl.setSize(1288, 817);
         rl.setLocation(0,0);
         panelContenedor.removeAll();
         panelContenedor.add(rl, BorderLayout.CENTER);
         panelContenedor.revalidate();
         panelContenedor.repaint();*/
        defaultColor = new Color(20, 19, 19);
        clickedColor = new Color(200, 21, 21);
        mnuTab1.setBackground(defaultColor);
        mnuInstrucciones.setBackground(defaultColor);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        mnuPanel = new javax.swing.JPanel();
        mnuTab1 = new javax.swing.JPanel();
        lblJugar = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        mnuInstrucciones = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        panelRuleta = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setBackground(new java.awt.Color(0, 0, 0));

        mnuPanel.setBackground(new java.awt.Color(15, 13, 13));
        mnuPanel.setPreferredSize(new java.awt.Dimension(1277, 861));

        mnuTab1.setBackground(new java.awt.Color(20, 19, 19));
        mnuTab1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mnuTab1.setDoubleBuffered(false);
        mnuTab1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnuTab1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mnuTab1MousePressed(evt);
            }
        });

        lblJugar.setBackground(new java.awt.Color(20, 19, 19));
        lblJugar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblJugar.setForeground(new java.awt.Color(188, 75, 0));
        lblJugar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblJugar.setText("JUGAR");
        lblJugar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblJugar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblJugar.setOpaque(true);
        lblJugar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblJugarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblJugarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblJugarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout mnuTab1Layout = new javax.swing.GroupLayout(mnuTab1);
        mnuTab1.setLayout(mnuTab1Layout);
        mnuTab1Layout.setHorizontalGroup(
            mnuTab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblJugar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        mnuTab1Layout.setVerticalGroup(
            mnuTab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblJugar, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/LogoN100.png"))); // NOI18N

        mnuInstrucciones.setBackground(new java.awt.Color(20, 19, 19));
        mnuInstrucciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mnuInstrucciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnuInstruccionesMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mnuInstruccionesMousePressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(188, 75, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("INSTRUCCIONES");

        javax.swing.GroupLayout mnuInstruccionesLayout = new javax.swing.GroupLayout(mnuInstrucciones);
        mnuInstrucciones.setLayout(mnuInstruccionesLayout);
        mnuInstruccionesLayout.setHorizontalGroup(
            mnuInstruccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        mnuInstruccionesLayout.setVerticalGroup(
            mnuInstruccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mnuInstruccionesLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel5)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout mnuPanelLayout = new javax.swing.GroupLayout(mnuPanel);
        mnuPanel.setLayout(mnuPanelLayout);
        mnuPanelLayout.setHorizontalGroup(
            mnuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mnuTab1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(mnuInstrucciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(mnuPanelLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel2)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        mnuPanelLayout.setVerticalGroup(
            mnuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mnuPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addGap(45, 45, 45)
                .addComponent(mnuTab1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(mnuInstrucciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(477, Short.MAX_VALUE))
        );

        panelRuleta.setBackground(new java.awt.Color(0, 0, 0));
        panelRuleta.setPreferredSize(new java.awt.Dimension(1142, 817));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FondoRuletaNegra.png"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 23, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 826, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelRuletaLayout = new javax.swing.GroupLayout(panelRuleta);
        panelRuleta.setLayout(panelRuletaLayout);
        panelRuletaLayout.setHorizontalGroup(
            panelRuletaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRuletaLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(jLabel4)
                .addGap(260, 260, 260)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelRuletaLayout.setVerticalGroup(
            panelRuletaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRuletaLayout.createSequentialGroup()
                .addGroup(panelRuletaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRuletaLayout.createSequentialGroup()
                        .addGap(444, 444, 444)
                        .addComponent(jLabel3))
                    .addGroup(panelRuletaLayout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(jLabel4))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mnuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelRuleta, javax.swing.GroupLayout.PREFERRED_SIZE, 1124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mnuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 823, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelRuleta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuTab1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuTab1MouseClicked
        /* IFrmJuegoRuleta rl = new IFrmJuegoRuleta();
         rl.setSize(1288, 817);
         rl.setLocation(0,0);
         panelContenedor.removeAll();
         panelContenedor.add(rl, BorderLayout.CENTER);
         panelContenedor.revalidate();
         panelContenedor.repaint();*/
        IFrmJuegoRuleta tab = new IFrmJuegoRuleta();
        centrarInternalFrame1(tab);
    }//GEN-LAST:event_mnuTab1MouseClicked

    private void mnuTab1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuTab1MousePressed
        mnuTab1.setBackground(defaultColor);
    }//GEN-LAST:event_mnuTab1MousePressed

    private void mnuInstruccionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuInstruccionesMouseClicked
        IFrmInstrucciones tab = new IFrmInstrucciones();
        centrarInternalFrame1(tab);
    }//GEN-LAST:event_mnuInstruccionesMouseClicked

    private void mnuInstruccionesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuInstruccionesMousePressed
        mnuInstrucciones.setBackground(defaultColor);
    }//GEN-LAST:event_mnuInstruccionesMousePressed

    private void lblJugarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblJugarMouseEntered
        lblJugar.setBackground(new Color(188, 75, 0));
        lblJugar.setForeground(Color.black);
    }//GEN-LAST:event_lblJugarMouseEntered

    private void lblJugarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblJugarMouseClicked
        IFrmJuegoRuleta tab = new IFrmJuegoRuleta();
        centrarInternalFrame1(tab);
    }//GEN-LAST:event_lblJugarMouseClicked

    private void lblJugarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblJugarMouseExited
        lblJugar.setBackground(new Color(20,19,19));
        lblJugar.setForeground(new Color(188,75,0));
    }//GEN-LAST:event_lblJugarMouseExited

    /**
     * @param args the command line arguments
     */
    private void centrarInternalFrame1(JInternalFrame interna) {
        if (currentInternalFrame != null) {
            currentInternalFrame.dispose();
        }

        currentInternalFrame = interna;

        panelRuleta.removeAll();
        panelRuleta.add(interna);

        int x = panelRuleta.getWidth() / 2 - interna.getWidth() / 2;
        int y = panelRuleta.getHeight() / 2 - interna.getHeight() / 2;

        interna.setLocation(x, y);
        interna.show();
    }

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
            java.util.logging.Logger.getLogger(FrmRuleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmRuleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmRuleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmRuleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmRuleta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblJugar;
    private javax.swing.JPanel mnuInstrucciones;
    private javax.swing.JPanel mnuPanel;
    private javax.swing.JPanel mnuTab1;
    private javax.swing.JPanel panel;
    private javax.swing.JPanel panelRuleta;
    // End of variables declaration//GEN-END:variables
}
