
package org.view.banco;
import java.sql.*;
/**
 *
 * @author DELL
 */
public class Conexion {
    Connection con;
    
    
public Connection conexion(){
    try {
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost/banco", "root", "");
        System.out.println("Se realizo la Conexión");
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
    return con;
}
Statement createStatement(){
    throw new UnsupportedOperationException("No Soportado");
            }
}
