/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package form;

import dbkel8.Koneksi;
import java.sql.Connection;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class FormProduk extends javax.swing.JFrame {

    private Connection conn;
    
    public FormProduk() {
        conn = Koneksi.getConnection();
        initComponents();
        getData();
    }

    private void getData() {
        DefaultTableModel model =(DefaultTableModel) TabelProduk.getModel();
        model.setRowCount(0);
        
        try{
            String sql = "Select * From produk";
            PreparedStatement st = conn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            
            while(rs.next()){
                String nomor = rs.getString("nomor");
                String nama = rs.getString("nama");
                String jenis = rs.getString("jenis");
                String harga = rs.getString("harga");
                String stock = rs.getString("stock");
                
                Object[] rowData = {nomor,nama,jenis,harga,stock};
                model.addRow(rowData);
                
            }
            
            rs.close();
            st.close();
        }catch (Exception e){
            Logger.getLogger(FormProduk.class.getName()).log(Level.SEVERE, null,e);
            
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jenis_txt = new javax.swing.JComboBox<>();
        Tambahdata = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TabelProduk = new javax.swing.JTable();
        nama_txt = new javax.swing.JTextField();
        nomor_txt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        harga_txt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        stock_txt = new javax.swing.JTextField();
        hapusbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setText("Jenis Produk");

        jLabel4.setFont(new java.awt.Font("MV Boli", 0, 24)); // NOI18N
        jLabel4.setText("Databse Produk");

        jenis_txt.setEditable(true);
        jenis_txt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Device", "Accessories", "Liquid" }));
        jenis_txt.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jenis_txtItemStateChanged(evt);
            }
        });

        Tambahdata.setBackground(new java.awt.Color(204, 204, 204));
        Tambahdata.setText("Tambah Data");
        Tambahdata.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Tambahdata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TambahdataActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setText("Simpan");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(204, 204, 204));
        jButton3.setText("Perbarui");
        jButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(204, 204, 204));
        jButton4.setText("Keluar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel2.setText("Nomor Produk");

        jLabel1.setText("Nama Produk");

        TabelProduk.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nomor Product", "Nama Product", "Jenis Produk", "Harga", "Stock"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TabelProduk.setShowGrid(true);
        TabelProduk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelProdukMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TabelProduk);

        nama_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nama_txtActionPerformed(evt);
            }
        });

        nomor_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomor_txtActionPerformed(evt);
            }
        });

        jLabel5.setText("Harga");

        harga_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                harga_txtActionPerformed(evt);
            }
        });

        jLabel6.setText("Stock");

        hapusbtn.setText("Hapus Data");
        hapusbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel1))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(stock_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nama_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(90, 90, 90)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nomor_txt)
                                    .addComponent(jenis_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(harga_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Tambahdata, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(hapusbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(102, 102, 102)))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nama_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomor_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jenis_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(harga_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(stock_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Tambahdata, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(hapusbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TambahdataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TambahdataActionPerformed

       String nomor = nomor_txt.getText();
       String nama = nama_txt.getText();
       String jenis = (String) jenis_txt.getSelectedItem();
       String harga = harga_txt.getText();
       String stock = stock_txt.getText();
       
       if(nomor.isEmpty()||nama.isEmpty ()|| jenis.isEmpty()|| harga.isEmpty()){
           JOptionPane.showMessageDialog(this, "Semua Kolom Harus Diisi !", "Validasi",JOptionPane.ERROR_MESSAGE);
           return;
       }
       
       try{
           String sql = "INSERT INTO produk (nomor, nama,jenis,harga,stock)VALUES(?,?,?,?,?)";
           PreparedStatement st = conn.prepareStatement(sql);
           st.setString(1, nomor);
           st.setString(2, nama);
           st.setString(3, jenis);
           st.setString(4, harga);
           st.setString(5, stock);
           
           int rowInserted = st.executeUpdate();
           if (rowInserted > 0){
               JOptionPane.showMessageDialog(this, "Data berhasil ditambahkan");
               resetForm();
               getData();
           }
           st.close();
       
       }catch(Exception e){
           Logger.getLogger(FormProduk.class.getName()).log(Level.SEVERE, null,e);
       }
       
    }//GEN-LAST:event_TambahdataActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
            int SelectedRow = TabelProduk.getSelectedRow();
            if(SelectedRow== -1){
                JOptionPane.showMessageDialog(this, "Pilih baris yang akan di perbarui");
                return;
                 }
            
                String nomor = nomor_txt.getText();
                String nama = nama_txt.getText();
                String jenis = jenis_txt.getSelectedItem().toString();
                String harga = harga_txt.getText();
                String stock = stock_txt.getText();
                
                if(nomor.isEmpty()||nama.isEmpty ()||  harga.isEmpty()){
           JOptionPane.showMessageDialog(this, "Semua Kolom Harus Diisi !", "Validasi",JOptionPane.ERROR_MESSAGE);
           return;
       }
                
                try {
                    String sql = "UPDATE `produk` SET `nomor`=?, `nama`=?, `jenis`=?, `harga`=?, `stock`=? WHERE 1";
           PreparedStatement st = conn.prepareStatement(sql);
           st.setString(1, nomor);
           st.setString(2, nama);
           st.setString(3, jenis);
           st.setString(4, harga);
           st.setString(5, stock);
           
           int rowUpdate = st.executeUpdate();
           if (rowUpdate >= 0){
               JOptionPane.showMessageDialog(this, "Data berhasil di perbarui");
               resetForm();
               getData();
           }
           st.close();
                }catch(Exception e){
                    Logger.getLogger(FormProduk.class.getName()).log(Level.SEVERE, null,e);
                }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void nama_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nama_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nama_txtActionPerformed

    private void nomor_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomor_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomor_txtActionPerformed

    private void harga_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_harga_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_harga_txtActionPerformed

    private void TabelProdukMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelProdukMouseClicked

        int SelectedRow = TabelProduk.getSelectedRow();
        if(SelectedRow !=1){
            String nomor = TabelProduk.getValueAt(SelectedRow, 0).toString();
            String nama = TabelProduk.getValueAt(SelectedRow, 1).toString();
            String jenis = TabelProduk.getValueAt(SelectedRow, 2).toString();
            String harga = TabelProduk.getValueAt(SelectedRow, 3).toString();
            String stock = TabelProduk.getValueAt(SelectedRow, 4).toString();
            
            nomor_txt.setText(nomor);
            nama_txt.setText(nama);
            jenis_txt.setSelectedItem(jenis);
            harga_txt.setText(harga);
            stock_txt.setText(stock);
        }
    }//GEN-LAST:event_TabelProdukMouseClicked

    private void jenis_txtItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jenis_txtItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jenis_txtItemStateChanged

    private void hapusbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusbtnActionPerformed
        int SelectedRow = TabelProduk.getSelectedRow();
        if(SelectedRow== -1){
                JOptionPane.showMessageDialog(this, "Pilih baris yang akan di hapus");
                return;
                 }
        int confirm = JOptionPane.showConfirmDialog(this, "Apakah anda yakin memghapus data ini ?", "Konfirmasi",JOptionPane.YES_NO_OPTION);
        if ( confirm == JOptionPane.YES_OPTION){
            String nomor = TabelProduk.getValueAt(SelectedRow,0).toString();
            
            try{
                String sql = "DELETE FROM produk WHERE nomor=?";
                PreparedStatement st = conn.prepareStatement(sql);
                st.setString(1, nomor);
                
                int rowDelete = st.executeUpdate();
                if (rowDelete>1){
                    JOptionPane.showMessageDialog(this, "Data berhasil dihapus");
                    resetForm();
                    getData();
                }
                st.close();
                getData();
            }catch (Exception e){
                Logger.getLogger(FormProduk.class.getName()).log(Level.SEVERE, null,e);
            }
        }
        
    }//GEN-LAST:event_hapusbtnActionPerformed

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
            java.util.logging.Logger.getLogger(FormProduk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormProduk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormProduk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormProduk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormProduk().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TabelProduk;
    private javax.swing.JButton Tambahdata;
    private javax.swing.JButton hapusbtn;
    private javax.swing.JTextField harga_txt;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> jenis_txt;
    private javax.swing.JTextField nama_txt;
    private javax.swing.JTextField nomor_txt;
    private javax.swing.JTextField stock_txt;
    // End of variables declaration//GEN-END:variables

    private void resetForm() {
        nama_txt.setText("");
        nomor_txt.setText("");
        harga_txt.setText("");
        
        
    }

    
}
