package interpretador;

public class AndLogic implements Interpreter{
	
	ExpressionTerminal expression1;
	ExpressionTerminal expression2;
	
	public AndLogic(ExpressionTerminal expression1, ExpressionTerminal expression2) {
		this.expression1 = expression1;
		this.expression2 = expression2;
	}
	
	
	@Override
	public boolean interpretar(String texto) {
		return(expression1.interpretar(texto) && expression2.interpretar(texto));
	}
}
