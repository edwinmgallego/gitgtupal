/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Cuenta;
import Modelo.Cliente;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class ControladorCuenta {

    private Cliente cliente;

    public ControladorCuenta(Cliente cliente) {
        this.cliente = cliente;
    }

    public void consignar() {
        double monto = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto a consignar: "));
        boolean exito = cliente.getCuenta().consignar(monto);
        if (exito) {
            JOptionPane.showMessageDialog(null, "Consignación exitosa.\nNuevo saldo: $" + cliente.getCuenta().getSaldoCuenta());
        } else {
            JOptionPane.showMessageDialog(null, "Error: el monto debe ser mayor que cero.");
        }
    }
        public void retirar() {
        double monto = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto a retirar: "));
        boolean exito = cliente.getCuenta().retirar(monto);

        if (exito) {
            JOptionPane.showMessageDialog(null, "Retiro exitoso.\n"
                    + "Nuevo saldo: $" + cliente.getCuenta().getSaldoCuenta());
        } else {
            JOptionPane.showMessageDialog(null, "Error: saldo insuficiente o monto inválido.");
        }
    }

    public void reembolsar() {
        double monto = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto a reembolsar: "));
        boolean exito = cliente.getCuenta().reembolsar(monto);

        if (exito) {
            JOptionPane.showMessageDialog(null, "Reembolso exitoso.\n"
                    + "Nuevo saldo: $" + cliente.getCuenta().getSaldoCuenta());
        } else {
            JOptionPane.showMessageDialog(null, "Error: el monto debe ser mayor que cero.");
        }
    }
}
