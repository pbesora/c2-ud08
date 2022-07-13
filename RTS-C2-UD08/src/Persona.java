
public class Persona {

	private String nombre, dni;
	private int edad;
	private char sexo;
	private final char defaultSexo = 'H';
	private Double peso, altura;
	
	
	public Persona(String nombre, String dni, int edad, char sexo, Double peso, Double altura) {
		this.nombre = nombre;
		this.dni = dni;
		this.edad = edad;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
	}


	public Persona() {
		this.nombre = "";
		this.dni = "00000000A";
		this.edad = 0;
		this.sexo = defaultSexo;
		this.peso = 0.0;
		this.altura = 0.0;
	}


	public Persona(String nombre, int edad, char sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public char getSexo() {
		return sexo;
	}


	public void setSexo(char sexo) {
		this.sexo = sexo;
	}


	public Double getPeso() {
		return peso;
	}


	public void setPeso(Double peso) {
		this.peso = peso;
	}


	public Double getAltura() {
		return altura;
	}


	public void setAltura(Double altura) {
		this.altura = altura;
	}
	
	
	
	
	
	
}
