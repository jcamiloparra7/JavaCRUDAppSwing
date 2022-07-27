/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto2;

import java.sql.*;

/**
 *
 * @author juancparra
 */
public class conexion {
    
    String strConexionDB = "jdbc:sqlite:project2db.db";
    Connection conn = null;
    PreparedStatement pstm = null;
    
    public conexion() {
        
        try {
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection(strConexionDB);
            System.out.println("Connection succeeded");
        }
        
        catch (Exception e) {
            System.out.println("Connection failed" + e);
        }
    
    }
    
    public int ejecutarSentenciaSQL(String strSentenciaSQL) {
        
        try {
            pstm = conn.prepareStatement(strSentenciaSQL);
            pstm.execute();
            System.out.println("Executed");
            return 1;
        }
        
        catch (SQLException e) {
            System.out.println(e);
            return 0;
        }

        
    }
    
    public ResultSet consultarRegistros(String strSentenciaSQL) {
        
        try {
          pstm = conn.prepareStatement(strSentenciaSQL);
          ResultSet respuesta = pstm.executeQuery();
          return respuesta;
        }
        
        catch (Exception e){
          System.out.println(e);
          return null;
        }
        
    }
      
}
