/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;
import Modelo.ModeloNA;
/**
 *
 * @author adrdelp
 */
public class ControladorNA {
    private VistaNA mivista;
    private ModeloNA mimodelo;
    
    public ControladorNA(VistaNA v ,ModeloNA m){
        mivista=v;
        mimodelo=m;
    }
    
    public void procesaEventoSumar(){
        //Obt num 1
        //obtener num 2
        //Sumar
        //Modificar el modelo
        //Le digo a la vista que se actualice
        Float numero1=Float.parseFloat(mivista.getNumero1());
        Float numero2=Float.parseFloat(mivista.getNumero2());
        Float res=numero1+numero2;
        mimodelo.setResult(res);
        mivista.actualiza();
    }
}
