package com.alura.hotel.tests;

import com.alura.hotel.factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author giova
 */
public class TestConexion {
    
    public static void main(String[] args) throws SQLException {
        
        Connection conexion = new ConnectionFactory().recuperarConexion();
        
        System.out.println("");
        System.out.println("***** Conexion Exitosa! *****");
        System.out.println("");
        
        conexion.close();
    }
    
}
