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
		case 00:
			mensaje = "Es par";
			break;
		case 01:
			mensaje = "Es impar";	
			break;
		}
		
		return mensaje;		
	}

}
