/*******************************************************************************
 * 2021, All rights reserved.
 *******************************************************************************/
package Transportes;

// Start of user code (user defined imports)

// End of user code

/**
 * Description of Transporte.
 * 
 * @author josueMM
 */
public class Transporte {
	/**
	 * Description of the property Marca.
	 */
	public String Marca = "";

	/**
	 * Description of the property Modelo.
	 */
	public int Modelo = 0;

	/**
	 * Description of the property CargaMaxima.
	 */
	public float CargaMaxima = 0F;

	/**
	 * Description of the property FechaAdquisicion.
	 */
	public int FechaAdquisicion = 0;

	/**
	 * Description of the property ViajesRealizados.
	 */
	public int ViajesRealizados = 0;

	// Start of user code (user defined attributes for Transporte)

	// End of user code

	/**
	 * The constructor.
	 */
	public Transporte() {
		// Start of user code constructor for Transporte)
		super();
		// End of user code
	}

	/**
	 * Description of the method ViajeRealizado.
	 * @param CiudadDestino 
	 * @param Direccion 
	 * @param FechaViaje 
	 * @param FechaRegreso 
	 * @param MontoViaje 
	 */
	public void ViajeRealizado(String CiudadDestino, String Direccion, int FechaViaje, int FechaRegreso,
			float MontoViaje) {
		// Start of user code for method ViajeRealizado
		// End of user code
	}

	/**
	 * Description of the method VehiculoCarga.
	 * @param Carga 
	 * @param Vehiculo 
	 */
	public void VehiculoCarga(float Carga, String Vehiculo) {
		// Start of user code for method VehiculoCarga
		// End of user code
	}

	/**
	 * Description of the method ControlViajes.
	 * @param Viaje 
	 */
	public void ControlViajes(boolean Viaje) {
		// Start of user code for method ControlViajes
		// End of user code
	}

	// Start of user code (user defined methods for Transporte)

	// End of user code
	/**
	 * Returns Marca.
	 * @return Marca 
	 */
	public String getMarca() {
		return this.Marca;
	}

	/**
	 * Sets a value to attribute Marca. 
	 * @param newMarca 
	 */
	public void setMarca(String newMarca) {
		this.Marca = newMarca;
	}

	/**
	 * Returns Modelo.
	 * @return Modelo 
	 */
	public int getModelo() {
		return this.Modelo;
	}

	/**
	 * Sets a value to attribute Modelo. 
	 * @param newModelo 
	 */
	public void setModelo(int newModelo) {
		this.Modelo = newModelo;
	}

	/**
	 * Returns CargaMaxima.
	 * @return CargaMaxima 
	 */
	public float getCargaMaxima() {
		return this.CargaMaxima;
	}

	/**
	 * Sets a value to attribute CargaMaxima. 
	 * @param newCargaMaxima 
	 */
	public void setCargaMaxima(float newCargaMaxima) {
		this.CargaMaxima = newCargaMaxima;
	}

	/**
	 * Returns FechaAdquisicion.
	 * @return FechaAdquisicion 
	 */
	public int getFechaAdquisicion() {
		return this.FechaAdquisicion;
	}

	/**
	 * Sets a value to attribute FechaAdquisicion. 
	 * @param newFechaAdquisicion 
	 */
	public void setFechaAdquisicion(int newFechaAdquisicion) {
		this.FechaAdquisicion = newFechaAdquisicion;
	}

	/**
	 * Returns ViajesRealizados.
	 * @return ViajesRealizados 
	 */
	public int getViajesRealizados() {
		return this.ViajesRealizados;
	}

	/**
	 * Sets a value to attribute ViajesRealizados. 
	 * @param newViajesRealizados 
	 */
	public void setViajesRealizados(int newViajesRealizados) {
		this.ViajesRealizados = newViajesRealizados;
	}

}
