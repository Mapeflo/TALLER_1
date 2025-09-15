package taller1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author marya
 */
public class Libro {
    
    String titulo;
    String autor;
    int numeroPaginas;    
    
public Libro()   { 

    titulo = "No identificado";
    autor = "Desconocido";
    numeroPaginas = 0 ;
}
public Libro (String titulo,String autor, int numeroPaginas ){ 
    this.titulo = titulo ;
    this.autor = autor;
    
 if (numeroPaginas >= 0){ 
    this.numeroPaginas = numeroPaginas;
}else {
        this.numeroPaginas = 0;
    }
      
}
 public void mostrarDetalles(){
     
     System.out.println("Titulo: " + titulo + "Autor: " + autor + "numeroPaginas: "+ numeroPaginas);
 }
 
 
   public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

}
    
    
    
    
    
    

