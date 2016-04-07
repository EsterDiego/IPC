/**
 * @author Ester Diego
 * @author Adrian Del Prado
 * Grupo 10
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
    private int color;
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
        actualizarModelo();
        modelo.setCambiado(false);
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
        modelo.setResolucion(resolucion);
        establecerColor();
        modelo.setColor(color);
        
    }
    
    
    public void actualizarTR(){
        establecerBrillo();
        modelo.setBrilloPro(brillo);
        establecerContraste();
        modelo.setContrPro(contraste);
        establecerResolucion();
        modelo.setResolucionPro(resolucion);
        establecerColor();
        modelo.setColorPro(color);
        modelo.setCambiado(true);
        vista.actualizar();
        
    }
    //Elimina las resoluciones y los colores de la lista que no son compatibles,para que el usuario no pueda
    //seleccionar una configuración que no soporta su pantalla.
    public void verCompatibles(){
        for(int i=0;i<vista.getResComboTam();i++){
            if (esResNoPermitida(vista.getResCombo(i))){
                vista.quitaElementoResCombo(i);
                i--;
            }
        }
        for(int j=0;j<vista.getColComboTam();j++){
            if (esColorNoPermitido(vista.getColCombo(j))){
                System.out.println("Entr");
                vista.quitaElementoColCombo(j);
                j--;
            }
        }
   
    }
    //Funciones similuadas que comprobarían que resoluciones y colores son permitidas por la pantalla
    public boolean esResNoPermitida(String res){ 
        if((res=="1024x768")||(res=="800x600")){
            return false;
        }else{
            return true;
        }
       
    }
    public boolean esColorNoPermitido(int col){
        return false;
        
    }

    
}
