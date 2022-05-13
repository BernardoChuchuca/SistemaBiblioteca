/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.Date;

/**
 *
 * @author Bernardo
 */
public class Compra {
    private Cliente cliente;
    private int codigo;
    private Date fecha;
    private Libro libro;

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public int getCodigo() {
        return codigo;
    }

    public Date getFecha() {
        return fecha;
    }

    public Libro getLibro() {
        return libro;
    }
    
    
    
    
}

