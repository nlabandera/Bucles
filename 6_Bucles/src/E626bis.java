import java.util.Scanner;
public class E626bis {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Intruduce medida:");
		int medida= teclado.nextInt();
		int ancho = 1;
		int alto = 1;
		
		
			do {
				alto=1;
				
					do {
						System.out.print("*");
						alto++;
						}
				
					while (alto<=medida);
					System.out.println("");
					ancho++;
					
				}
			
			
			while (ancho<=medida);
				
		
		
	}

}