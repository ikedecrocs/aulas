package aulas;

public class condicional {

	public static void main(String[] args) {
	//o codigo do operador tern�rio abaixo
		int x = 10;
		int y = (x>10) ? x : x+1;
		
	//� semelhante ao c�digo abaixo:
		int x = 10;
		int y;
		if(x>10) {
			y=x;
		} else {
			y = x + 1;
		}
	}

}
