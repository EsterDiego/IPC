/*
 * @author Ester Diego
 * @author Adrian Del Prado
 */
package confpantalla.Vista;

import confpantalla.Modelo.ModeloCP;

/**
 * @author Ester Diego
 * @author Adrian Del Prado
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
    
    /**
     * @author Ester Diego
     * @author Adrian Del Prado
     * 
     * Recogen de la vista la seleccion actual de los valores
     * 
     */
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
    
    /**
     * @author Ester Diego
     * @author Adrian Del Prado
     * 
     * Funcionalidad de los botones
     */
    public void aplicar(){
        vista.ocultarErrores();
        actualizarModelo();
        vista.actualizar();
    }
    public void aceptar(){
        vista.ocultarErrores();
        actualizarModelo();
        vista.actualizar();
        System.exit(0);
        
    }
    public void cancelar(){
        System.exit(0);
    }
    
    
    
    /**
     * @author Ester Diego
     * @author Adrian Del Prado
     * 
     * Actualiza los valores del modelo con los nuevos obtenidos dela vista
     */
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
    
    
    
    /**
     * @author Ester Diego
     * @author Adrian Del Prado 
     * Clasifica el error seguna fecte a la seleccion de color o resolucion
     */
    public void error(String e){
        if(e=="Resolucion"){
            vista.mostrarErrorResol();        
        }
        if(e=="Color"){
            vista.mostrarErrorColor();
        }
        
    }
    
    
}
