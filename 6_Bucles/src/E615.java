import java.util.Scanner;

public class E615 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);        
        System.out.print("Introduce contraseña: ");
        
		int contraseña = teclado.nextInt();
		int intentos = 1;
       
        
        	while (contraseña!=1234 && intentos<3){
        		
        	
        		System.out.print("Reintroduce contraseña:");
        		intentos++;
        		contraseña = teclado.nextInt();	
        		
        	}
        	
        	if(contraseña == 1234) {System.out.println("Correcto");
        	
        	}
        	else {System.out.println("Te has pasado de intentos");
        	}
        	
	}
}


