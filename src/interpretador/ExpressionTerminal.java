package interpretador;

public class ExpressionTerminal implements Interpreter{
	
	String palavra;
	
	public ExpressionTerminal(String palavra) {
		this.palavra = palavra;
	}
	@Override
	public boolean interpretar(String texto) {
		if(texto.equals(palavra)) {
			return true;
		}else {
			return false;
		}
	}

}
