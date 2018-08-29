public class Palindromo {

	public static void main(String[] args) {
		int pal [] = new int [16];
		String msg = "";
		int pa = 0;
		
		for(int i = 0; i < pal.length; i++) {
			
			pal [i] =(int) (Math.floor(Math.random()*10));
			
			msg += pal[i] + " ";
			
		}
		for (int i = 0; i + 3 < pal.length; i++) {
			if (pal[i] == pal [i+3] && pal[i + 1] == pal[i+2]) {
				
				pa++;
			}
		}
		
		System.out.println("Sequencia:\n" + msg + "\nNumero de Palindromos: " + pa  );

	}

}
