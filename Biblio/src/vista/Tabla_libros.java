package vista;


/**
 * @(#) ModelPersona.java 11 may. 2018
 * Universidad Politecnica Salesiana
 * Cuenca-Ecuador
 */


import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import modelo.Libro;




public class Tabla_libros extends AbstractTableModel {

	public String[] columnas = {"TITULO","AUTOR","EDICION","PRECIO"};//array de las columnas con el titulo del contenido
	public Class[] columnasTipos = {String.class, String.class,String.class,Double.class};//tipo de dato a trbajar
	private ArrayList<Libro> listaEmpleados = new ArrayList<>();//array list de tipo medico

	/**
	 * constructor de la clase que recibe los datos
	 * @param datos
	 */
	public Tabla_libros(ArrayList<Libro> datos) {
		super();
		listaEmpleados= new ArrayList<Libro>();
		this.listaEmpleados = datos;
	}

	/** 
	 * constructor vacio
	 */
	public Tabla_libros() {
	}


	/**
	 * devuelve el numero de columnas que posee la tabla
	 * @return 
	 */
	public int getColumnCount() {
		return columnas.length;
	}

	/**
	 * devuelve la cantidad de filas que posee la tabla
	 */
	public int getRowCount() {
		return listaEmpleados.size();
	}

	/**
	 * establece los tados que se optiene de persona
	 */
	public void setValueAt(Object value, int row, int col) {
		Libro emp = (Libro) (listaEmpleados.get(row));

		switch (col) {
		
		case 0:
			emp.setTitulo((String) value);
			break;
		case 1:
			emp.setAutor((String) value);
			break;
		
		case 2:
			emp.setEdicion((String) value);
			break;
		case 3:
			emp.setPrecio((Double) value);
			break;
                 
               
                
		}
	}

	/**
	 * devuelve el nombre de la columna
	 */
	public String getColumnName(int col) {
		return columnas[col];
	}

	/**
	 * devuelve el tipo de colunma
	 */
	public Class getColumnClass(int col) {
		return columnasTipos[col];
	}
	/**
	 * obtiene la informacion de persona 
	 */
	public Object getValueAt(int row, int col) {
		Libro emp = (Libro) (listaEmpleados.get(row));

		switch (col) {
		
		
		case 0:
			return emp.getTitulo();
                case 1:
			return emp.getAutor();
		case 2:
			return emp.getEdicion();
                 case 3:
			return emp.getPrecio();        
               
		
               
                        
                
                                
                        
                
                        
                        
		
		
		}
		return new String();
	}

}
