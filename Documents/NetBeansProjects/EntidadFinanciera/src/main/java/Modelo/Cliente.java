/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class Cliente {
    private String nombre;
    private Cuenta cuenta;

    public Cliente(String nombre, Cuenta cuenta) {
        this.nombre = nombre;
        this.cuenta = cuenta;
    }

    public String getNombre() {
        return nombre;
    }
    
    public Cuenta getCuenta() {
        return cuenta;
    }
    
    public String mostrarDatosCliente(){
    return "Cliente:"+ nombre+ "\n"+ cuenta.mostrarDatos();
    }
    
    
    

}
