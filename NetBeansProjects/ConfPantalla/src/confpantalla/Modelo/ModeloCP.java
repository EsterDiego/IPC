/*
 * @author Ester Diego
 * @author Adrian Del Prado
 */
package confpantalla.Modelo;



/**
 * @author Ester Diego
 * @author Adrian Del Prado
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
    
    
    /**
     *@author Ester Diego
     *@author Adrian Del Prado
     * 
     * Retornan los valores almacenados actualmente
     */
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
    
    
    
    /**
     * @author Ester Diego
     * @author Adrian Del Prado
     * 
     * Comprueban si las opciones estan soportadas
     * 
     */
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
    
    
    /**
     * @author Ester Diego
     * @author Adrian Del Prado
     * Actualiza los valores almacenados
    */
    public void setBrillo(int b){
        brillo = b;
    }
    public void setContraste(int c){
        contraste = c;
    }
    public void setGiro(int g){
        giro = g;
    }
    public void setColor(String c){
        color = c;
    }
    public void setResolucion(String r){
        resolucion = r;
    }
    
}
