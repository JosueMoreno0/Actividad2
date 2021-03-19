/*******************************************************************************
 * 2021, All rights reserved.
 *******************************************************************************/
package Clasificaciondecomposiciones;

import java.util.Date;
import java.util.HashSet;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of Composicion.
 * 
 * @author josueMM
 */
public class Composicion {
	public Composicion(String titulo, float duracion, HashSet<String> interpretes, String genero, Date fechaRegistro,
			Date fechaEstreno) {
		super();
		Titulo = titulo;
		Duracion = duracion;
		Interpretes = interpretes;
		Genero = genero;
		FechaRegistro = fechaRegistro;
		FechaEstreno = fechaEstreno;
	}

	/**
	 * Description of the property Titulo.
	 */
	public String Titulo = "";

	/**
	 * Description of the property Duracion.
	 */
	public float Duracion = 0F;

	/**
	 * Description of the property Interpretes.
	 */
	public HashSet<String> Interpretes = new HashSet<String>();

	/**
	 * Description of the property Genero.
	 */
	public String Genero = "";

	/**
	 * Description of the property FechaRegistro.
	 */
	public Date FechaRegistro = null;

	/**
	 * Description of the property FechaEstreno.
	 */
	public Date FechaEstreno = null;

	// Start of user code (user defined attributes for Composicion)

	// End of user code

	/**
	 * The constructor.
	 */
	public Composicion() {
		// Start of user code constructor for Composicion)
		super();
		// End of user code
	}

	/**
	 * Description of the method SolicCompositor.
	 * @param Interprete 
	 */
	public void SolicCompositor(String Interprete) {
		// Start of user code for method SolicCompositor
		// End of user code
	}

	// Start of user code (user defined methods for Composicion)

	// End of user code
	/**
	 * Returns Titulo.
	 * @return Titulo 
	 */
	public String getTitulo() {
		return this.Titulo;
	}

	/**
	 * Sets a value to attribute Titulo. 
	 * @param newTitulo 
	 */
	public void setTitulo(String newTitulo) {
		this.Titulo = newTitulo;
	}

	/**
	 * Returns Duracion.
	 * @return Duracion 
	 */
	public float getDuracion() {
		return this.Duracion;
	}

	/**
	 * Sets a value to attribute Duracion. 
	 * @param newDuracion 
	 */
	public void setDuracion(float newDuracion) {
		this.Duracion = newDuracion;
	}

	/**
	 * Returns Interpretes.
	 * @return Interpretes 
	 */
	public HashSet<String> getInterpretes() {
		return this.Interpretes;
	}

	/**
	 * Returns Genero.
	 * @return Genero 
	 */
	public String getGenero() {
		return this.Genero;
	}

	/**
	 * Sets a value to attribute Genero. 
	 * @param newGenero 
	 */
	public void setGenero(String newGenero) {
		this.Genero = newGenero;
	}

	/**
	 * Returns FechaRegistro.
	 * @return FechaRegistro 
	 */
	public Date getFechaRegistro() {
		return this.FechaRegistro;
	}

	/**
	 * Sets a value to attribute FechaRegistro. 
	 * @param newFechaRegistro 
	 */
	public void setFechaRegistro(Date newFechaRegistro) {
		this.FechaRegistro = newFechaRegistro;
	}

	/**
	 * Returns FechaEstreno.
	 * @return FechaEstreno 
	 */
	public Date getFechaEstreno() {
		return this.FechaEstreno;
	}

	/**
	 * Sets a value to attribute FechaEstreno. 
	 * @param newFechaEstreno 
	 */
	public void setFechaEstreno(Date newFechaEstreno) {
		this.FechaEstreno = newFechaEstreno;
	}

	@Override
	public String toString() {
		return "Composicion [Titulo=" + Titulo + ", Duracion=" + Duracion + ", Interpretes=" + Interpretes + ", Genero="
				+ Genero + ", FechaRegistro=" + FechaRegistro + ", FechaEstreno=" + FechaEstreno + "]";
	}

}
