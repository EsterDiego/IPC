/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package confpantalla.Modelo;

/**
 *
 * @author electra
 */
public class ModeloCP {
    
    private int brillo;
    private int contraste;
    private int giro;
    
    /*No todas las opciones para color y resolucion estaran soportadas
    *color solo soporta una opcion asi que lo defino aqui, mientras que las 
    *opciones para resolucion las dare en el controlador*/
    private final String color = "RGB";
    private String resolucion;
    
    public ModeloCP(){
    }
    
    
    public int getBrillo(){
        return brillo;
    }
    public int getContraste(){
        return contraste;
    }
    public int getGiro(){
        return giro;
    }
    public String getColor(){
        return color;
    }
    public String getResolucion(){
        return resolucion;
    }
    
    
    public void setBrillo(int b){
        brillo = b;
    }
    public void setContraste(int c){
        contraste = c;
    }
    public void setGiro(int g){
        giro = g;
    }
    public void setColor(String color){
        
    }
    public void setResolucion(String r){
        resolucion = r;
    }
    
}
