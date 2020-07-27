import dto.AdivinarNumero;
import views.AdivinarNumero_JOP;

public class AdivinarNumeroApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AdivinarNumero_JOP.empieza();
		AdivinarNumero adivinar = new AdivinarNumero();
		
		while(adivinar.isEncontado() == false) {
			String numeroIntroducido = AdivinarNumero_JOP.introducirNumero();
			adivinar.esNumero(numeroIntroducido);
		}
		
	}

}
