/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fran;

/**
 *
 * @author CS07
 */
public class Auto {
    private String matricula;
    private String modelo;
    private String color;
    private String marca;
    private double precioAlc;
    
    public Auto(String matricula,String modelo, String color, String marca, double precioAlc){
        this.matricula = matricula;
        this.modelo = matricula;
        this.color = color;
        this.marca = marca;
        this.precioAlc = precioAlc;
    }
    public void Mostrar(){
        System.out.println("Matricula: " + this.matricula + "\n modelo: " + this.modelo + "\n color: " + this.color + "\n marca: " +this.marca + "\n precio del alquiler: " + this.precioAlc );
}

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecioAlc() {
        return precioAlc;
    }

    public void setPrecioAlc(double precioAlc) {
        this.precioAlc = precioAlc;
    }
    
}
