
public class Retangulo extends Poligono implements Diagonal {

	public Retangulo(String nome,double base, double altura) {
		super(nome,base, altura);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double diagonal() {
		// TODO Auto-generated method stub
		return Math.sqrt((getBase()*getBase() + (getAltura()*getAltura())));
	}

	@Override
	double perimetro() {
		// TODO Auto-generated method stub
		return getBase()*2 + getAltura()*2;
	}
	
	

}
