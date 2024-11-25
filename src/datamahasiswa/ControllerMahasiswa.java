package datamahasiswa;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ControllerMahasiswa {
    ArrayList<ModelMahasiswa> dataArrayList;
    DefaultTableModel labelList;
    private Connection conn;

    public ControllerMahasiswa() {
        conn = Koneksi.getKoneksi();
        dataArrayList = new ArrayList<>();
        labelList = new DefaultTableModel(new String[]{"NPM", "Nama", "Tinggi", "Pindahan"}, 0);
    }

    public void insertData(String npm, String nama, int tinggi, boolean pindahan) {
        ModelMahasiswa mhs = new ModelMahasiswa(npm, nama, tinggi, pindahan);
        dataArrayList.add(mhs);
        insertDataToDatabase(mhs);
    }

    public void insertDataToDatabase(ModelMahasiswa mhs) {
        String sql = "INSERT INTO mahasiswa (npm, nama, tinggi, pindahan) VALUES (?, ?, ?, ?)";
        try (PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setString(1, mhs.getNPM()); // Ubah ke setInt
            pst.setString(2, mhs.getNama());
            pst.setInt(3, mhs.getTinggi());
            pst.setBoolean(4, mhs.isPindahan());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data berhasil disimpan ke database!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Gagal menyimpan data ke database: " + e.getMessage());
        }
    }
    
     public void updateData(String npm, String nama, int tinggi, boolean pindahan) {
    // Cari mahasiswa berdasarkan npm di dataArrayList
    for (ModelMahasiswa mhs : dataArrayList) {
        if (mhs.getNPM().equals(npm)) {
            mhs.setNama(nama);
            mhs.setTinggi(tinggi);
            mhs.setPindahan(pindahan);
            updateDataToDatabase(mhs);  // Update database
            break;
        }
    }
}

    private void updateDataToDatabase(ModelMahasiswa mhs) {
        String sql = "UPDATE mahasiswa SET nama = ?, tinggi = ?, pindahan = ? WHERE npm = ?";
        try (PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setString(1, mhs.getNama());
            pst.setInt(2, mhs.getTinggi());
            pst.setBoolean(3, mhs.isPindahan());
            pst.setString(4, mhs.getNPM());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data berhasil diperbarui!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Gagal memperbarui data: " + e.getMessage());
        }
}


    public void deleteData(String npm) {
        // Hapus data dari dataArrayList
        dataArrayList.removeIf(mhs -> mhs.getNPM().equals(npm));
        deleteDataFromDatabase(npm);
        
    }
 

    private void deleteDataFromDatabase(String npm) {
    String sql = "DELETE FROM mahasiswa WHERE npm = ?";
    try (PreparedStatement pst = conn.prepareStatement(sql)) {
        pst.setString(1, npm);
        pst.executeUpdate();
        JOptionPane.showMessageDialog(null, "Data berhasil dihapus!");
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Gagal menghapus data: " + e.getMessage());
        
    }
    
    }


    public DefaultTableModel showData() {
        labelList.setRowCount(0);
        for (ModelMahasiswa mhs : dataArrayList) {
            labelList.addRow(new Object[]{
                mhs.getNPM(), 
                mhs.getNama(), 
                mhs.getTinggi(), 
                mhs.isPindahan() ? "Ya" : "Tidak"
            });
        }
        return labelList;
    }
}
