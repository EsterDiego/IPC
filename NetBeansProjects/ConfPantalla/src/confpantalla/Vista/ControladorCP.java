/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package confpantalla.Vista;

import confpantalla.Modelo.ModeloCP;

/**
 *
 * @author electra
 */
public class ControladorCP {
    
    private VistaCP vista = new VistaCP();
    private ModeloCP modelo = new ModeloCP();
    
    /*los valores del modelo solo se actualizan cuando se pulsa aplicar o aceptar*/
    private int brillo;
    private int contraste;
    private int giro;
    private String color;
    private String resolucion;
    
    
    public ControladorCP(VistaCP v, ModeloCP m){
        vista = v;
        modelo = m;
    }
    
    public void establecerBrillo(){
        
    }
    public void establecerContraste(){
        
    }
    public void establecerGiro(){
        
    }
    public void establecerColor(){
        
    }
    public void establecerResolucion(){
        
    }
    public void aplicar(){
        
    }
    public void aceptar(){
        
    }
    public void cancelar(){
        
    }
    
    public void actualizarModelo(){
        modelo.setBrillo(brillo);
        modelo.setContraste(contraste);
        modelo.setGiro(giro);
        if((resolucion=="1024x768")||(resolucion=="800x600")){
            modelo.setResolucion(resolucion);
        }else{
            errorResolucion();
        }
        if(color!="RGB"){
            errorColor();
        }
        
    }
    
    public void errorResolucion(){
        
    }
    public void errorColor(){
        
    }
    
}
