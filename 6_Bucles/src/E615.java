import java.util.Scanner;

public class E615 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);        
        System.out.print("Introduce contraseņa: ");
        
		int contraseņa = teclado.nextInt();
		int intentos = 1;
       
        
        	while (contraseņa!=1234 && intentos<3){
        		
        	
        		System.out.print("Reintroduce contraseņa:");
        		intentos++;
        		contraseņa = teclado.nextInt();	
        		
        	}
        	
        	if(contraseņa == 1234) {System.out.println("Correcto");
        	
        	}
        	else {System.out.println("Te has pasado de intentos");
        	}
        	
	}
}


