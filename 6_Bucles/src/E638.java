import java.util.Scanner;

public class E638 {

	public static void main(String[] args) {
		Scanner usuario = new Scanner(System.in);
		System.out.print("Dame un numero:");
		int n=usuario.nextInt();
		
			for(int i=1; i<=n; i++) 
			{
				if(n%i==0)
					System.out.println(i);
				
			}

	}

}
