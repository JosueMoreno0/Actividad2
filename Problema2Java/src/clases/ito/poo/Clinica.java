/*******************************************************************************
 * 2021, All rights reserved.
 *******************************************************************************/
package clases.ito.poo;

import java.time.LocalDate;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of Clinica.
 * 
 * @author josueMM
 */
public class Clinica {
	public Clinica(String nombre, String rFC, LocalDate fechaNac) {
		super();
		Nombre = nombre;
		RFC = rFC;
		FechaNac = fechaNac;
	}

	/**
	 * Description of the property Nombre.
	 */
	public String Nombre = "";

	/**
	 * Description of the property RFC.
	 */
	public String RFC = "";

	/**
	 * Description of the property FechaNac.
	 */
	public java.time.LocalDate FechaNac = null;

	// Start of user code (user defined attributes for Clinica)

	// End of user code

	/**
	 * The constructor.
	 */
	public Clinica() {
		// Start of user code constructor for Clinica)
		super();
		// End of user code
	}

	/**
	 * Description of the method AgConsulta.
	 * @param fecha 
	 * @param Sintomas 
	 * @param temperatura 
	 * @param Peso 
	 * @param Estatura 
	 */
	public void AgConsulta(java.time.LocalDate fecha, String Sintomas, int temperatura, float Peso, float Estatura) {
		// Start of user code for method AgConsulta
		// End of user code
	}

	/**
	 * Description of the method Receta.
	 * @param medicamentos 
	 * @param Recomendaciones 
	 * @return 
	 */
	public String Receta(String medicamentos, String Recomendaciones) {
		// Start of user code for method Receta
		String Receta = "";
		return Receta;
		// End of user code
	}

	/**
	 * Description of the method OEdad.
	 * @param Anios 
	 * @return 
	 */
	public boolean OEdad(int Anios) {
		// Start of user code for method OEdad
		boolean OEdad = false;
		return OEdad;
		// End of user code
	}

	// Start of user code (user defined methods for Clinica)

	// End of user code
	/**
	 * Returns Nombre.
	 * @return Nombre 
	 */
	public String getNombre() {
		return this.Nombre;
	}

	/**
	 * Sets a value to attribute Nombre. 
	 * @param newNombre 
	 */
	public void setNombre(String newNombre) {
		this.Nombre = newNombre;
	}

	/**
	 * Returns RFC.
	 * @return RFC 
	 */
	public String getRFC() {
		return this.RFC;
	}

	/**
	 * Sets a value to attribute RFC. 
	 * @param newRFC 
	 */
	public void setRFC(String newRFC) {
		this.RFC = newRFC;
	}

	/**
	 * Returns FechaNac.
	 * @return FechaNac 
	 */
	public java.time.LocalDate getFechaNac() {
		return this.FechaNac;
	}

	/**
	 * Sets a value to attribute FechaNac. 
	 * @param newFechaNac 
	 */
	public void setFechaNac(java.time.LocalDate newFechaNac) {
		this.FechaNac = newFechaNac;
	}

	@Override
	public String toString() {
		return "Clinica [Nombre=" + Nombre + ", RFC=" + RFC + ", FechaNac=" + FechaNac + "]";
	}

}
