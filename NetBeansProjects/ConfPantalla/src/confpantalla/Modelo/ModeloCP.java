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
    
    private static final String RGB = "RGB";
    
    private enum Color{CMYK,RGB,HSB};
    private enum Resolucion{R1152x768,R1024x768,R896x600,R800x600};
    
    
    
    private int brillo;
    private int contraste;
    private int giro;
    private String color;
    private String resolucion;
    private Color colorS;
    private Resolucion resolS;

    
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
    public boolean esResPermitida(String res){
        
        if((res=="R1024x768")||(res=="R800x600")){
            return true;
        }else{
            return false;
        }
       
    }
    public boolean esColorPermitido(String col){
        
        if(col=="RGB"){
        return true;
        }else{
            return false;
        }
        
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
