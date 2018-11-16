import java.util.Scanner;

public class E635 {

	public static void main(String[] args) {
		Scanner usuario = new Scanner(System.in);
		System.out.print("Intruduzca número:");
		
		int a = usuario.nextInt();
		
		for (int b = 0; b <= a; b++)
			if (b%3==0 && b%7==0) System.out.println(b);
		

	}

}
