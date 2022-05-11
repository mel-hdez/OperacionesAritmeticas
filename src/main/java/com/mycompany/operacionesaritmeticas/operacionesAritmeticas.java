
package com.mycompany.operacionesaritmeticas;

/**
 *
 * @author melhernandez
 */
public class operacionesAritmeticas extends javax.swing.JFrame {

    Operaciones operar = new Operaciones();
    double num1,num2;
    
    public operacionesAritmeticas() {
        initComponents();
    }
    
    public void entrada (){
         num1 = Double.parseDouble(campoN1.getText());
         num2 = Double.parseDouble(campoN2.getText());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        BtonResta = new javax.swing.JButton();
        BtnMulti = new javax.swing.JButton();
        BtnDivision = new javax.swing.JButton();
        BtnSuma = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        campoN1 = new javax.swing.JTextField();
        campoN2 = new javax.swing.JTextField();
        labelReult = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(226, 182, 207));

        jLabel1.setFont(new java.awt.Font("Poppins Medium", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(131, 103, 199));
        jLabel1.setText("Operaciones Aritméticas");

        jLabel2.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(131, 103, 199));
        jLabel2.setText("Resultado:");

        jLabel3.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(131, 103, 199));

        BtonResta.setBackground(new java.awt.Color(179, 233, 199));
        BtonResta.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        BtonResta.setForeground(new java.awt.Color(131, 103, 199));
        BtonResta.setText("-");
        BtonResta.setBorderPainted(false);
        BtonResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtonRestaActionPerformed(evt);
            }
        });

        BtnMulti.setBackground(new java.awt.Color(179, 233, 199));
        BtnMulti.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        BtnMulti.setForeground(new java.awt.Color(131, 103, 199));
        BtnMulti.setText("X");
        BtnMulti.setBorderPainted(false);
        BtnMulti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMultiActionPerformed(evt);
            }
        });

        BtnDivision.setBackground(new java.awt.Color(179, 233, 199));
        BtnDivision.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        BtnDivision.setForeground(new java.awt.Color(131, 103, 199));
        BtnDivision.setText("/");
        BtnDivision.setBorderPainted(false);
        BtnDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDivisionActionPerformed(evt);
            }
        });

        BtnSuma.setBackground(new java.awt.Color(179, 233, 199));
        BtnSuma.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        BtnSuma.setForeground(new java.awt.Color(131, 103, 199));
        BtnSuma.setText("+");
        BtnSuma.setBorderPainted(false);
        BtnSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSumaActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(131, 103, 199));
        jLabel4.setText("Segundo número:");

        campoN1.setBackground(new java.awt.Color(226, 182, 207));
        campoN1.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        campoN1.setForeground(new java.awt.Color(131, 103, 199));
        campoN1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        campoN1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(179, 233, 199)));
        campoN1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoN1ActionPerformed(evt);
            }
        });

        campoN2.setBackground(new java.awt.Color(226, 182, 207));
        campoN2.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        campoN2.setForeground(new java.awt.Color(131, 103, 199));
        campoN2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        campoN2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(179, 233, 199)));

        labelReult.setFont(new java.awt.Font("Poppins", 1, 16)); // NOI18N
        labelReult.setForeground(new java.awt.Color(131, 103, 199));
        labelReult.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelReult.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(179, 233, 199)));

        jLabel5.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(131, 103, 199));
        jLabel5.setText("Primer número:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(campoN1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(46, 46, 46)
                                            .addComponent(BtnSuma, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(campoN2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(BtnMulti, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(91, 91, 91)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BtonResta, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BtnDivision, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(labelReult, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoN1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(64, 64, 64)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(campoN2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnSuma, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtonResta, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnMulti, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnDivision, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(labelReult)))
                .addGap(89, 89, 89))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtonRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtonRestaActionPerformed
       entrada();
       operar.calResta(num1, num2);
       labelReult.setText(String.valueOf(operar.result));
       campoN1.requestFocus();
       campoN1.selectAll();
    }//GEN-LAST:event_BtonRestaActionPerformed

    private void BtnMultiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMultiActionPerformed
        entrada();
        operar.calMulti(num1, num2);
        labelReult.setText(String.valueOf(operar.result));
        campoN1.requestFocus();
        campoN1.selectAll();
    }//GEN-LAST:event_BtnMultiActionPerformed

    private void BtnDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDivisionActionPerformed
        entrada();
        operar.calDivison(num1, num2);
        labelReult.setText(String.valueOf(operar.result));
        campoN1.requestFocus();
        campoN1.selectAll();
    }//GEN-LAST:event_BtnDivisionActionPerformed

    private void BtnSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSumaActionPerformed
       entrada();
       operar.calSuma(num1, num2);
       labelReult.setText(String.valueOf(operar.result));
       campoN1.requestFocus();
       campoN1.selectAll();
    }//GEN-LAST:event_BtnSumaActionPerformed

    private void campoN1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoN1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoN1ActionPerformed

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
            java.util.logging.Logger.getLogger(operacionesAritmeticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(operacionesAritmeticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(operacionesAritmeticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(operacionesAritmeticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new operacionesAritmeticas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnDivision;
    private javax.swing.JButton BtnMulti;
    private javax.swing.JButton BtnSuma;
    private javax.swing.JButton BtonResta;
    private javax.swing.JTextField campoN1;
    private javax.swing.JTextField campoN2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelReult;
    // End of variables declaration//GEN-END:variables
}
