/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;
import modelo.Modelo;

import javax.swing.JFrame;

/**
 *
 * @author electra
 */
public class StateMachine {
    private Modelo modelo;
    
    private JFrame currentState;
    
    public StateMachine(){
        modelo=new Modelo();
        start();
        
    }
    
    void start(){
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                currentState = new InicioW(modelo);
                currentState.setLocationRelativeTo(null);
                currentState.setVisible(true);
            }
        });
    }
    
    
    void close(){
        currentState.dispose();
    }
    
    void anadirParticipante(Modelo modelo){
        currentState.dispose();
        currentState = new InscripW(modelo);
        currentState.setLocationRelativeTo(null);
        currentState.setVisible(true);
    }
    
    void volverInicio(){
        currentState.dispose();
        start();
    }
    
    void ventanaDePago(Modelo modelo){
        Main.cambiaALogin();
    }
    
    public Modelo getModelo(){
        return modelo;
    }
}
