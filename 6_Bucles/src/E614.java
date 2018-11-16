import java.util.Scanner;

public class E614 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce número: ");
		int x = teclado.nextInt();
		int total;
		
			while (x!=0){
				total =x*x;
				System.out.println(+total);
				System.out.print("Introduce otro numero:");
				x = teclado.nextInt();
				
			}
			System.out.println("has introducido 0");

	}

}
