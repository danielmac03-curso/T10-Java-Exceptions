package dto;

import java.util.Random;

import views.AdivinarNumero_JOP;

public class AdivinarNumero {
	
	private int numero;
	private int intentos;
	private boolean encontado;
	
	public AdivinarNumero() {
		this.numero = generarNumero();
		this.intentos = 0;
		this.encontado = false;
	}

	public int generarNumero() {
		Random numero = new Random();
		int numeroInt = numero.nextInt(500 + 1 - 1) + 1;
								
		return numeroInt;
	}
	
	public void esNumero (String numeroIntroducido) {
		try {
			int numeroIntroducidoInt = Integer.parseInt(numeroIntroducido);
			this.comprobarNumero(numeroIntroducidoInt);
		} catch (NumberFormatException e) {
			AdivinarNumero_JOP.noIntrodujoNumero();
			this.setIntentosOneMore();
		}
	}
	
	public void comprobarNumero(int numeroIntroducido) {		
		if (numeroIntroducido > this.numero) {
			this.intentos += 1;
			AdivinarNumero_JOP.introdujoNumeroMayor();
		}else if (numeroIntroducido < this.numero) {
			this.intentos += 1;
			AdivinarNumero_JOP.introdujoNumeroMenor();
		}else {
			this.encontado = true;
			AdivinarNumero_JOP.introdujoNumeroCorrecto(this.intentos);	
		}
	}

	public boolean isEncontado() {
		return encontado;
	}

	public void setIntentosOneMore() {
		this.intentos += 1;
	}
	
}
