/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import javax.swing.JFrame;

/**
 *
 * @author electra
 */
public class StateMachine {
    
    private JFrame currentState;
    
    public StateMachine(){
        start();
    }
    
    void start(){
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                currentState = new InicioW();
                currentState.setVisible(true);
            }
        });
    }
    
    
    void close(){
        currentState.setVisible(false);
        currentState.dispose();
    }
    
    void back() {
       currentState.setVisible(false); 
       currentState.dispose();  
       start();
    }
    
    void anadirParticipante(){
        currentState.setVisible(false);
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                currentState = new InscripW();
                currentState.setVisible(true);
            }
        });
    }
}
