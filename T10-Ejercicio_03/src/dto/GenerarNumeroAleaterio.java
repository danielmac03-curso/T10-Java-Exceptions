package dto;

import java.util.Random;

public class GenerarNumeroAleaterio {
	
	private int numero;
	
	public GenerarNumeroAleaterio() {
		this.numero = generarNumero();
	}
	
	public int generarNumero() {
		Random numero = new Random();
		int numeroInt = numero.nextInt(999 + 1 - 0) + 0;
								
		return numeroInt;
	}
	
	public String mostrarNumero() {		
		String resulado = "El numero aleatorio generado es: " + this.numero;
		return resulado;	
	}
	
	public boolean numeroPar() {		
		boolean resultado = false;
		
		if(this.numero %2 == 0) {
			resultado = true;
		}
		
		return resultado;
	}

}
