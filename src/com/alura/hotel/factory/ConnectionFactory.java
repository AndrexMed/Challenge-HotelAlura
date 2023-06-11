package com.alura.hotel.factory;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author giova
 */
public class ConnectionFactory {
    
    private DataSource datasource;
    
    public ConnectionFactory(){
        
        var pooledDataSource = new ComboPooledDataSource();
        
         String urlPoolConexion = "jdbc:sqlserver://localhost:1433;" +
                                 "database=hotelalura;" +
                                 "loginTimeout=30;" +
                                 "TrustServerCertificate=True;";
        
        pooledDataSource.setJdbcUrl(urlPoolConexion);
        pooledDataSource.setUser("Andrex");
        pooledDataSource.setPassword("andres01");
        
        pooledDataSource.setMaxPoolSize(10);
        
        this.datasource = pooledDataSource;
    }
    
    public Connection recuperarConexion(){
        try{
        return this.datasource.getConnection();
        } catch (SQLException e){
            throw new RuntimeException(e);
        }
        
    }
    
}
