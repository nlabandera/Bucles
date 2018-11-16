import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int orden;
		
		System.out.println("1. Cargar");
		System.out.println("2. Mostrar");
		System.out.println("3. Listar");
		System.out.println("4. Salir");
		
	do
	{
		
		System.out.print("Introduzca orden:");
		orden = teclado.nextInt();
		
			
				switch(orden) {
					
							case 1: System.out.println("Cargar"); break;
							case 2: System.out.println("Mostrar"); break;
							case 3: System.out.println("Listar"); break;
							case 4: System.out.println("Salir"); break;
							default:System.out.println("Introduzca un numero entre 1 y 4");
				
								}
	}
				
		while (orden!=4);
		
		
		
		
		
	}

}
