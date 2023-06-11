package com.alura.hotel.dao;

import java.sql.Connection;

/**
 *
 * @author giova
 */
public class ReservaDAO {
    
    private Connection conexion;

    public ReservaDAO(Connection conexion) {
        this.conexion = conexion;
    }
    
    public void guardarReserva(){
        
    }
    
}
