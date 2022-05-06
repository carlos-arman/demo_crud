/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication10;

/**
 *
 * @author kevin
 */
public class Kevin_Torres {
    public class Vehiculo {
    protected String marca;
    protected String color;
    protected int anio;
    protected int nLLantas;

    public Vehiculo(String marca, String color, int anio, int nLLantas){
        this.marca = marca;
        this.color = color;
        this.anio = anio;
        this.nLLantas = nLLantas;

    }
    public String getmarca(){
        return marca;
    }
}
}
