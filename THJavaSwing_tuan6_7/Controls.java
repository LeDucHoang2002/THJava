package THJavaSwing_tuan6_7;

public class Controls extends javax.swing.JFrame {

    public Controls() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton_capnhat = new javax.swing.JButton();
        jButton_xem = new javax.swing.JButton();
        jButton_Them = new javax.swing.JButton();
        jButton_thoat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton_capnhat.setBackground(new java.awt.Color(204, 255, 204));
        jButton_capnhat.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton_capnhat.setText("Cập nhật");
        jButton_capnhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_capnhatActionPerformed(evt);
            }
        });

        jButton_xem.setBackground(new java.awt.Color(204, 255, 204));
        jButton_xem.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton_xem.setText("Xem");
        jButton_xem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_xemActionPerformed(evt);
            }
        });

        jButton_Them.setBackground(new java.awt.Color(204, 255, 204));
        jButton_Them.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton_Them.setText("Thêm");
        jButton_Them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ThemActionPerformed(evt);
            }
        });

        jButton_thoat.setBackground(new java.awt.Color(204, 255, 204));
        jButton_thoat.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton_thoat.setText("Thoát");
        jButton_thoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_thoatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton_xem, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_capnhat, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton_Them, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_thoat, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_xem, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_capnhat, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Them, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_thoat, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_xemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_xemActionPerformed
        // TODO add your handling code here:
        BookInformation fm = new BookInformation();
        this.dispose();
        fm.setVisible(true);
    }//GEN-LAST:event_jButton_xemActionPerformed

    private void jButton_capnhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_capnhatActionPerformed
        // TODO add your handling code here:
        ModifyBookInformation fm = new ModifyBookInformation();
        this.dispose();
        fm.setVisible(true);
    }//GEN-LAST:event_jButton_capnhatActionPerformed

    private void jButton_thoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_thoatActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jButton_thoatActionPerformed

    private void jButton_ThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ThemActionPerformed
        // TODO add your handling code here:
        AddBookInformation fm = new AddBookInformation();
        this.dispose();
        fm.setVisible(true);
    }//GEN-LAST:event_jButton_ThemActionPerformed

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
            java.util.logging.Logger.getLogger(Controls.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Controls.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Controls.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Controls.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Controls().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Them;
    private javax.swing.JButton jButton_capnhat;
    private javax.swing.JButton jButton_thoat;
    private javax.swing.JButton jButton_xem;
    // End of variables declaration//GEN-END:variables
}
