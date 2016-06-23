

package Dao;

import java.sql.*;
import javax.swing.JOptionPane;

public class Conexion {
//    private Conexion con=new Conexion();
//    private Connection cn=con.conexion();

    
    
    Connection con;
    String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";

    //static String cadena = "jdbc:sqlserver://192.168.1.7:1433;databaseName=BD_MPPR";
    
    static String cadena = "jdbc:sqlserver://lenovo01:1433;databaseName=BD_MPPR";

                            
    static String user = "sa";
    static String password = "123";

    public Connection conexion() {
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(this.cadena, this.user, this.password);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return con;
    }

}
