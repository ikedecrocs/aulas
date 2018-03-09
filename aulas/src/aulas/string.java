package aulas;

public class string {

	public static void main(String[] args) {
		String str= "Isto é uma String do Java";
		String xyz= new String("Isto é uma String do Java");
		
		if(str==xyz) System.out.println("IGUAL");
		else System.out.println("DIFERENTE");
		
		if( str.equals(xyz)) {
			//maneira correta de se comparar o conteúdo das strings
		}
		
		System.out.println( "Tamanho da String: " + str.length());
		
		System.out.println( "SubString: "+str.substring(0, 10));
		
		System.out.println( "Caracter na posição 5: "+str.charAt(5));
	}

}
