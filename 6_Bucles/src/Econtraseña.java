import java.util.Scanner;
public class Econtrase�a {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n = 0; 
		int i;
		
		for (i=1; i<=3; i++) 
		{
			System.out.print("Introduzca contrase�a:");
			n = teclado.nextInt();
			
			if (n!=1234) 
				System.out.println("Contrase�a incorrecta");
				
				
			else  break;
			
			
		}
		
		if (n == 1234)
		
			System.out.println("Correcto");
		
		else
			System.out.print("Te has pasasdo de intentos");

	}

}
