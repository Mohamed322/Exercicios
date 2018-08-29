
public class Triangulo extends Poligono {

	public Triangulo(String nome, double base, double altura) {
		super(nome,base, altura);
		// TODO Auto-generated constructor stub
		
	}
	
	
	double area() {
		return super.area()/2;
	}


	@Override
	double perimetro() {
		// TODO Auto-generated method stub
		return getBase()*3;
	}

}
