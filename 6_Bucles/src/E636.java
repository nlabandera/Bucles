import java.util.Scanner;
public class E636 {

	public static void main(String[] args) {
		Scanner usuario = new Scanner(System.in);
		System.out.print("Intruduzca ancho:");
		byte ancho = usuario.nextByte();
		System.out.print("Intruduzca alto:");
		byte alto = usuario.nextByte();
		
		for (byte al=1; al<=alto;al++) {
			
			for(byte a = 1; a<=ancho; a++) System.out.print("*");
											
			System.out.println();	
		}
		

	}

}
