package exception;

public class ExcepcionCustomizada extends Exception{
	
	//Definir atributos
	private int codigoExcepcion;
	
	//Definir constructor por defecto
	public ExcepcionCustomizada(){
		super();
		this.codigoExcepcion = 0;
	}	
	
	//Definir constructor con el parametro codigo excepcion
	public ExcepcionCustomizada(int codigoExcepcion){
		super();
		this.codigoExcepcion = codigoExcepcion;
	}
	
	//Dependiedno del codigoExcepcion mostramos un mensaje o otro
	@Override
	public String getMessage() {		
		String mensaje = "";
				
		switch (this.codigoExcepcion) {
		case 15:
			mensaje = "Solo puede llevar ciclomotores y cuadriciclos";
			break;
		case 16:
			mensaje = "Como maximo puede llevar motos de 125 cm3 y vehículos agrícolas";	
			break;
		case 18:
			mensaje = "Como maximo puede llevar turismos, motos y camiones";
			break;
		}
		
		return mensaje;		
	}

}
