/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller1;

/**
 *
 * @author marya
 */




public class Taller1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
    }

    /*
     * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
     * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
     */
    /**
     *
     * @author marya
     */
    public static class CuentaBancaria {

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
            this.tipoCuenta = tipoCuenta;
        }
    }
    
}
