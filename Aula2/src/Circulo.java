
public class Circulo extends Figura {
	 
	public Circulo(String nome,double raio) {
		super(nome);
		this.raio = raio;
		
	}

	public double raio;
	
	
	@Override
	double area() {
		// TODO Auto-generated method stub
		return (raio*raio) * Math.PI; 
	}

	@Override
	double perimetro() {
		// TODO Auto-generated method stub
		return 2*Math.PI * raio;
	}

}
