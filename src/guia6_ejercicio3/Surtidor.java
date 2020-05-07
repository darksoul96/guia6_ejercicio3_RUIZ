package guia6_ejercicio3;

import exception.CargaInvalidaException;
import exception.FaltaCombustibleException;
import exception.TipoCombustibleInvalidoException;

public class Surtidor {
	private double cantidadDiesel;
	private double cantidadPremium;
	private double cantidadSuper;

	public Surtidor() {

	}

	public void cargarCombustible(String combustible, double cantidad) throws CargaInvalidaException {
		if (cantidad < 0) {
			if (combustible.equalsIgnoreCase("diesel"))
				throw new CargaInvalidaException("cantidad negativa", combustible, cantidad, this.cantidadDiesel);
			else if (combustible.equalsIgnoreCase("premium"))
				throw new CargaInvalidaException("cantidad negativa", combustible, cantidad, this.cantidadPremium);
			else if (combustible.equalsIgnoreCase("super"))
				throw new CargaInvalidaException("cantidad negativa", combustible, cantidad, this.cantidadSuper);
			else
				throw new TipoCombustibleInvalidoException("combustible desconocido", combustible, cantidad, 0);
		} 
		else {
			if (combustible.equalsIgnoreCase("diesel") && (cantidad > this.cantidadDiesel))
				throw new FaltaCombustibleException("falta combustible diesel", combustible, cantidad,
						this.cantidadDiesel);
			else if (combustible.equalsIgnoreCase("premium") && (cantidad > this.cantidadPremium))
				throw new FaltaCombustibleException("falta combustible premium", combustible, cantidad,
						this.cantidadPremium);
			else if (combustible.equalsIgnoreCase("super") && (cantidad > this.cantidadSuper))
				throw new FaltaCombustibleException("falta combustible super", combustible, cantidad,
						this.cantidadSuper);
			else
				throw new TipoCombustibleInvalidoException("combustible desconocido", combustible, cantidad, 0);
		}

	}

	public double getCantidadDiesel() {
		return cantidadDiesel;
	}

	public double getCantidadPremium() {
		return cantidadPremium;
	}

	public double getCantidadSuper() {
		return cantidadSuper;
	}

	public void llenarDiesel() {
		this.cantidadDiesel = 20000;
	}

	public void llenarPremium() {
		this.cantidadPremium = 20000;
	}

	public void llenarSuper() {
		this.cantidadSuper = 20000;
	}

}
