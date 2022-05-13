/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.List;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JTextField;

import modelo.Libro;

/**
 *
 * @author Bernardo
 */
public class LibControler {

    public void crearLibro() {

    }

    public void eliminarLibro() {

    }

    public void buscarLibro() {

    }

    public void editarLibro() {

    }

    public ArrayList<Libro> listar() {

        ArrayList<Libro> lis = new ArrayList<>();
        
        Libro lib=new Libro();
        
        lib.setTitulo("Cruces sobre el agua");
        lib.setAutor("Joaquín Gallegos Lara");
        lib.setEdicion("1946");
        lib.setPrecio(20);
        
        
        lis.add(lib);
        
        Libro lib2=new Libro();
        
        lib2.setTitulo("Romeo y Julieta");
        lib2.setAutor("William Shakespeare");
        lib2.setEdicion("1597");
        lib2.setPrecio(20);
        
        lis.add(lib2);
        
        Libro lib3=new Libro();
        
        lib3.setTitulo("Cien años de Soledad");
        lib3.setAutor("Gabriel García Márquez");
        lib3.setEdicion("1967");
        lib3.setPrecio(30);
        
        lis.add(lib3);
        
        Libro lib4=new Libro();
        
        lib4.setTitulo("Ensayo sobre la ceguera");
        lib4.setAutor("José Saramago");
        lib4.setEdicion("1995");
        lib4.setPrecio(15);
        
        lis.add(lib4);
        Libro lib5=new Libro();
        
        lib5.setTitulo("Cuando nadie me ve");
        lib5.setAutor("Danilo Carrera");
        lib5.setEdicion("2020");
        lib5.setPrecio(20);
        
        lis.add(lib5);
        
        

        return lis;
    }

    public String agregarfigura(Libro lib, String link) throws IOException {

        String linea = " ";

        try {
            FileWriter leer = new FileWriter(link, true);//obtenemos el archivo q va hcaer editado
            PrintWriter wx = new PrintWriter(leer, true);
            String salida = lib.getTitulo() + ";" + lib.getAutor() + ";" + lib.getEdicion() + ";" + lib.getPrecio() + ";";///se guardar una cadena de acuerdo al orden q va hcaer escrito los datos
            wx.println(salida);//este es un salto de linea
            wx.close();
            leer.close();

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return linea;

    }

}
