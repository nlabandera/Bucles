import java.util.Scanner;

public class E639 
{

	public static void main(String[] args) 
	
	{
		
		
	
		
		System.out.print("Dame un numero:");
		Scanner nerea = new Scanner(System.in);
		int n=nerea.nextInt();
		int cont=0;
		
		
			for (int i=1; i<=n; i++)
			{
				if(n%i==0)   
					cont++;
					
			
			if(cont==2) System.out.println("Es primo");
			else System.out.println("No es primo");
			}
		
	}

}
