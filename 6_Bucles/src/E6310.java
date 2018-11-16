import java.util.Scanner;

public class E6310 {

	public static void main(String[] args) {
		Scanner usuario = new Scanner(System.in);
		System.out.print("Intruduzca primer numero:");
		int a = usuario.nextInt();
		System.out.print("Intruduzca segundo numero:");
		int b = usuario.nextInt();
		
		
		for (int i=1; b<=i; i++)
		{
			for (int j=1; a<=j; j++)
			{
				if(a%i==0 && b%i==0) 
					System.out.println(a);
				else 
					System.out.println(b);
			}
			System.out.println();
		}

	}

}
