import java.util.Scanner;
public class E616 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce login:");
		int login = teclado.nextInt();
		System.out.print("Introduce contrase�a:");
		int contrase�a=teclado.nextInt();
		
		while(login!=1809 && contrase�a!=1234) {
			if ((login!=1809) && (contrase�a == 1234)){
				System.out.print("Reintroduce login:");
				
			}
			else {
				System.out.print("Reintroduce contrase�a:");
			}
			
		}
	}
			

}


