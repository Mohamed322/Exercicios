
public class Cubo extends Quadrado implements Volume {

	public Cubo(String nome, double base, double altura,double comp) {
		super(nome, base, altura);
		// TODO Auto-generated constructor stub
		this.comp = comp;
	}
	
	private double comp;

	@Override
	public double volume() {
		// TODO Auto-generated method stub
		return super.area()*comp;
	}

}
