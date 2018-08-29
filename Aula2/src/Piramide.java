
public class Piramide extends Triangulo implements Volume {

	public Piramide(String nome,double base, double altura, double comprimento) {
		super(nome,base, altura);
		// TODO Auto-generated constructor stub
		this.comprimento = comprimento;
	}
	
	private double comprimento;

	@Override
	public double volume() {
		// TODO Auto-generated method stub
		return super.area()*comprimento*(1/3);
	}

}
