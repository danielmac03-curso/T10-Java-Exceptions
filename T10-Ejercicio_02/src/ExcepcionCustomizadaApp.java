import exception.ExcepcionCustomizada;
import views.ExcepcionCustomizada_JPO;

public class ExcepcionCustomizadaApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Mensaje para comenzar
		ExcepcionCustomizada_JPO.mostrarMensaje("Apto para llevar motos sin limitacion por edad?");
		
		//Intenta ejecitar un codigo sino intenta capturar la excepcion
		try {
			//Preguntamos la edad
			String edad = ExcepcionCustomizada_JPO.introducirEdad();
			int edadInt = Integer.parseInt(edad);
			
			//Dependiendo de la edad lanzamos una extension o mostramos un mensaje
			if (edadInt == 15) {
				throw new ExcepcionCustomizada(01);
			}else if(edadInt == 16) {
				throw new ExcepcionCustomizada(02);
			}else if(edadInt == 18) {
				throw new ExcepcionCustomizada(03);
			}else if(edadInt >= 20){
				ExcepcionCustomizada_JPO.mostrarMensaje("Puede llevar motos sin limitacion por edad");
			}else if(edadInt < 0) {
				throw new ExcepcionCustomizada(04);
			}
			
		} catch (NumberFormatException e1) {
			ExcepcionCustomizada_JPO.mostrarMensaje("Debe introducir un numero");
		} catch (ExcepcionCustomizada e2) {
			ExcepcionCustomizada_JPO.mostrarMensaje(e2.getMessage());
		}
		
		//Mensaje para acabar
		ExcepcionCustomizada_JPO.mostrarMensaje("Programa terminado");
	}

}
