package com.alura.hotel.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author giova
 */
public class UsuarioDAO {
    
    final private Connection conexion;
    
    //Constructor
    public UsuarioDAO(Connection conexion){
        this.conexion = conexion;       
    }
    
    public boolean validarUsuarioDao(String nombre, String clave){
        try {
            
            String consulta = "SELECT nameUser, password FROM Users WHERE nameUser = ? AND password = ?";
            
            final PreparedStatement statement = conexion.prepareStatement(consulta);
            
            statement.setString(1, nombre);
            statement.setString(2, clave);
            
            statement.execute();
            
            final ResultSet resultSet = statement.getResultSet();
            
            if (resultSet.next()) {
                System.out.println("***** Usuario Encontrado! - DAO*****");
                return true;
            }else{
                System.out.println("***** Usuario NO Encontrado! - DAO*****");
                return false;
            }
        } catch (SQLException e) {
            throw new RuntimeException("***** ERROR AL INGRESAR *****" + e);
        }
    }
    
}
