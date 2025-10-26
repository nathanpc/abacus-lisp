package com.innoveworkshop.abacus.lisp;

import com.innoveworkshop.abacus.lisp.atoms.Symbol;

import java.util.ArrayList;

/**
 * Lisp interpreter environment manager.
 *
 * @author Nathan Campos {@literal <nathan@innoveworkshop.com>}
 */
public class Environment {
	private static Environment instance;
	private final ArrayList<Symbol> symbols;

	private Environment() {
		symbols = new ArrayList<Symbol>();
	}

	/**
	 * Gets the single instance of the environment manager.
	 *
	 * @return The one and only instance of the environment.
	 */
	public static Environment getInstance() {
		if (instance == null)
			instance = new Environment();
		return instance;
	}

	/**
	 * Adds a {@link Symbol} to the global symbols list.
	 *
	 * @param symbol Symbol to be added to the environment.
	 *
	 * @return The {@link Symbol} that was added to the environment.
	 */
	public Symbol addSymbol(Symbol symbol) {
		symbols.add(symbol);
		return symbol;
	}

	/**
	 * Gets a {@link Symbol} from our global symbols list.
	 *
	 * @param symbol A symbol's name to search for.
	 *
	 * @return The {@link Symbol} atom if a match was found. {@code null} if it
	 *         doesn't exist.
	 */
	public Symbol getSymbol(String symbol) {
		for (Symbol sym : symbols) {
			if (sym.equals(symbol))
				return sym;
		}

		return null;
	}
}
