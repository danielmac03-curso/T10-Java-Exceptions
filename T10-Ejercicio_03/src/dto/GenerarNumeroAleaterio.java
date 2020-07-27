package dto;

import java.util.Random;

public class GenerarNumeroAleaterio {
	
	//Definir los atributos
	private int numero;
	
	//Definir el constructor por defecto
	public GenerarNumeroAleaterio() {
		this.numero = generarNumero();
	}
	
	@Override
	public String toString() {
		return  "El numero aleatorio generado es: " + this.numero;
	}
	
	//Metodo para generar un numero aleatorio
	public int generarNumero() {
		Random numero = new Random();
		int numeroInt = numero.nextInt(999 + 1 - 0) + 0;
								
		return numeroInt;
	}

	//Metodo para saber si el numero es par
	public boolean numeroPar() {		
		boolean resultado = false;
		
		if(this.numero %2 == 0) {
			resultado = true;
		}
		
		return resultado;
	}

}
