/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Adrian
 */
public class Participante {
    private String categoria,nombre,apellido,NIF,sexo;
    private int diaNacimiento,mesNacimiento,anioNacimiento;
   
    public Participante(String categoria,String nombre,String apellido,
            String NIF,String sexo,int diaNacimiento,int mesNacimiento,
            int anioNacimiento){
        this.categoria=categoria;
        this.nombre=nombre;
        this.apellido=apellido;
        this.NIF=NIF;
        this.sexo=sexo;
        this.diaNacimiento=diaNacimiento;
        this.mesNacimiento=mesNacimiento;
        this.anioNacimiento=anioNacimiento;
    }
    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
}
