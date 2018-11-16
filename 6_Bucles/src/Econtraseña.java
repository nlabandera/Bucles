import java.util.Scanner;
public class Econtraseña {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n = 0; 
		int i;
		
		for (i=1; i<=3; i++) 
		{
			System.out.print("Introduzca contraseña:");
			n = teclado.nextInt();
			
			if (n!=1234) 
				System.out.println("Contraseña incorrecta");
				
				
			else  break;
			
			
		}
		
		if (n == 1234)
		
			System.out.println("Correcto");
		
		else
			System.out.print("Te has pasasdo de intentos");

	}

}
