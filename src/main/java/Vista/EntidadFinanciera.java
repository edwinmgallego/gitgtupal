/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package Vista;

import javax.swing.JOptionPane;
import Modelo.CuentaAhorros;
import Controlador.ControladorCuenta;
import Modelo.Cliente;

/**
 *
 * @author LENOVO
 */
public class EntidadFinanciera {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Bienvenido a ENTIDAD FINANCIERA 🏦");

        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del titular:");
        String numeroCuenta = JOptionPane.showInputDialog("Ingrese el número de cuenta:");
        double saldoInicial = 0;
        double tasaInteres = 10;
        String letra = "l"; 

        CuentaAhorros cuenta = new CuentaAhorros(tasaInteres, numeroCuenta, saldoInicial, nombre);

        Cliente cliente = new Cliente(nombre, cuenta);

        ControladorCuenta controlador = new ControladorCuenta(cliente);

        int opcion = 0;

        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("""
                    ===== MENÚ =====
                    1. Consignar dinero
                    2. Retirar dinero
                    3. Solicitar reembolso
                    4. Ver datos del cliente
                    5. Calcular intereses
                    6. Salir
                    
                    Elija una opción:
                    """));
            
            switch(opcion){
                    case 1 -> controlador.consignar();
                    case 2 -> controlador.retirar();
                    case 3 -> controlador.reembolsar();
                    case 4 -> JOptionPane.showMessageDialog(null, cliente.mostrarDatosCliente());
                    case 5 -> JOptionPane.showMessageDialog(null, "Intereses generados: $"+ cuenta.calcularIntereses());
                    case 6 -> JOptionPane.showMessageDialog(null, "Gracias por usar nuestros servicios! ");
                    default -> JOptionPane.showMessageDialog(null, "Opcion no valida.");
                    
        }
        
    }while (opcion != 6);

 }
}
