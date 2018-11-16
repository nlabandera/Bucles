import java.util.Scanner;

public class Opsmatematicas {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int orden;
		int a;
		int b;
		
		System.out.print("Numero 1:");
		a = teclado.nextInt();
		System.out.print("Numero 2:");
		b = teclado.nextInt();
		
		System.out.println("1. Sumar");
		System.out.println("2. Restar");
		System.out.println("3. Multiplicar");
		System.out.println("4. Dividir");
		System.out.println("5. Salir");
		
	
	
				do{
						
					System.out.print("Intruduzca orden:");
					orden = teclado.nextInt();
				
				
					
						
						switch(orden) {
						
												
									case 1: System.out.println(a+b); break;
									case 2: System.out.println(a-b); break;
									case 3: System.out.println(a*b); break;
									case 4: System.out.println(a/b); break;
									case 5: System.out.println("Salir"); break; 
									default:System.out.println("el numero entre 1 y 5");
						
										}
					}
						
				while (orden!=5);
		
		
		
		
		
	}

}
