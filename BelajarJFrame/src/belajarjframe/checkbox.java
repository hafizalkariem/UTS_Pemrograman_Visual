/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package belajarjframe;

import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class checkbox extends javax.swing.JFrame {

    /**
     * Creates new form checkbox
     */
    public checkbox() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel4 = new javax.swing.JLabel();
        btnClear2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        taCheckBox2 = new javax.swing.JTextArea();
        jSeparator1 = new javax.swing.JSeparator();
        btnSubmit2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        taCheckBox1 = new javax.swing.JTextArea();
        btnClear = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnSubmit = new javax.swing.JButton();
        cbLaki = new javax.swing.JCheckBox();
        cbPerempuan = new javax.swing.JCheckBox();
        cbBelumMenikah = new javax.swing.JCheckBox();
        cbMenikah = new javax.swing.JCheckBox();
        cbDuda = new javax.swing.JCheckBox();
        cbJanda = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel4.setText("Status   : ");

        btnClear2.setText("Clear 2");
        btnClear2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClear2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Check Box 2");

        jLabel2.setText("Jenis Kelamin  :");

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        taCheckBox2.setColumns(20);
        taCheckBox2.setRows(5);
        jScrollPane1.setViewportView(taCheckBox2);

        btnSubmit2.setText("submit 2");
        btnSubmit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmit2ActionPerformed(evt);
            }
        });

        taCheckBox1.setColumns(20);
        taCheckBox1.setRows(5);
        jScrollPane2.setViewportView(taCheckBox1);

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Check Box 1");

        btnSubmit.setText("submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        buttonGroup1.add(cbLaki);
        cbLaki.setText("Laki-Laki");

        buttonGroup1.add(cbPerempuan);
        cbPerempuan.setText("Perempuan");

        buttonGroup2.add(cbBelumMenikah);
        cbBelumMenikah.setText("Belum  Menikah");

        buttonGroup2.add(cbMenikah);
        cbMenikah.setText("Menikah");

        buttonGroup2.add(cbDuda);
        cbDuda.setText("Duda");
        cbDuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbDudaActionPerformed(evt);
            }
        });

        buttonGroup2.add(cbJanda);
        cbJanda.setText("Janda");
        cbJanda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbJandaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnClear)
                            .addComponent(btnSubmit)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbMenikah)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbBelumMenikah)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbDuda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbJanda))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(cbLaki)
                        .addGap(18, 18, 18)
                        .addComponent(cbPerempuan))
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnClear2)
                            .addComponent(btnSubmit2)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnExit)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbLaki)
                    .addComponent(cbPerempuan))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSubmit)
                        .addGap(18, 18, 18)
                        .addComponent(btnClear))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbMenikah)
                    .addComponent(cbBelumMenikah)
                    .addComponent(cbDuda)
                    .addComponent(cbJanda))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSubmit2)
                        .addGap(18, 18, 18)
                        .addComponent(btnClear2)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExit)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClear2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClear2ActionPerformed
        // TODO add your handling code here:
        taCheckBox2.setText(""); 
        buttonGroup2.clearSelection(); 
    }//GEN-LAST:event_btnClear2ActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        int jawab = JOptionPane.showOptionDialog(this, 
        "Apakah Anda Ingin Keluar?", 
        "Exit", 
        JOptionPane.YES_NO_OPTION, 
        JOptionPane.QUESTION_MESSAGE, null, null, null); 
        if (jawab == JOptionPane.YES_OPTION) { 
        System.exit(0); 
        } 
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnSubmit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmit2ActionPerformed
        // TODO add your handling code here:
        String status; 
 
        if (cbMenikah.isSelected()) { 
            status = "Menikah"; 
        } else if (cbBelumMenikah.isSelected()) { 
            status = "Belum Menikah"; 
        } else if (cbDuda.isSelected()) { 
            status = "Duda"; 
        } else { 
            status = "Janda"; 
        } 
 
        taCheckBox2.append("Status\t: " + status + "\n");
    }//GEN-LAST:event_btnSubmit2ActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        taCheckBox1.setText(""); 
        buttonGroup1.clearSelection(); 
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
         String jekel; 
 
        if (cbLaki.isSelected()) { 
            jekel = "Laki - Laki"; 
        } else { 
            jekel = "Perempuan"; 
        } 
 
        taCheckBox1.append("Jenis Kelamin\t: " + jekel + "\n"); 
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void cbDudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbDudaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbDudaActionPerformed

    private void cbJandaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbJandaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbJandaActionPerformed

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
            java.util.logging.Logger.getLogger(checkbox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(checkbox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(checkbox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(checkbox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new checkbox().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnClear2;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JButton btnSubmit2;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JCheckBox cbBelumMenikah;
    private javax.swing.JCheckBox cbDuda;
    private javax.swing.JCheckBox cbJanda;
    private javax.swing.JCheckBox cbLaki;
    private javax.swing.JCheckBox cbMenikah;
    private javax.swing.JCheckBox cbPerempuan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextArea taCheckBox1;
    private javax.swing.JTextArea taCheckBox2;
    // End of variables declaration//GEN-END:variables
}