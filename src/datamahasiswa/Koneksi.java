package datamahasiswa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Koneksi {
    private static Connection conn;

    public static Connection getKoneksi() {
        String host = "jdbc:mysql://localhost:3306/pre";
        String user = "root";
        String password = "";

        try {
            if (conn == null || conn.isClosed()) {
                conn = DriverManager.getConnection(host,user, password);
            }
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Koneksi Gagal: " + err.getMessage());
            conn = null; // Pastikan koneksi null jika gagal
        }

        return conn;
    }
}