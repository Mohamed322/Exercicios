
public class Quadrado extends Poligono implements Diagonal{

	public Quadrado(String nome,double base, double altura) {
		super(nome,base, altura);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double diagonal() {
		// TODO Auto-generated method stub
		return getBase()*Math.sqrt(2);
	}

	@Override
	double perimetro() {
		// TODO Auto-generated method stub
		return getBase()*2 + getAltura()*2;
	}
	


}
