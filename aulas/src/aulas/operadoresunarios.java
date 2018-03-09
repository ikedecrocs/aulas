package aulas;

public class operadoresunarios {

	public static void main(String[] args) {
		//incremento e decremento
			int a = 0;
			int b = a++;	//incrementado depois de atribuir
			int c = ++a;	//incrementado antes de atribuir
			b = a--;		//decrementado depois de atribuir
			c = --a;		//decrementado antes de atribuir
			
		//mais e menos unário
			int x = +3;		//x recebe o positivo 3
			x = -x;			//x recebe -3, neste caso
			
		//inversão de bits
			int i = ~1;		// i = 2 (os bits foram invertidos)
			
		//complementar booleano
			boolean falsidade = ! (true);	//inverte o valor booleano
		
		//conversão de tipo
			double d = 1.99;
			int f = (int) d;	//converte de double p/ int (perda de precisão)
		
	}

}
