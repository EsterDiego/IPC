/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Adrian
 */
public class Modelo {
    private ArrayList<Participante> lista=new ArrayList<Participante>();
    private double precioTotal;
    
    public Modelo(){
        precioTotal=0;
    }
    public void aniadirParticipante(String categoria,String nombre,String apellido,
            String NIF,String sexo,int diaNacimiento,int mesNacimiento,
            int anioNacimiento){
        Participante a=new Participante(categoria,nombre,apellido,NIF,sexo
                ,diaNacimiento, mesNacimiento,anioNacimiento);
        lista.add(a);
        this.setTotal(this.getTotal()+5);
        
    }
    public void eliminaParticipante(int index){
        lista.remove(index);
        this.setTotal(this.getTotal()-5);
    }
    public String getNombre(int posicion){
        return lista.get(posicion).getNombre()+" "+lista.get(posicion).getApellido();
    }
    
    public double getTotal(){
        return precioTotal;
    }
    private void setTotal(double a){
        this.precioTotal=a;
    }
    public int inscritos(){
        return lista.size();
    }
    
}
