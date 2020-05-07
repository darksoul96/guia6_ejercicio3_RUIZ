package guia6_ejercicio3;

import exception.CargaInvalidaException;
import exception.FaltaCombustibleException;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double cantidad;
		cantidad=1000;
		Surtidor s1=new Surtidor();
	
		try {
			s1.cargarCombustible("super", cantidad);
		} catch (CargaInvalidaException e) {
			cantidad=s1.getCantidadSuper();
			s1.llenarSuper();
		}

	}

}
