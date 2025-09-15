package taller1;

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
      this(nombre,edad);
      this.curso = curso;
  } 

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}  

