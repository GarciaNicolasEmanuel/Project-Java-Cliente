/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientebanco;

import modelo.Cliente;
import modelo.CuentaAhorro;
import modelo.CuentaCorriente;

/**
 *
 * @author User
 */
public class ClienteBanco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente c0 = new Cliente("Juan", "Fernandez", 25);
        Cliente c1 = new Cliente("Lucía", "Lopez", 35);
        CuentaCorriente cc0 = new CuentaCorriente(c0, 1, 20000);
        CuentaCorriente cc1 = new CuentaCorriente(c1, 1);
        CuentaAhorro ca0 = new CuentaAhorro(c1, 2, 25000, 0.03);
        CuentaAhorro ca1 = new CuentaAhorro(c0, 1, 0.03);
        CuentaAhorro ca2 = new CuentaAhorro(c0, 1);
        
        System.out.println(cc0.toString());
        System.out.println(cc1.toString());

        System.out.println(cc0.equals(cc1));

    }

}
