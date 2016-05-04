/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;
import modelo.Modelo;

/**
 *
 * @author adrdelp
 */
public class ControladorInscrip {
    private InscripW vista;
    private Modelo modelo;
   
    public ControladorInscrip(InscripW vista,Modelo modelo){
        this.vista = vista;
        this.modelo = modelo;
    }
    public void volver(){
        Main.getStateMachine().volverInicio();
    }
    public void cambioCategoria(){
        String cat=vista.getCategoria();
        
        if (cat.equals("Absoluta masculino")||cat.equals("Alumnos masculino")|| 
            cat.equals("Prof y PAS masculino")||cat.equals("Federado no univ. masculino")){
            vista.setSexo("Masculino");
        }else{
            vista.setSexo("Femenino");
        }
    }
    public void anadir(){
        if(compruebaNombre()&&compruebaApellido()&compruebaNIF()&&compruebaFecha()){
            int dia,mes,anio;
            dia=Integer.parseInt(vista.getDia());
            mes=Integer.parseInt(vista.getMes());
            anio=Integer.parseInt(vista.getAnio());
            modelo.aniadirParticipante(vista.getCategoria(), vista.getNombre(),
                    vista.getApellido(),vista.getNIF(),vista.getSexo(),
                    dia, mes, anio);
            Main.getStateMachine().volverInicio();
        }else{
            vista.setErrorNombre(!compruebaNombre());
            vista.setErrorApellido(!compruebaApellido());
            vista.setErrorNIF(!compruebaNIF());
            vista.setErrorFecha(!compruebaFecha());
            
        }
        
    }
    //Comprueba que el nombre no este vacio
    private boolean compruebaNombre(){
        if(vista.getNombre().isEmpty())
            return false;
        else
            return true;
                   
        
    }
    private boolean compruebaApellido(){
        if(vista.getApellido().isEmpty())
            return false;
        else
            return true;
                   
        
    }
    
    private boolean compruebaNIF(){
        if(vista.getNIF().length()!=9){
            return false;
        }
        int dni;
        try{
            dni=Integer.parseInt(vista.getNIF().substring(0,8));
        }catch (Exception e){
            return false;
        }
        if (calculaLetra(dni)==Character.toUpperCase(vista.getNIF().charAt(8))){
            return true;
        }else{
            return false;
        }
        
       
    }
    private boolean compruebaFecha(){
        int dia,mes,anio;
        //Comprueba que sean enteros
        try{
            dia=Integer.parseInt(vista.getDia());
            mes=Integer.parseInt(vista.getMes());
            anio=Integer.parseInt(vista.getAnio());
        }catch (Exception e){
            return false;
        }
        //Comprueba que están dentro del rango razonable
        //TODO afinar esta comprobacion para evitar que se pueda
        //meter un 30 de febrero, por ejemplo
        if (dia>31||dia<0||mes<0||mes>12||anio<1900||anio>2016){
            return false;
        }else{
            return true;
        }   
    }
    
    private char calculaLetra(int dni){
        String letras="TRWAGMYFPDXBNJZSQVHLCKE";
        int modulo= dni % 23;
        char letra = letras.charAt(modulo);
        return letra; 
    } 
    
}
