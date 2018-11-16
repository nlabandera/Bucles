import java.util.Scanner;
public class E2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);        
        System.out.print("Introduce dato: ");
        int dato = teclado.nextInt();
        int suma = 0;
        
        while (dato!=0)
        	{System.out.println("No era 0");
        	System.out.print("Introduce dato: ");
        	dato = teclado.nextInt();
        	}
        System.out.println("Terminado!");

	}

}
