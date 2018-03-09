package aulas;

public class foravancado {
	public static void main(String[] args) {
		for(String s : args) {
			System.out.println("Argumento: "+s);
		}
		
		
		List lista = new ArrayList();
		//adiciona itens à lista
		for(String s : lista) {
			System.out.println(s);
		}
	}
}
