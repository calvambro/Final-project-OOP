/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author calva
 */
public class DaftarLayanan extends javax.swing.JFrame {

    /**
     * Creates new form DaftarLayanan
     */
    public DaftarLayanan() {
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
        polisi = new javax.swing.JButton();
        ambulans = new javax.swing.JButton();
        pemadam = new javax.swing.JButton();
        basarnas = new javax.swing.JButton();
        bencana = new javax.swing.JButton();
        kembali = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Daftar Layanan Darurat");

        polisi.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        polisi.setText("Polisi");
        polisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                polisiActionPerformed(evt);
            }
        });

        ambulans.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ambulans.setText("Ambulans");
        ambulans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ambulansActionPerformed(evt);
            }
        });

        pemadam.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        pemadam.setText("Pemadam Kebakaran");
        pemadam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pemadamActionPerformed(evt);
            }
        });

        basarnas.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        basarnas.setText("Basarnas");
        basarnas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                basarnasActionPerformed(evt);
            }
        });

        bencana.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bencana.setText("Penanggulangan Bencana");
        bencana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bencanaActionPerformed(evt);
            }
        });

        kembali.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        kembali.setText("Kembali");
        kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kembaliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(183, 183, 183))
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(ambulans)
                .addGap(66, 66, 66)
                .addComponent(polisi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(basarnas)
                .addGap(70, 70, 70))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(pemadam)
                        .addGap(35, 35, 35)
                        .addComponent(bencana))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(kembali)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ambulans)
                    .addComponent(polisi)
                    .addComponent(basarnas))
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bencana)
                    .addComponent(pemadam))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(kembali)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kembaliActionPerformed
        this.toBack();
        setVisible(false);
        new TombolEmergency().toFront();
        new TombolEmergency().setState(java.awt.Frame.NORMAL);
    }//GEN-LAST:event_kembaliActionPerformed

    private void ambulansActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ambulansActionPerformed
//        this.toBack();
        setVisible(false);
        AmbulancePage ambulanceframe = new AmbulancePage();
        ambulanceframe.setVisible(true);
        ambulanceframe.toFront();
    }//GEN-LAST:event_ambulansActionPerformed

    private void polisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_polisiActionPerformed
        setVisible(false);
        PolicePage policePage = new PolicePage();
        policePage.setVisible(true);
        policePage.toFront();
    }//GEN-LAST:event_polisiActionPerformed

    private void basarnasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_basarnasActionPerformed
        setVisible(false);
        BasarnasPage basarnasPage = new BasarnasPage();
        basarnasPage.setVisible(true);
        basarnasPage.toFront();
    }//GEN-LAST:event_basarnasActionPerformed

    private void pemadamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pemadamActionPerformed
        setVisible(false);
        DamkarPage damkarPage = new DamkarPage();
        damkarPage.setVisible(true);
        damkarPage.toFront();
    }//GEN-LAST:event_pemadamActionPerformed

    private void bencanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bencanaActionPerformed
        setVisible(false);
        BnpbPage bnpbPage = new BnpbPage();
        bnpbPage.setVisible(true);
        bnpbPage.toFront();
    }//GEN-LAST:event_bencanaActionPerformed

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
            java.util.logging.Logger.getLogger(DaftarLayanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DaftarLayanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DaftarLayanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DaftarLayanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DaftarLayanan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ambulans;
    private javax.swing.JButton basarnas;
    private javax.swing.JButton bencana;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton kembali;
    private javax.swing.JButton pemadam;
    private javax.swing.JButton polisi;
    // End of variables declaration//GEN-END:variables
}
