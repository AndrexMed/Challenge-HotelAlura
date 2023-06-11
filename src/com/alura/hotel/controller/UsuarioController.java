package com.alura.hotel.controller;

import com.alura.hotel.dao.UsuarioDAO;
import com.alura.hotel.factory.ConnectionFactory;

/**
 *
 * @author giova
 */
public class UsuarioController {
    
    UsuarioDAO usuarioDAO;
    
    public UsuarioController(){ 
        this.usuarioDAO = new UsuarioDAO(new ConnectionFactory().recuperarConexion()); 
    }
    
    public boolean validarUsuario(String nombre, String clave){
        return usuarioDAO.validarUsuarioDao(nombre, clave);
    }
        
}
