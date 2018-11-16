import java.util.Scanner;

public class E625 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		
		int login;
		int password;
		
		do {
			System.out.print("Introduce login:");
			login = teclado.nextInt();
			System.out.print("Introduce contraseña:");
			password = teclado.nextInt();
			
		}
		
		while((login!=1809) || (password!=1234)); {
			System.out.println("Correcto!");
		
		}
			
		
	}
	
}


