package dto;

import java.util.Random;

import views.AdivinarNumero_JOP;

public class AdivinarNumero {
	
	//Definir atributos
	private int numero;
	private int intentos;
	private boolean encontado;
	
	//Definir constructor por defecto
	public AdivinarNumero() {
		this.numero = generarNumero();
		this.intentos = 0;
		this.encontado = false;
	}

	//Metodo para generar numero aleatorio
	public int generarNumero() {
		Random numero = new Random();
		int numeroInt = numero.nextInt(500 + 1 - 1) + 1;
								
		return numeroInt;
	}
	
	//Metodo para comprobar si es un numero
	public void esNumero (String numeroIntroducido) {
		try {
			int numeroIntroducidoInt = Integer.parseInt(numeroIntroducido);
			this.comprobarNumero(numeroIntroducidoInt);
		} catch (NumberFormatException e) {
			AdivinarNumero_JOP.noIntrodujoNumero();
			this.setIntentosOneMore();
		}
	}
	
	//Metodo para comprobar si el numero es el correcto y por tanto lo ha adivinado
	public void comprobarNumero(int numeroIntroducido) {		
		if (numeroIntroducido < this.numero) {
			this.intentos += 1;
			AdivinarNumero_JOP.introdujoNumeroMayor();
		}else if (numeroIntroducido > this.numero) {
			this.intentos += 1;
			AdivinarNumero_JOP.introdujoNumeroMenor();
		}else {
			this.encontado = true;
			AdivinarNumero_JOP.introdujoNumeroCorrecto(this.intentos);	
		}
	}
	
	//Getters y setters
	public boolean isEncontado() {
		return encontado;
	}

	public void setIntentosOneMore() {
		this.intentos += 1;
	}
	
}
