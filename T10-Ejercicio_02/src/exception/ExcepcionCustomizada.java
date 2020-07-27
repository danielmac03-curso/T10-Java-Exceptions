package exception;

public class ExcepcionCustomizada extends Exception{
	
	private int codigoExcepcion;
	
	public ExcepcionCustomizada(){
		super();
		this.codigoExcepcion = 0;
	}	
	
	public ExcepcionCustomizada(int codigoExcepcion){
		super();
		this.codigoExcepcion = codigoExcepcion;
	}
	
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
