import java.util.Scanner;

public class E637 
{

	public static void main(String[] args) 
	{
		Scanner usuario = new Scanner(System.in);
		System.out.print("Intruduzca medida:");
		int medida = usuario.nextInt();
		
		for (int alto = 1; alto <= medida; alto++) 
		{
						
			for (int ancho = 1; ancho<=medida; ancho++)
			{
				if (ancho==1 || ancho==medida || alto == 1 || alto == medida)
					System.out.print("* ");
				else
					System.out.print("  ");
			}	
			
			System.out.println();
		}

	}

}
