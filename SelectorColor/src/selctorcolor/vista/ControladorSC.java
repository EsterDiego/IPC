/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selctorcolor.vista;
import selectorcolor.modelo.ModeloSC;

/**
 *
 * @author adrdelp
 */
public class ControladorSC {
    private VistaSC mivista;
    private ModeloSC mimodelo;
    
    public ControladorSC(VistaSC v,ModeloSC m){
        mivista=v;
        mimodelo=m;
    }
    public void procesaSlidRojo(){
        mimodelo.setRojo(mivista.getSlidRojoValue());
        mivista.actualiza();
    }
    public void procesaSlidVerde(){
        mimodelo.setVerde(mivista.getSlidVerdeValue());
        mivista.actualiza();
    }
    public void procesaSlidAzul(){
        mimodelo.setAzul(mivista.getSlidAzulValue());
        mivista.actualiza();
    }
    public void procesaPulsado(){
        mimodelo.setPulsado(true);
        mivista.actualiza();
    }
    public void procesaLeidoPulsado(){
        mimodelo.setPulsado(false);
        mivista.actualiza();
    }
    public void procesaTextRojo(){
        try{
            int i=Integer.parseInt(mivista.getTextRojoText());
            if (i<256&&i>=0){
                mimodelo.setRojo(i);
                mivista.actualiza();
            }else{
            mivista.setError(1);
            mivista.actualiza();
            }
        }catch (Exception e){
            if (mivista.getTextRojoText().equals("")){
                mimodelo.setRojo(0);
                mivista.actualiza();
            }
            mivista.setError(1);
            mivista.actualiza();
        }
    }
    public void procesaTextVerde(){
        try{
            int i=Integer.parseInt(mivista.getTextVerdeText());
            if (i<256&&i>=0){
                mimodelo.setVerde(i);
                mivista.actualiza();
            }else{
            mivista.setError(2);
            mivista.actualiza();
            }
        }catch (Exception e){
            if (mivista.getTextVerdeText().equals("")){
                mimodelo.setVerde(0);
                mivista.actualiza();
            }
            mivista.setError(2);
            mivista.actualiza();
        }
    }
    
    public void procesaTextAzul(){
        try{
            int i=Integer.parseInt(mivista.getTextAzulText());
            if (i<256&&i>=0){
                mimodelo.setAzul(i);
                mivista.actualiza();
            }else{
            mivista.setError(3);
            mivista.actualiza();
            }
        }catch (Exception e){
            if (mivista.getTextAzulText().equals("")){
                mimodelo.setAzul(0);
                mivista.actualiza();
            }
            mivista.setError(3);
            mivista.actualiza();
        }
    }
}
