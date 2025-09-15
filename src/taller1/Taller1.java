/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller1;

/**
 *
 * @author marya
 */
import java.util.Scanner;




public class Taller1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Libro libro1 = new Libro ();   
        Libro libro2 = new Libro ("Cien años de soledad","Garcia Marquez", 500);
    
        CuentaBancaria cuenta1 = new CuentaBancaria ();
        CuentaBancaria cuenta2 = new CuentaBancaria (50465847, 100000, "Corriente");
    
        Estudiante estudiante1 = new Estudiante ();
        Estudiante estudiante2 = new Estudiante ("Maria", 16, "11-D");
    
    Scanner scanner = new Scanner(System.in);
    
        System.out.println("Ingrese titulo del libro:");
        String titulo = scanner.nextLine(); 
        
        System.out.println("El titulo del libro 2 es:" + libro2.toString());
        System.out.println("El autor es: " + libro2.toString());
        System.out.println("Su numero de paginas es: " + libro2.toString());
        
        System.out.println("Ingrese el numero de cuenta:");
        int numeroCuenta = scanner.nextInt();
        
        System.out.println("El numero de cuenta es: " + cuenta2.getNumeroCuenta());
        System.out.println("El saldo es: " + cuenta2.getSaldo());
        System.out.println("El tipo de cuenta es: " + cuenta2.getTipoCuenta());
        
        System.out.println("Ingrese el nombre del estudiante: ");
        String nombre = scanner.nextLine();
        
        System.out.println("El nombre del estudiante es: " + estudiante2.getNombre());
        System.out.println("Edad: " + estudiante2.getEdad());
        System.out.println("Curso: " + estudiante2.getCurso());
    }    
        
    }

    
