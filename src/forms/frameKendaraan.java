/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package forms;
import dataset.*;
import javax.swing.JOptionPane;

/**
 *
 * @author ACER
 */
public class frameKendaraan extends javax.swing.JFrame {

    private datasetKendaraan Kendaraan;
    
    public frameKendaraan() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        
        Kendaraan = new datasetKendaraan();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtnmKendaraan = new javax.swing.JTextField();
        txtSopirDalam = new javax.swing.JTextField();
        txtSopirLuar = new javax.swing.JTextField();
        txtGambar = new javax.swing.JTextField();
        txtkdKendaraan = new javax.swing.JTextField();
        txtHarga12Jam = new javax.swing.JTextField();
        txtHarga24Jam = new javax.swing.JTextField();
        cmbSpesifikasi = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        btnTambahData = new javax.swing.JButton();
        btnBacaData = new javax.swing.JButton();
        txtIndex = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("nmKendaraan");

        jLabel2.setText("Spesifikasi");

        jLabel3.setText("Sopir Dalam");

        jLabel4.setText("Sopir Luar");

        jLabel5.setText("Gambar");

        jLabel6.setText("kdKendaraan");

        jLabel7.setText("Harga 12 Jam");

        jLabel8.setText("Harga 24 Jam");

        txtnmKendaraan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnmKendaraanActionPerformed(evt);
            }
        });

        txtSopirDalam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSopirDalamActionPerformed(evt);
            }
        });

        txtGambar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGambarActionPerformed(evt);
            }
        });

        txtHarga24Jam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHarga24JamActionPerformed(evt);
            }
        });

        cmbSpesifikasi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Manual", "Metic", " " }));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setText("FORM KENDARAAN");

        btnTambahData.setText("Tambah Data");
        btnTambahData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahDataActionPerformed(evt);
            }
        });

        btnBacaData.setText("Baca Data");
        btnBacaData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBacaDataActionPerformed(evt);
            }
        });

        txtIndex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIndexActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtSopirDalam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtSopirLuar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtGambar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtkdKendaraan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtHarga12Jam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtHarga24Jam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtnmKendaraan, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cmbSpesifikasi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnTambahData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBacaData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(txtIndex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(203, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(201, 201, 201))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtGambar, txtHarga12Jam, txtHarga24Jam, txtSopirDalam, txtSopirLuar, txtkdKendaraan, txtnmKendaraan});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnBacaData, btnTambahData, txtIndex});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtnmKendaraan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cmbSpesifikasi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTambahData))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtSopirDalam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBacaData))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtSopirLuar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIndex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5))
                    .addComponent(txtGambar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtkdKendaraan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtHarga12Jam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtHarga24Jam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(99, 99, 99))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtGambarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGambarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGambarActionPerformed

    private void txtnmKendaraanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnmKendaraanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnmKendaraanActionPerformed

    private void txtSopirDalamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSopirDalamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSopirDalamActionPerformed

    private void txtHarga24JamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHarga24JamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHarga24JamActionPerformed

    private void btnTambahDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahDataActionPerformed
        // TODO add your handling code here:
      Kendaraan.insertnmKendaraan(txtnmKendaraan.getText());
      Kendaraan.insertSpesifikasi(cmbSpesifikasi.getSelectedItem().toString());
      Kendaraan.insertSopirDalam(txtSopirDalam.getText());
      Kendaraan.insertSopirLuar(txtSopirLuar.getText());
      Kendaraan.insertGambar(txtGambar.getText());
      Kendaraan.insertkdKendaraan(Integer.valueOf(txtkdKendaraan.getText()));
      Kendaraan.insertHarga12Jam(Integer.valueOf(txtHarga12Jam.getText()));
      Kendaraan.insertHarga24Jam(Integer.valueOf(txtHarga24Jam.getText()));
      
      JOptionPane.showMessageDialog(this, "Array Berhasil Disimpan");
    }//GEN-LAST:event_btnTambahDataActionPerformed

    private void btnBacaDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBacaDataActionPerformed
        // TODO add your handling code here:
        int i = Integer.valueOf(txtIndex.getText());
        
        String IsiArray = "nmKendaraan : " + Kendaraan.getRecordnmKendaraan().get(i) +
                          "\nSpesifikasi : " + Kendaraan.getRecordSpesifikasi().get(i) +
                          "\nSopirDalam : " + Kendaraan.getRecordSopirDalam().get(i) +
                          "\nSopirLuar : " + Kendaraan.getRecordSopirLuar().get(i) +
                          "\nGambar : " + Kendaraan.getRecordGambar().get(i) +
                          "\nkdKendaraan : " + Kendaraan.getRecordkdKendaraan().get(i) +
                          "\nHarga12Jam : " + Kendaraan.getRecordHarga12Jam().get(i) +
                          "\nHarga24Jam : " + Kendaraan.getRecordHarga24Jam().get(i);
        
        JOptionPane.showMessageDialog(this, IsiArray);
    }//GEN-LAST:event_btnBacaDataActionPerformed

    private void txtIndexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIndexActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIndexActionPerformed

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
            java.util.logging.Logger.getLogger(frameKendaraan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frameKendaraan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frameKendaraan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frameKendaraan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frameKendaraan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBacaData;
    private javax.swing.JButton btnTambahData;
    private javax.swing.JComboBox<String> cmbSpesifikasi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtGambar;
    private javax.swing.JTextField txtHarga12Jam;
    private javax.swing.JTextField txtHarga24Jam;
    private javax.swing.JTextField txtIndex;
    private javax.swing.JTextField txtSopirDalam;
    private javax.swing.JTextField txtSopirLuar;
    private javax.swing.JTextField txtkdKendaraan;
    private javax.swing.JTextField txtnmKendaraan;
    // End of variables declaration//GEN-END:variables
}