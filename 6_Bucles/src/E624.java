import java.util.Scanner;
public class E624 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		
		int a;
		int b;
		
		do {
			System.out.print("Introduce n�mero:");
			a = teclado.nextInt();
			System.out.print("Introduce n�mero:");
			b= teclado.nextInt();
			
			if (a<=0 || b<=0)
				System.out.println("Intro n�mero positivo"
						+ "\n");
			
			else
				System.out.println(a+b +"\n");
			
			
		}
		while((a!= 0) && (b!=0)); 
		
		
		
	}

}
