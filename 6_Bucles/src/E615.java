import java.util.Scanner;

public class E615 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);        
        System.out.print("Introduce contrase�a: ");
        
		int contrase�a = teclado.nextInt();
		int intentos = 1;
       
        
        	while (contrase�a!=1234 && intentos<3){
        		
        	
        		System.out.print("Reintroduce contrase�a:");
        		intentos++;
        		contrase�a = teclado.nextInt();	
        		
        	}
        	
        	if(contrase�a == 1234) {System.out.println("Correcto");
        	
        	}
        	else {System.out.println("Te has pasado de intentos");
        	}
        	
	}
}


