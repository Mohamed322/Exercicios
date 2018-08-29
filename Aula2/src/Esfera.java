
public class Esfera extends Circulo implements Volume {


	public Esfera(String nome, double raio) {
		super(nome, raio);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double volume() {
		// TODO Auto-generated method stub
		return Math.pow(super.raio,3)*Math.PI*(4/3);
	}

}
