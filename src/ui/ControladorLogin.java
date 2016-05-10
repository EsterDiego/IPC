/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import modelo.Modelo;

/**
 *
 * @author Adrian
 */
public class ControladorLogin {
    private LoginW vista;
    private Modelo modelo;
    
    public ControladorLogin(LoginW vista,Modelo modelo){
        this.vista = vista;
        this.modelo = modelo;
    }
    public void volver(){
        Main.cambiaAInicio();
    }
    
}

