
package app.penjualan;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Koneksi {
    Connection koneksi;
public static Connection Koneksi() {
try {
Class.forName("com.mysql.cj.jdbc.Driver"); //nama driver mysql jdbc bisa dicek pada library sql yg baru ditambahkan
Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/app-penjualan", "root", ""); // mengatur jalur koneksi ke database sales.
return koneksi;
} catch(Exception e) {
JOptionPane.showMessageDialog(null, e);
return null;
}
}
}
