/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selectorcolor.modelo;

import java.awt.Color;

/**
 *
 * @author adrdelp
 */
public class ModeloSC {
    private int rojo,verde,azul;
    private boolean pulsado=false;
    
    public ModeloSC(){
        rojo=128;
        verde=128;
        azul=128;
    }
    public int getRojo(){
        return rojo;
    }
    public int getVerde(){
        return verde;
    }
    public int getAzul(){
        return azul;
    }
    public boolean getPulsado(){
        return pulsado;
    }
    private static String toBrowserHexValue( int number) {
        StringBuilder build = new StringBuilder (Integer.toHexString(number & 0xff));
        while (build.length() <2) {
            build.append("0"); 
            }
        return build.toString().toUpperCase(); 
    }
    
    public String getRGB() {
        return "#" + toBrowserHexValue(rojo) + toBrowserHexValue(verde) +toBrowserHexValue(azul) ;
    } 
    public void setRojo(int r){
        rojo=r;
    }
    public void setVerde(int v){
        verde=v;
    }
    public void setAzul(int a){
        azul=a;
    }
    public void setPulsado(boolean a){
        pulsado=a;
    }
    
}
