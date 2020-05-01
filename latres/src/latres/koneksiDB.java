package latres;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class koneksiDB {
    static koneksiDB getKoneksi() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    static Object getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
       Connection koneksi;
       public Statement stat;
       public koneksiDB(){  
           try {
               Class.forName("com.mysql.jdbc.Driver");
               JOptionPane.showMessageDialog(null, "JDBC Telah Di Temukan !");
           } catch (ClassNotFoundException | HeadlessException e) {
               JOptionPane.showMessageDialog(null, "JDBC Tidak Dapat Di Temukan !");
           }     
           koneksi = null;
           stat = null;
           try {
               koneksi = DriverManager.getConnection("jdbc:mysql://localhost/dbmahasiswa",
                       "root","");
               stat = koneksi.createStatement();
           } catch (Exception e){
                JOptionPane.showMessageDialog(null, "Koneksi Gagal !");         
           }
           if (koneksi != null) {
                JOptionPane.showMessageDialog(null, "Koneksi Sukses !");     
           }       
       }

    PreparedStatement preparedStatement(String sql) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
     
       
      
}