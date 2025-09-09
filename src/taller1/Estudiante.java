/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author marya
 */
public class Estudiante {
   String nombre;
    int edad;
    String curso;

public Estudiante() {
    
    nombre = "Sin registrar";
    edad = 0;
    curso = "Sin asignar"; 
  }

public Estudiante(String nombre, int edad) {
     this.nombre = nombre;
     this.edad = edad;
  }

public Estudiante(String nombre, int edad, String curso) {
      this.nombre = nombre;
      this.edad = edad;
      this.curso = curso;
  } 
}
