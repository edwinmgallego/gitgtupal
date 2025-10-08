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
public class Cuenta {

    String numeroCuenta;
    double saldoCuenta = 0;
    String titular;

    public Cuenta(String numeroCuenta, double saldoCuenta, String titular) {
        this.numeroCuenta = numeroCuenta;
        this.saldoCuenta = saldoCuenta;
        this.titular = titular;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldoCuenta() {
        return saldoCuenta;
    }

    public String getTitular() {
        return titular;
    }

    public boolean consignar(double monto) {
        if (monto > 0) {
            saldoCuenta += monto;
            return true;
        }
        return false;
    }

    public boolean retirar(double monto) {
        if (monto > 0 && monto <= saldoCuenta) {
            saldoCuenta -= monto;
            return true;
        }
        return false;
    }

    public boolean reembolsar(double monto) {
        if (monto > 0) {
            saldoCuenta += monto;
            return true;
        }
        return false;
    }
     public String mostrarDatos() {
        return "Titular: " + titular + "\n"
             + "Número de cuenta: " + numeroCuenta + "\n"
             + "Saldo actual: $" + saldoCuenta;
    }
}
