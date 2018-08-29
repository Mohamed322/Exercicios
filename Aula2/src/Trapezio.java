
public class Trapezio extends Poligono {

	public Trapezio(String nome, double base, double altura,double base2) {
		super(nome, base, altura);
		// TODO Auto-generated constructor stub
		this.base2 = base2;
		
	}
	
	private double base2;

	@Override
	double perimetro() {
		// TODO Auto-generated method stub
		return getBase() + base2 + (Math.sqrt((getAltura()*getAltura() + Math.pow(((getBase()- base2)/2),2))));
	}
	
	double area() {
		return ((getBase()+base2)*getAltura())/2;
	}

}
