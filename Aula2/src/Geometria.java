import java.util.ArrayList;
public class Geometria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Figura> figuras = new ArrayList<>();
			figuras.add(new Circulo("Circulo", 5));
			figuras.add(new Quadrado("Quadrado",5,5));
			figuras.add(new Losangulo("Losangulo",5,5));
			figuras.add(new Retangulo("Retangulo",5,5));
			figuras.add(new Triangulo("Triangulo",5,5));
			figuras.add(new Trapezio("Trapézio",5,5,0));
			figuras.add(new Piramide("Piramide",5,5,5));
			figuras.add(new Cubo("Cubo",2,2,2));
			figuras.add(new Cilindro("Cilindro",2,2));
			figuras.add(new Esfera("Esfera",5));
					
			for (Figura fig: figuras) {
				String msg = String.format("%s \n Area Total: %.2f \n Perimetro: %.2f", fig.getNome(),fig.area(),Math.ceil(fig.perimetro()));
				System.out.println(msg);
				if(fig instanceof Diagonal) {
					String d = String.format(" Diagonal: %.4s",((Diagonal)fig).diagonal());
					System.out.println(d);
				}
				if(fig instanceof Volume) {
					String v = String.format(" Volume: %.6s",((Volume)fig).volume());
					System.out.println(v);
				}
				System.out.println("");
				
			}
				
	}
	
}
	
		
	


