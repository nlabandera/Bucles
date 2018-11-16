import java.util.Scanner;

public class E639bis 
{

	public static void main(String[] args) 
	
	{
		Scanner nerea = new Scanner(System.in);
		System.out.print("Dame un numero:");
		int n=nerea.nextInt();
		int cont=0;
		boolean esPrimo = true;
		
			for (int i=2; i<n; i++)
				
			{
				if(n%i==0)  esPrimo=false;
					
			}
			if(esPrimo==true) System.out.println("Es primo");
			else System.out.println("No es primo");
	}

}
