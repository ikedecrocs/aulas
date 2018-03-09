package aulas;

public class operadoresaritmeticos {

	public static void main(String[] args) {
	//multiplição e divisão
		int um = 3/2;					//divisão de inteiros gera um inteiro
		float umemeio = (float) 3/2;	//ocorre promoção aritmética para float
		double xyz = umemeio*um;		//ocorre promoção aritmética para float
		
	//modulo
		int resto = 7%2;				//resto = 1
		
	//adição e subtração
		long l = 1000+4000;
		double d = 1.0-0.01;
		
	//concatenação
		long var = 12345;
		String str = "O valor de var é " + var;
		
	//na concatenação de strings, as variáveis ou literais são promovidos a string antes:
		String st = "O valor de var é "+Long.toString(var);
	}

}
