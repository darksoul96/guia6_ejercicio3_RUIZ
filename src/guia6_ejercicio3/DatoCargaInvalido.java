package guia6_ejercicio3;

public class DatoCargaInvalido {
	private double cantidadDisponible;
	private double cantidadRequerida;
	private String combustible;

	public DatoCargaInvalido(double cantidadDisponible, double cantidadRequerida, String combustible) {
		super();
		this.cantidadDisponible = cantidadDisponible;
		this.cantidadRequerida = cantidadRequerida;
		this.combustible = combustible;
	}

	public double getCantidadDisponible() {
		return cantidadDisponible;
	}

	public double getCantidadRequerida() {
		return cantidadRequerida;
	}

	public String getCombustible() {
		return combustible;
	}

	
}
