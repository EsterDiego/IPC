/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import javax.swing.JFrame;
import modelo.Modelo;

/**
 *
 * @author Adrian
 */
public class StateMachineLogin {
    private Modelo modelo;
    
    private JFrame currentState;
    
    public StateMachineLogin(){
        modelo=Main.getStateMachine().getModelo();
        start();
    }
    
    void start(){
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                currentState = new LoginW(modelo);
                currentState.setLocationRelativeTo(null);
                currentState.setVisible(true);
            }
        });
    }
    
    void close(){
        currentState.dispose();
    }
    
    void volverInicio(){
        currentState.dispose();
        start();
    }
    void ventanaPrincipal(){
        currentState.dispose();
        Main.getStateMachine().start();
                
    }
    void cambiaAPago(){
        currentState.dispose();
        currentState = new PagoW(modelo);
    }
    
    void recuperacionPass(){
       new RecupContraseña();
    }
    
}
