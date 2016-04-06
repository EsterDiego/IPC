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
    
    private enum ColorSoportado{RGB};
    private enum ResolucionSoportada{R1024X768,R800x600};
    
    
    
    private int brillo;
    private int contraste;
    private int giro;
    private String color;
    private String resolucion;
    private ColorSoportado colorS;
    private ResolucionSoportada resolS;

    
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
    public ResolucionSoportada getResPremitida(){
        return resolS;
    }
    public ColorSoportado getColorPermitido(){
        return colorS;
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
