package tugasterakhir2;

import KONEKSI.koneksi;
import com.mysql.jdbc.Statement;
import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author asus
 */
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class barangmaster extends javax.swing.JFrame {
        String judul[]=
    {"kode barang","nam barang","harga jual","stok akhir"};
    DefaultTableModel FORM_MHS=
    new DefaultTableModel(null,judul);
    private Object J0ptionPane;
    private Object stat;

    /**
     * Creates new form barangmaster
     */
    public barangmaster() {
        initComponents();
        TampilData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        kd = new javax.swing.JTextField();
        nb = new javax.swing.JTextField();
        hj = new javax.swing.JTextField();
        st = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb = new javax.swing.JTable();
        SIMPAN = new javax.swing.JButton();
        hapus = new javax.swing.JButton();
        bersih = new javax.swing.JButton();
        keluar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 255, 0));

        jLabel1.setFont(new java.awt.Font("Algerian", 2, 24)); // NOI18N
        jLabel1.setText("MASTER BARANG !!!");

        jLabel3.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel3.setText("Kode Barang  :");

        jLabel4.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel4.setText("Nama Barang :");

        jLabel5.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel5.setText("Harga Jual      :");

        jLabel6.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel6.setText("Stok Akhir      :");

        kd.setBackground(new java.awt.Color(255, 255, 0));

        nb.setBackground(new java.awt.Color(255, 255, 0));

        hj.setBackground(new java.awt.Color(255, 255, 0));

        st.setBackground(new java.awt.Color(255, 255, 0));

        tb.setBackground(new java.awt.Color(255, 0, 0));
        tb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "kodebarang", "namabarang", "hargajual", "Title 4"
            }
        ));
        tb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb);

        SIMPAN.setBackground(new java.awt.Color(0, 0, 0));
        SIMPAN.setText("SIMPAN");
        SIMPAN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SIMPANActionPerformed(evt);
            }
        });

        hapus.setBackground(new java.awt.Color(0, 0, 0));
        hapus.setText("HAPUS");
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });

        bersih.setBackground(new java.awt.Color(0, 0, 0));
        bersih.setText("BERSIH");
        bersih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bersihActionPerformed(evt);
            }
        });

        keluar.setBackground(new java.awt.Color(0, 0, 0));
        keluar.setText("KELUAR");
        keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(357, 357, 357))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(67, 67, 67)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(st, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hj, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nb, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kd, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(283, 283, 283)
                        .addComponent(SIMPAN)
                        .addGap(28, 28, 28)
                        .addComponent(hapus)
                        .addGap(26, 26, 26)
                        .addComponent(bersih)
                        .addGap(27, 27, 27)
                        .addComponent(keluar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(kd, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(nb, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(hj, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(st, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SIMPAN, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bersih, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(keluar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(126, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 151, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SIMPANActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SIMPANActionPerformed
        // TODO add your handling code here:
        String kodebarang=kd.getText();
        String namabarang=nb.getText();
        String hargajual=hj.getText();
        String stokakhir=st.getText();
        
        String kd1=kd.getText();
        String nb1=nb.getText();
        String hj1=hj.getText();
        String st1=st.getText();
        
       
        if(kd.getText().trim().equals(" ")){
            JOptionPane.showMessageDialog(null,"Masukan Data Untuk Di Input",
                "PERHATIAN",JOptionPane.WARNING_MESSAGE);}
        else{
            try{
                java.sql.Statement stat=koneksi.GetConnection().createStatement();
                ResultSet data=stat.executeQuery
                ("SELECT * FROM masterbarang WHERE kode_barang='"+kd.getText() + "'");
                if(data.next()) {
                    JOptionPane.showMessageDialog(null, "kode_barang SUDAH ADA","PERHATIAN",JOptionPane.WARNING_MESSAGE);
                    kd.requestFocus();}

                else{
                    String sql="INSERT INTO masterbarang VALUES('"+kd1+"'"
                    +",'" +nb1+"'"
                    +",'" +hj1+"'"
                    +",'" +st1+"')";
                    stat.executeUpdate(sql);
                    kd.setText(" ");
                    nb.setText(" ");
                    hj.setText(" ");
                    st.setText(" ");
                    kd.requestFocus();
                    JOptionPane.showMessageDialog(null, "Data berhasil di simpan","Sukses",
                        JOptionPane.INFORMATION_MESSAGE);
                    TampilData();
                }

                stat.close();
            }
            catch (Exception ext) {
                System.out.println("Terjadi Kesalahan : " + ext);
            }
        }
    }//GEN-LAST:event_SIMPANActionPerformed

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
        // TODO add your handling code here:
                                    int ok=JOptionPane.showConfirmDialog(null,"Jangan Di Hapus Ath Capee Aku Teh..",
                    "Konfirmasi",JOptionPane.YES_NO_OPTION);
            if(ok==0){
                String sql="DELETE FROM masterbarang WHERE kode_barang='"+ kd.getText().trim()+ "'";
                try{
            java.sql.Statement stat=koneksi.GetConnection().createStatement();
            stat.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Data berhasil di Hapus","Hapus Data"
                    + "",JOptionPane.INFORMATION_MESSAGE);
            stat.close();
                kd.setText(" ");
                nb.setText(" ");
                hj.setText(" ");
                st.setText(" ");
                
                kd.requestFocus();
                TampilData();
                }
        catch (Exception ext) {
            System.err.println(sql);
          System.out.println("Error : " + ext);
          }
            }
    }//GEN-LAST:event_hapusActionPerformed

    private void bersihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bersihActionPerformed
        // TODO add your handling code here:
        kd.setText("");
        nb.setText("");
        hj.setText("");
        st.setText("");
        
    }//GEN-LAST:event_bersihActionPerformed

    private void keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_keluarActionPerformed

    private void tbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbMouseClicked
        // TODO add your handling code here:
                 int baris = tb.getSelectedRow();
        if (baris != -1) {
            kd.setText(tb.getValueAt(baris, 0).toString());
            nb.setText(tb.getValueAt(baris, 1).toString());
            hj.setText(tb.getValueAt(baris, 2).toString());
            st.setText(tb.getValueAt(baris, 3).toString());
        }
    }//GEN-LAST:event_tbMouseClicked

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
            java.util.logging.Logger.getLogger(barangmaster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(barangmaster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(barangmaster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(barangmaster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new barangmaster().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SIMPAN;
    private javax.swing.JButton bersih;
    private javax.swing.JButton hapus;
    private javax.swing.JTextField hj;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField kd;
    private javax.swing.JButton keluar;
    private javax.swing.JTextField nb;
    private javax.swing.JTextField st;
    private javax.swing.JTable tb;
    // End of variables declaration//GEN-END:variables

    private void TampilData() {
         DefaultTableModel model=new DefaultTableModel();
         model.addColumn("kodebarang");
         model.addColumn("namabarang");
         model.addColumn("hargajual");
         model.addColumn("stokakhir");
         tb.setModel(model);
         //menampilkan data database kedalam tabel
         try{
            java.sql.Statement stat=koneksi.GetConnection().createStatement();
            ResultSet data= stat.executeQuery
            ("SELECT * FROM masterbarang");
            while(data.next()){
               model.addRow(new Object[]{
               data.getString("kode_barang"),
               data.getString("nama_barang"),
               data.getString("harga_jual"),
               data.getString("stok_akhir"),
               });
               tb.setModel(model);
            }
         }
         catch(Exception e){
            System.err.println("terjadi kesalahan" +e );
        }
    }
    }

