/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Objects;

/**
 *
 * @author User
 */
public class CuentaCorriente {
    private Cliente titular;
    private int nroCuenta;
    private double saldo;

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public int getNroCuenta() {
        return nroCuenta;
    }

    public void setNroCuenta(int nroCuenta) {
        this.nroCuenta = nroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public CuentaCorriente(Cliente titular, int nroCuenta, double saldo) {
        this.titular = titular;
        this.nroCuenta = nroCuenta;
        this.saldo = saldo;
    }

    public CuentaCorriente(Cliente titular, int nroCuenta) {
        this.titular = titular;
        this.nroCuenta = nroCuenta;
    }
    public CuentaCorriente(){}
    
    public double depositar(double monto){
       return this.saldo+monto;
    }
    public double extraer(double monto){
        return this.saldo-monto;
    }

    @Override
    public String toString() {
        return "CuentaCorriente{" + "titular=" + titular + ", nroCuenta=" + nroCuenta + ", saldo=" + saldo + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 19 * hash + Objects.hashCode(this.titular);
        hash = 19 * hash + this.nroCuenta;
        hash = 19 * hash + (int) (Double.doubleToLongBits(this.saldo) ^ (Double.doubleToLongBits(this.saldo) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CuentaCorriente other = (CuentaCorriente) obj;
       return this.nroCuenta == other.nroCuenta;
    }
    
}
