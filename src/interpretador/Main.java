package interpretador;

import expressionsNoTerminal.XorLogic;

public class Main {

	public static void main(String[] args) {
		ExpressionTerminal sim = new ExpressionTerminal("sim");
		ExpressionTerminal nao = new ExpressionTerminal("nao");
		
		XorLogic xorlogic = new XorLogic(sim, sim);
		System.out.println(xorlogic.interpretar("nao"));
	}
}