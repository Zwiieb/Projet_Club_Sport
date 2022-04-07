/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vues;

import javax.swing.JOptionPane;

import Controleurs.Controleur;

/**
 *
 * @author wsi
 */
public class VueLogin extends javax.swing.JFrame {
	private Controleur controleur;
   
    public VueLogin(Controleur controleur) {
    	this.controleur = controleur;
    	this.controleur.getListePages().put("VueLogin",this);
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        NomField = new javax.swing.JTextField();
        mdpField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        RetourButton = new javax.swing.JButton();
        ConfButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(427, 427));

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Nom :");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(120, 120, 70, 20);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Mot de passe :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(120, 160, 90, 14);

        NomField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomFieldActionPerformed(evt);
            }
        });
        jPanel1.add(NomField);
        NomField.setBounds(229, 110, 100, 30);
        jPanel1.add(mdpField);
        mdpField.setBounds(229, 150, 100, 30);

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 2, 18)); // NOI18N
        jLabel3.setText("Login");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(190, 30, 90, 30);

        RetourButton.setText("Retour");
        RetourButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RetourButtonActionPerformed(evt);
            }
        });
        jPanel1.add(RetourButton);
        RetourButton.setBounds(130, 210, 80, 30);

        ConfButton.setText("Connexion");
        ConfButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfButtonActionPerformed(evt);
            }
        });
        jPanel1.add(ConfButton);
        ConfButton.setBounds(230, 210, 90, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NomFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NomFieldActionPerformed

    private void RetourButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RetourButtonActionPerformed
    	controleur.retourVers(this,"VueAccueil","VueLogin");
    }

    private void ConfButtonActionPerformed(java.awt.event.ActionEvent evt) {
    	this.controleur.testConnexion(this,NomField.getText(),mdpField.getText());  
    }

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VueLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VueLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VueLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VueLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ConfButton;
    private javax.swing.JTextField NomField;
    private javax.swing.JButton RetourButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField mdpField;
    // End of variables declaration//GEN-END:variables
}
