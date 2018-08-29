
public abstract class Figura {
	
	public Figura(String nome) {
		super();
		this.nome = nome;
	}
	
	private String nome;
	abstract double area();
	abstract double perimetro();
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

}
