
public class Serie {
	
	private String titulo, genero, creador;
	private int numTemporadas;
	private boolean entregado;
	
	public Serie() {
		this.titulo = "";
		this.genero = "";
		this.creador = "";
		
	}

	public Serie(String titulo, String creador) {
		this.titulo = titulo;
		this.creador = creador;
		this.genero = "";
		this.numTemporadas = 3;
		this.entregado = false;
	}

	public Serie(String titulo, String genero, String creador, int numTemporadas) {
		this.titulo = titulo;
		this.genero = genero;
		this.creador = creador;
		this.numTemporadas = numTemporadas;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

	public int getNumTemporadas() {
		return numTemporadas;
	}

	public void setNumTemporadas(int numTemporadas) {
		this.numTemporadas = numTemporadas;
	}

	public boolean isEntregado() {
		return entregado;
	}

	public void setEntregado(boolean entregado) {
		this.entregado = entregado;
	}
	
	
	
}
