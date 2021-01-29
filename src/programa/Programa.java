package programa;

import entidades.Estados;

public class Programa {

	
	public static void main(String args[]) {
		
		Estados e = Estados.valueOf(5);
		
		System.out.println("O nome do Estado é: "+e);
		System.out.println("A UF do estado código "+e.getCod()+ " é "+e.getUf());
		
	}
}
