/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alura.hotel.controller;

import com.alura.hotel.dao.ReservaDAO;
import com.alura.hotel.factory.ConnectionFactory;

/**
 *
 * @author giova
 */
public class ReservaController {
    
    ReservaDAO reservaDAO;
    
    public ReservaController(){
        this.reservaDAO = new ReservaDAO(new ConnectionFactory().recuperarConexion());
    }
    
}
