/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author User
 */
public class CuentaAhorro extends CuentaCorriente {
    private double interes=0.025;

    public CuentaAhorro(Cliente titular, int nroCuenta, double saldo, double interes) {
        super(titular, nroCuenta, saldo);
        this.interes=interes;
    }

    public CuentaAhorro(Cliente titular, int nroCuenta, double interes) {
        super(titular, nroCuenta);
        this.interes=interes;
    }

    public CuentaAhorro(Cliente titular, int nroCuenta) {
        super(titular, nroCuenta);
    }

    public CuentaAhorro() {
    }
    
     public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }
    
    public double calcularInteres(){
        return (super.getSaldo()*this.interes)+super.getSaldo();
        
    }
    public double calcularInteres0(double interes){
        return (super.getSaldo()*interes)+super.getSaldo();
    }
    
}
