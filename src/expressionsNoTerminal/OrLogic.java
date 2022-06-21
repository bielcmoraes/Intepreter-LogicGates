package expressionsNoTerminal;

import interpretador.ExpressionTerminal;
import interpretador.Interpreter;

public class OrLogic implements Interpreter{
	
	ExpressionTerminal expression1;
	ExpressionTerminal expression2;
	
	public OrLogic(ExpressionTerminal expression1, ExpressionTerminal expression2) {
		this.expression1 = expression1;
		this.expression2 = expression2;
	}
	
	
	@Override
	public boolean interpretar(String texto) {
		return(expression1.interpretar(texto) || expression2.interpretar(texto));
	}
	
}
