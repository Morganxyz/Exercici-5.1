import java.util.ArrayList;
import java.util.Scanner;

public class M5_Ex1_DanielAmat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int numParaules = 0;
		String paraula = "";
		
		ArrayList<String>totesparaules = new ArrayList<String>();
		Scanner entrada = new Scanner(System.in);
		System.out.println("Quantes paraules vols introdüir: ");
		numParaules = entrada.nextInt();
		
		for(int i = 0;i < numParaules;i++) {
			System.out.println("Introdueix una paraula: ");
			paraula = entrada.next();
			
			totesparaules.add(paraula);
			
		}
		
		System.out.println(totesparaules);

		
	}

}
