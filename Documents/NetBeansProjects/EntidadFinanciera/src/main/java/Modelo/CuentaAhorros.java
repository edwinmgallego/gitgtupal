/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author LENOVO
 */
public class CuentaAhorros extends Cuenta {

    private double tasaInteres;

    public CuentaAhorros(double tasaInteres, String numeroCuenta, double saldoCuenta, String titular) {
        super(numeroCuenta, saldoCuenta, titular);
        this.tasaInteres = tasaInteres;
    }

    public double getTasaInteres() {
        return tasaInteres;
    }

    public void setTasaInteres(double tasaInteres) {
        this.tasaInteres = tasaInteres;
    }

    public double calcularIntereses() {
        return getSaldoCuenta() * (tasaInteres / 100);
    }

    @Override
    public String mostrarDatos() {
        return super.mostrarDatos() + "\n"
                + "Tipo de cuenta: Ahorros\n"
                + "Tasa de interés: " + tasaInteres + "%";
    }
}
