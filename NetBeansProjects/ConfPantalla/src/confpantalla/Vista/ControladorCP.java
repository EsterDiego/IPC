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
    
    private VistaCP vista;
    private ModeloCP modelo;
    

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
        brillo = vista.getBrillo();
    }
    public void establecerContraste(){
        contraste = vista.getContraste();
    }
    public void establecerGiro(){
        giro = vista.getGiro();
    }
    public void establecerColor(){
        color = vista.getColor();
    }
    public void establecerResolucion(){
        resolucion = vista.getResolucion();
    }
    public void aplicar(){
        actualizarModelo();
        vista.actualizar();
    }
    public void aceptar(){
        actualizarModelo();
        vista.actualizar();
        System.exit(0);
        
    }
    public void cancelar(){
        System.exit(0);
    }
    
    public void actualizarModelo(){
        establecerBrillo();
        modelo.setBrillo(brillo);
        establecerContraste();
        modelo.setContraste(contraste);
        establecerGiro();
        modelo.setGiro(giro);
        establecerResolucion();
        if(modelo.esResPermitida(resolucion)){
            modelo.setResolucion(resolucion);
        }else{
            modelo.setResolucion("");
            error("Resolucion");
        }
        establecerColor();
        if(modelo.esColorPermitido(color)){
            modelo.setColor(color);
        }else{
             modelo.setColor("");
            error("Color");
        }
        
    }
    
    public void error(String e){
        if(e=="Resolucion"){
            vista.mostrarErrorResol();        
        }
        if(e=="Color"){
            vista.mostrarErrorColor();
        }
        
    }
    
    
}
