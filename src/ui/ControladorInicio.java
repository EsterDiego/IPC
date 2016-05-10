/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;
import modelo.Modelo;

/**
 *
 * @author electra
 */
public class ControladorInicio {
    
    private InicioW vista;
    private Modelo modelo;
    
    public ControladorInicio(InicioW vista,Modelo modelo){
        this.vista = vista;
        this.modelo = modelo;
    }
    
    public void pagar(){
        Main.cambiaALogin();
    }
    public void eliminaParticipante(int index){
        modelo.eliminaParticipante(index);
        vista.actualiza();
    }
    
    public void añadir(){
        Main.getStateMachine().anadirParticipante(modelo);
    }
    
    public void cancelar(){
        System.exit(0);
    }
}
