
public class Password {

	private int longitud;
	private String contrase�a;
	
	public Password() {
		this.longitud = 8;
		this.contrase�a = "";
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
		
		this.contrase�a = randomPass;
	}
	
	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getContrase�a() {
		return contrase�a;
	}

	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}
	
	
}
