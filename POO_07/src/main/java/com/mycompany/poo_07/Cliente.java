/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.poo_07;

/**
 *
 * @author CS09
 */
public class Cliente {
    private int dni;
    private String nombre;
    private String direccion;
    private int telefono;

    public Cliente(int dni, String nombre, String direccion, int telefono) {
             this.dni = dni;
             this.nombre = nombre;
             this.direccion = direccion;
             this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
     public void mostrarDatos(){
        System.out.println("\nDNI: " +this.dni+"Nombre: " +this.nombre+ "Direccion: " +this.direccion+ "telefono: "+this.telefono );
    }
}

