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
        //Igual podríamos quitar el setVisible, ¿por qué no borramos la ventana
        //directamente??
        currentState.setVisible(false);
        currentState.dispose();
    }
    
    void back() {
       currentState.setVisible(false); 
       currentState.dispose();  
       start();
    }
    
    void anadirParticipante(Modelo modelo){
        currentState.dispose();
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                currentState = new InscripW(modelo);
                currentState.setLocationRelativeTo(null);
                currentState.setVisible(true);
            }
        });
    }
    
    void volverInicio(){
        currentState.dispose();
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                currentState = new InicioW(modelo);
                currentState.setLocationRelativeTo(null);
                currentState.setVisible(true);
            }
        });
        
    }
    
    void ventanaDePago(Modelo modelo){
        currentState.dispose();
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                currentState = new PagoW(modelo);
                currentState.setLocationRelativeTo(null);
                currentState.setVisible(true);
            }
        });
        
    }
}
