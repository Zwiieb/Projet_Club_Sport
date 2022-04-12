/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vues;

// imports

import Controleurs.Controleur;

public class VueInscription extends javax.swing.JFrame {
    private Controleur controleur;

    public VueInscription(Controleur controleur) {
        this.controleur = controleur;
        this.controleur.getListePages().put("VueInscription", this);
        initComponents();
    }


    @SuppressWarnings("unchecked")

    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        RetourButton = new javax.swing.JButton();
        nomField = new javax.swing.JTextField();
        preField = new javax.swing.JTextField();
        adrField = new javax.swing.JTextField();
        adrMField = new javax.swing.JTextField();
        telField = new javax.swing.JTextField();
        ConfButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        eleField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        mdpField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        nivField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(427, 427));
        jPanel1.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI Semibold", 2, 24)); // NOI18N
        jLabel7.setText("Inscription");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(150, 0, 130, 50);

        RetourButton.setText("Retour");
        RetourButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RetourButtonActionPerformed(evt);
            }
        });
        jPanel1.add(RetourButton);
        RetourButton.setBounds(110, 330, 80, 22);
        jPanel1.add(nomField);
        nomField.setBounds(160, 90, 70, 22);
        jPanel1.add(preField);
        preField.setBounds(160, 120, 70, 22);

        adrField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adrFieldActionPerformed(evt);
            }
        });
        jPanel1.add(adrField);
        adrField.setBounds(160, 150, 70, 22);

        adrMField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adrMFieldActionPerformed(evt);
            }
        });
        jPanel1.add(adrMField);
        adrMField.setBounds(160, 180, 70, 22);

        telField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telFieldActionPerformed(evt);
            }
        });
        jPanel1.add(telField);
        telField.setBounds(160, 210, 70, 22);

        ConfButton.setText("Confirmer");
        ConfButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfButtonActionPerformed(evt);
            }
        });
        jPanel1.add(ConfButton);
        ConfButton.setBounds(220, 330, 90, 22);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Nom :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 90, 40, 14);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Prenom :");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 120, 60, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Adresse :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 150, 60, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Adresse mail :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(30, 180, 80, 20);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Telephone :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(30, 210, 70, 20);

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        jLabel6.setText("Prenom d'eleve :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(30, 240, 110, 20);

        eleField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eleFieldActionPerformed(evt);
            }
        });
        jPanel1.add(eleField);
        eleField.setBounds(160, 240, 70, 22);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Mot De Passe :");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(30, 300, 110, 20);

        mdpField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mdpFieldActionPerformed(evt);
            }
        });
        jPanel1.add(mdpField);
        mdpField.setBounds(160, 300, 70, 22);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Niveau :");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(30, 270, 60, 20);

        nivField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nivField1ActionPerformed(evt);
            }
        });
        jPanel1.add(nivField1);
        nivField1.setBounds(160, 270, 70, 22);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ConfButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfButtonActionPerformed
        // test si un des champs est vide et lance la fenetre de connexion dans le cas contraire
        controleur.Inscription(this, nomField.getText(), preField.getText(), adrField.getText(), adrMField.getText(), telField.getText(), eleField.getText(), nivField1.getText(), mdpField.getText());

    }

    private void adrFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adrFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adrFieldActionPerformed

    private void adrMFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adrMFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adrMFieldActionPerformed

    private void telFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telFieldActionPerformed

    private void RetourButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RetourButtonActionPerformed
        controleur.retourVers(this, "VueAccueil", "VueInscription");
    }

    private void eleFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eleFieldActionPerformed
        // TODO add your handling code here:
    }

    private void mdpFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mdpFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mdpFieldActionPerformed

    private void nivField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nivField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nivField1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VueInscription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VueInscription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VueInscription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VueInscription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ConfButton;
    private javax.swing.JButton RetourButton;
    private javax.swing.JTextField adrField;
    private javax.swing.JTextField adrMField;
    private javax.swing.JTextField eleField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField mdpField;
    private javax.swing.JTextField nivField1;
    private javax.swing.JTextField nomField;
    private javax.swing.JTextField preField;
    private javax.swing.JTextField telField;
    // End of variables declaration//GEN-END:variables
}
