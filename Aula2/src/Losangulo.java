
public class Losangulo extends Poligono {

	public Losangulo(String nome,double base, double altura) {
		super(nome, base, altura);
		// TODO Auto-generated constructor stub
	}


	@Override
	double perimetro() {
		// TODO Auto-generated method stub
		return getBase()*4;
	}
	
	

}
