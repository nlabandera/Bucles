import java.util.Scanner;

public class E617 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);        
        System.out.print("Introduce número:");
        int x = teclado.nextInt();
        int cont = 1;
        
        	while (cont<=x) {
        		System.out.print("*");
        		cont++;
        	}

	}

}
