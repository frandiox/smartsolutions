/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package diaketas.UI.HistorialesyAcciones;

import diaketas.UI.UI;
import javax.swing.JOptionPane;

/**
 *
 * @author cesar
 */
public class jHistorialSeleccionarUsuario extends javax.swing.JPanel {


    
    jHistorialUsuarios historialUsuarios;
    
    /**
     * Creates new form jAltaBeneficiario
     */
    public jHistorialSeleccionarUsuario() {
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

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        NIF_CIF = new javax.swing.JTextField();
        botonOK = new javax.swing.JButton();
        botonCancel = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 153));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Historial y Acciones");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Historial usuarios");

        jLabel2.setText("DNI/NIF del usuario a consultar");

        NIF_CIF.setColumns(9);
        NIF_CIF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NIF_CIFKeyTyped(evt);
            }
        });

        botonOK.setText("Ok");
        botonOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonOKActionPerformed(evt);
            }
        });

        botonCancel.setText("Cancelar");
        botonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diaketas/Iconos/historiales.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1))
                    .addComponent(jLabel3)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botonOK)
                                .addGap(18, 18, 18)
                                .addComponent(botonCancel))
                            .addComponent(NIF_CIF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(NIF_CIF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonOK)
                    .addComponent(botonCancel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botonOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonOKActionPerformed
       
        
        if (NIF_CIF.getText().compareTo("") == 0){
                JOptionPane.showMessageDialog(this, "El NIF del usuario a consultar no se ha introducido.", "NIF Usuario", JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            historialUsuarios = new jHistorialUsuarios( NIF_CIF.getText().toUpperCase() );
            UI.jPrincipal.remove(historialUsuarios);
            UI.jPrincipal.add("HistorialUsuarios", historialUsuarios); 
            UI.cl.show(UI.jPrincipal, "HistorialUsuarios");
        }
    }//GEN-LAST:event_botonOKActionPerformed

    private void botonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelActionPerformed
            UI.cl.show(UI.jPrincipal, "HistorialyAcciones");
            // TODO add your handling code here:
    }//GEN-LAST:event_botonCancelActionPerformed

    private void NIF_CIFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NIF_CIFKeyTyped
        if (NIF_CIF.getText().length()>=9){
            evt.consume();
        }
    }//GEN-LAST:event_NIF_CIFKeyTyped
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField NIF_CIF;
    private javax.swing.JButton botonCancel;
    private javax.swing.JButton botonOK;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables
}
