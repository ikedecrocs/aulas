package aulas;

public class operadoresaritmeticos {

	public static void main(String[] args) {
	//multipli��o e divis�o
		int um = 3/2;					//divis�o de inteiros gera um inteiro
		float umemeio = (float) 3/2;	//ocorre promo��o aritm�tica para float
		double xyz = umemeio*um;		//ocorre promo��o aritm�tica para float
		
	//modulo
		int resto = 7%2;				//resto = 1
		
	//adi��o e subtra��o
		long l = 1000+4000;
		double d = 1.0-0.01;
		
	//concatena��o
		long var = 12345;
		String str = "O valor de var � " + var;
		
	//na concatena��o de strings, as vari�veis ou literais s�o promovidos a string antes:
		String st = "O valor de var � "+Long.toString(var);
	}

}
