/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author David
 */
public class ConexionBasedeDatos {
    Connection cn;
    Statement st;
    
    public Connection conexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost/sistema","root","123456");
            System.out.println("Se conectó correctamente");
        } catch (Exception ex) {
         //catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex.getMessage());
            //Logger.getLogger(ConexionBasedeDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cn;
    }
    
    Statement createStatement(){
        throw new UnsupportedOperationException("No soportado");
    }
}
