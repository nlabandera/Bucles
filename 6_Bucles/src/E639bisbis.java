import java.util.Scanner; 

public class E639bisbis {

	public static void main(String[] args) {
		Scanner nerea = new Scanner(System.in);
		System.out.print("Dame un numero:");
		int n=nerea.nextInt();
		boolean esPrimo = true;
		int i=2;
		
		while(esPrimo==true &&i<n)
		{
			if(n%i==0) esPrimo=false;
					i++;
		}
		if(esPrimo==true) System.out.println("Es primo");
		else System.out.println("No es primo");
	}

}
