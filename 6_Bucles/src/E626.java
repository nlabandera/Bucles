import java.util.Scanner;
public class E626 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Intruduce medida:");
		byte medida= teclado.nextByte();
		int ancho = 1;
		int alto = 1;
		
		
			do {
				ancho=1;
				
			
					do {
						System.out.println("");
						ancho=medida*medida;
						}
				
					while (ancho<=medida);
					System.out.print("*");
					alto++;
					
				}
			
			
			while (alto<=medida);
				
		
		
	}

}
