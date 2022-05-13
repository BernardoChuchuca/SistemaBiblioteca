/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Bernardo
 */
public  class Libro  {
    
    private String titulo,autor,edicion;
    private double precio;

    public String getAutor() {
        return autor;
    }

    public String getEdicion() {
        return edicion;
    }

    public double getPrecio() {
        return precio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    
    public double CalcularPrecioFinal(){
           
           
           
        return 0;
    }    
    
    
}
