package taller1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author marya
 */
public class CuentaBancaria {
    
   int numeroCuenta;
   double saldo;
   String tipoCuenta;

public CuentaBancaria() {
    
   numeroCuenta = 0;  
   saldo = 0;
   tipoCuenta = "Desconocida"; 
   }

public CuentaBancaria(int numeroCuenta, String tipoCuenta) {
   this.numeroCuenta = numeroCuenta;
   this.tipoCuenta = tipoCuenta;
   }

public CuentaBancaria(int numeroCuenta, double saldo, String tipoCuenta) {
    this.numeroCuenta = numeroCuenta;
 
    this.saldo = saldo;
    this.saldo = saldo;
    this.tipoCuenta = tipoCuenta; 
   }     

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }
}
