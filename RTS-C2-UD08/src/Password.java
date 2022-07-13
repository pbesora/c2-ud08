
public class Password {

	private int longitud;
	private String contraseña;
	
	public Password() {
		this.longitud = 8;
		this.contraseña = "";
	}
	
	public Password(int longitud) {
		
		this.longitud = longitud;
		generarPass(longitud);
	}

	private void generarPass(int longitud) {
		
		char c;
		String randomPass="";
		
		for(int i=0; 0<longitud; i++) {
			c = (char) (48 + ((74+1)*Math.random()));
			randomPass += c;
		}
		
		this.contraseña = randomPass;
	}
	
	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	
	
}
