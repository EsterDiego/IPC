/**
 * @author Ester Diego
 * @author Adrian Del Prado
 * GRupo 10
 */
package confpantalla.Modelo;



/**
 * @author Ester Diego
 * @author Adrian Del Prado
 */

public class ModeloCP {

    private int brillo;
    private int contraste;
    private int giro;
    private int brilloPro;
    private int contrastePro;
    private int color;
    private int colorPro;
    private String resolucion;
    private String resolucionPro;
    private boolean cambiado;

    
    public ModeloCP(){
        brillo=50;
        contraste=50;
        giro=0;
        color=32;
        resolucion="1024x768";
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
    public int getColor(){
        return color;
    }
    public int getColorPro(){
        return colorPro;
    }
    
    public String getResolucion(){
        return resolucion;
    }
    public String getResolucionPro(){
        return resolucionPro;
    }
    public int getBrilloPro(){
        return brilloPro;
    }
    public int getContrPro(){
        return contrastePro;
    }
    public boolean getCambiado(){
        return cambiado;
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
    public void setColor(int c){
        color = c;
    }
    public void setColorPro(int c){
        colorPro = c;
    }
    public void setResolucion(String r){
        resolucion = r;
    }
    public void setResolucionPro(String r){
        resolucionPro = r;
    }
    public void setBrilloPro(int b){
        brilloPro= b;
    }
    public void setContrPro(int c){
        contrastePro = c;
    }
    public void setCambiado(boolean b){
        cambiado = b;
    }
}
