import java.util.ArrayList;
import java.util.Arrays;

public class Electrodomestico {

	protected Double precioBase,peso;
	protected String color;
	private String[] arrayColores= {"blanco", "negro", "rojo", "azul", "gris"};
	protected final ArrayList<String> COLORES = new ArrayList<>(Arrays.asList(arrayColores)); 
	protected char consumo;
	
	public Electrodomestico(Double precioBase, String color, char consumo, Double peso) {
		this.precioBase = 100.0;
		this.color = "blanco";
		this.consumo = 'F';
		this.peso = 5.0;
	}

	
	public Electrodomestico(Double precioBase, Double peso) {
		this.precioBase = precioBase;
		this.peso = peso;
		this.color = "blanco";
		this.consumo = 'F';
	}


	public Electrodomestico(Double precioBase, Double peso, String color, char consumo) {
		this.precioBase = precioBase;
		this.peso = peso;
		
		if(consumo>64 && consumo<71) 
			this.consumo = consumo;
		else
			this.consumo = 'F';
		
		validarColor(color);
		
	}

	private void validarColor(String color) {
		if(COLORES.contains(color.toLowerCase()))
			this.color = color;
		else
			this.color = "blanco";
	}
	
	public Double getPrecioBase() {
		return precioBase;
	}


	public void setPrecioBase(Double precioBase) {
		this.precioBase = precioBase;
	}


	public Double getPeso() {
		return peso;
	}


	public void setPeso(Double peso) {
		this.peso = peso;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public char getComsumo() {
		return consumo;
	}


	public void setComsumo(char consumo) {
		this.consumo = consumo;
	}
	
	
}
