import exception.ExcepcionCustomizada;
import views.ExcepcionCustomizada_JPO;

public class ExcepcionCustomizadaApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExcepcionCustomizada_JPO.comenzar();
		
		try {
			int edadInt = Integer.parseInt(ExcepcionCustomizada_JPO.introducirEdad());
			
			if (edadInt == 15) {
				throw new ExcepcionCustomizada(15);
			}else if(edadInt == 16) {
				throw new ExcepcionCustomizada(16);
			}else if(edadInt == 18) {
				throw new ExcepcionCustomizada(18);
			}else if(edadInt >= 20){
				ExcepcionCustomizada_JPO.mostrarMensaje("Puede llevar motos sin limitacion por edad");
			}	
		} catch (NumberFormatException e1) {
			ExcepcionCustomizada_JPO.mostrarMensaje("Debe introducir un numero");
		} catch (ExcepcionCustomizada e2) {
			ExcepcionCustomizada_JPO.mostrarMensaje(e2.getMessage());
		}
		
		ExcepcionCustomizada_JPO.acabar();		
	}

}
