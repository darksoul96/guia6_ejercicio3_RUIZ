package exception;

import guia6_ejercicio3.DatoCargaInvalido;

public class CargaInvalidaException extends Throwable {
	private DatoCargaInvalido dato_invalido;

	public CargaInvalidaException(String mensaje, String combustible, double cantidadRequerida, double cantidadDisponible) {
		super(mensaje);
		this.dato_invalido = new DatoCargaInvalido(cantidadDisponible, cantidadRequerida, combustible);
	}

	public DatoCargaInvalido getDato_invalido() {
		return dato_invalido;
	}

}
