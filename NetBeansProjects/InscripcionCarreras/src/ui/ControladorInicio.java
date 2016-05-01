/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

/**
 *
 * @author electra
 */
public class ControladorInicio {
    
    InicioW vista;
    
    public ControladorInicio(InicioW vista){
        this.vista = vista;
    }
    
    public void pagar(){
        
    }
    
    public void añadir(){
        Main.getStateMachine().anadirParticipante();
    }
    
    public void cancelar(){
        System.exit(0);
    }
}
