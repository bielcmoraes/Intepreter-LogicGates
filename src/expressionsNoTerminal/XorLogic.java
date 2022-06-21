package expressionsNoTerminal;

import interpretador.ExpressionTerminal;
import interpretador.Interpreter;

public class XorLogic implements Interpreter{
	
	ExpressionTerminal expression1;
	ExpressionTerminal expression2;
	
	public XorLogic(ExpressionTerminal expression1, ExpressionTerminal expression2) {
		this.expression1 = expression1;
		this.expression2 = expression2;
	}
	
	
	@Override
	public boolean interpretar(String texto) {
		boolean result1 = (expression1.interpretar(texto) && (!(expression2.interpretar(texto))));
		boolean result2 = (!(expression1.interpretar(texto)) && (expression2.interpretar(texto)));
		boolean resultFinal = result1 || result2;
		return(resultFinal);
	}
}
