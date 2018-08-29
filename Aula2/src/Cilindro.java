
public class Cilindro extends Circulo implements Volume{

	public Cilindro(String nome, double raio,double comp) {
		super(nome, raio);
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
