import dto.GenerarNumeroAleaterio;
import exception.ExcepcionCustomizada;
import views.GenerarNumeroAleatorio_JPO;

public class GenerarNumeroAleaterioApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GenerarNumeroAleatorio_JPO.comenzar();
		
		GenerarNumeroAleaterio numAleatorio = new GenerarNumeroAleaterio();
		
		GenerarNumeroAleatorio_JPO.mostrarMensaje(numAleatorio.mostrarNumero());
		
		try {
			
			if(numAleatorio.numeroPar() == true) {
				throw new ExcepcionCustomizada(00);
			}else {
				throw new ExcepcionCustomizada(01);
			}
				
		} catch (ExcepcionCustomizada e) {
			GenerarNumeroAleatorio_JPO.mostrarMensaje(e.getMessage());
		}

	}

}
