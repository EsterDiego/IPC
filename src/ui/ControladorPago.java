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
public class ControladorPago {
    private PagoW vista;
    private Modelo modelo;
    
    public ControladorPago(PagoW vista,Modelo modelo){
        this.vista=vista;
        this.modelo=modelo;
        
    }
    public void volver(){
        Main.getStateMachineLogin().volverInicio();
    }
    
}
