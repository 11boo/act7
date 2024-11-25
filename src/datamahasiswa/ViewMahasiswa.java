package datamahasiswa;
import javax.swing.*;


public class ViewMahasiswa extends javax.swing.JFrame {
    ControllerMahasiswa mhs = new ControllerMahasiswa();
    public ViewMahasiswa() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        pindahan = new javax.swing.JComboBox<>();
        TFTinggi = new javax.swing.JTextField();
        TFNama = new javax.swing.JTextField();
        TFNPM = new javax.swing.JTextField();
        edit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablelist = new javax.swing.JTable();
        delete = new javax.swing.JButton();
        simpan2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Data Mahasiswa");

        jLabel2.setText("NPM");

        jLabel3.setText("Nama");

        jLabel4.setText("Tinggi");

        jLabel5.setText("Pindahan?");

        pindahan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ya", "Tidak", " " }));

        TFTinggi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFTinggiActionPerformed(evt);
            }
        });

        TFNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFNamaActionPerformed(evt);
            }
        });

        TFNPM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFNPMActionPerformed(evt);
            }
        });

        edit.setText("Edit");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });

        tablelist.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "NPM", "NAMA", "TINGGI", "PINDAH"
            }
        ));
        jScrollPane1.setViewportView(tablelist);

        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        simpan2.setText("Simpan");
        simpan2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpan2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 530, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(TFNama, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TFTinggi, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pindahan, javax.swing.GroupLayout.Alignment.LEADING, 0, 215, Short.MAX_VALUE)
                            .addComponent(TFNPM))
                        .addGap(24, 24, 24))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(150, 150, 150)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(simpan2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(26, 26, 26)
                                        .addComponent(edit, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TFNPM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TFNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TFTinggi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(pindahan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(delete, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(edit)
                        .addComponent(simpan2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
    int selectedRow = tablelist.getSelectedRow();
    if (selectedRow >= 0) {
        String npm = tablelist.getValueAt(selectedRow, 0).toString();
        String nama = tablelist.getValueAt(selectedRow, 1).toString();
        int tinggi = Integer.parseInt(tablelist.getValueAt(selectedRow, 2).toString());
        String pindahanStatus = tablelist.getValueAt(selectedRow, 3).toString();
        
        // Set data ke field input untuk di-edit
        TFNPM.setText(npm);   // Menampilkan NPM yang dipilih
        TFNama.setText(nama);
        TFTinggi.setText(String.valueOf(tinggi));
        pindahan.setSelectedItem(pindahanStatus);  // Set nilai combo box
    } else {
        JOptionPane.showMessageDialog(null, "Pilih data yang ingin di-edit.");
    }


    }//GEN-LAST:event_editActionPerformed

    private void TFTinggiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFTinggiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFTinggiActionPerformed

    private void TFNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFNamaActionPerformed

    private void TFNPMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFNPMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFNPMActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
    int selectedRow = tablelist.getSelectedRow();
    if (selectedRow >= 0) {
        String npm = tablelist.getValueAt(selectedRow, 0).toString();
        mhs.deleteData(npm);  // Hapus data dari controller
        tablelist.setModel(mhs.showData());  // Refresh tabel
    } else {
        JOptionPane.showMessageDialog(null, "Pilih data yang ingin dihapus.");
    }


    }//GEN-LAST:event_deleteActionPerformed

    private void simpan2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpan2ActionPerformed
      String npm = TFNPM.getText();
    String nama = TFNama.getText();
    int tinggi = Integer.parseInt(TFTinggi.getText());
    boolean pindahanStatus = pindahan.getSelectedItem().toString().equals("Ya");

    // Cek apakah data dengan NPM ini sudah ada
    boolean isExisting = false;
    for (ModelMahasiswa mhs : mhs.dataArrayList) {
        if (mhs.getNPM().equals(npm)) {
            isExisting = true;
            break;
        }
    }

    if (isExisting) {
        // Jika sudah ada, lakukan update
        mhs.updateData(npm, nama, tinggi, pindahanStatus);  
    } else {
        // Jika belum ada, lakukan insert
        mhs.insertData(npm, nama, tinggi, pindahanStatus);  
    }
    
    // Setelah simpan, refresh tabel
    tablelist.setModel(mhs.showData());
    // Reset field input setelah simpan
    TFNPM.setText("");
    TFNama.setText("");
    TFTinggi.setText("");
    pindahan.setSelectedIndex(0);

   
    }//GEN-LAST:event_simpan2ActionPerformed

    /**
     * @param args the command line arguments
     */
   public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewMahasiswa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TFNPM;
    private javax.swing.JTextField TFNama;
    private javax.swing.JTextField TFTinggi;
    private javax.swing.JButton delete;
    private javax.swing.JButton edit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> pindahan;
    private javax.swing.JButton simpan2;
    private javax.swing.JTable tablelist;
    // End of variables declaration//GEN-END:variables
}
