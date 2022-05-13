/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Bernardo
 */
public class Cliente {
    
    private String nombre,apellido;
    private int codigo;
    private double credito;

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getCodigo() {
        return codigo;
    }

    public double getCredito() {
        return credito;
    }

    public String getNombre() {
        return nombre;
    }
    
    
    
}
