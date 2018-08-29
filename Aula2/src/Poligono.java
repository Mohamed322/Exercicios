
public abstract class Poligono extends Figura {
	
		public Poligono(String nome,double base, double altura) {
		super(nome);
		this.base = base;
		this.altura = altura;
		
	}
		private double base;
		private double altura;
		
	
	
	@Override
	double area() {
		// TODO Auto-generated method stub
		return getBase()*getAltura();
		
	}
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}

}
