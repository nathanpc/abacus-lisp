package com.innoveworkshop.abacus.lisp.atoms;

import com.innoveworkshop.abacus.lisp.Environment;

/**
 * An {@link Atom} that stores a string that can be used by the language.
 *
 * @author Nathan Campos {@literal <nathan@innoveworkshop.com>}
 */
public class Symbol extends Atom {
	protected String symbol;

	/**
	 * Creates a brand new {@link Symbol} object.
	 *
	 * @param symbol Symbol's name.
	 */
	private Symbol(String symbol) {
		this.symbol = symbol;
	}

	public static Symbol getInstance(String symbol) {
		Environment env = Environment.getInstance();

		// Try to get an existing symbol from the environment.
		Symbol atom = env.getSymbol(symbol);
		if (atom != null)
			return atom;

		// Create a new one and add it to the environment.
		return env.addSymbol(new Symbol(symbol));
	}

	/**
	 * Gets the symbol's string.
	 *
	 * @return Normalized string associated with the symbol.
	 */
	public Object getValue() {
		return symbol;
	}

	/**
	 * Checks if an {@link String} is equal to this {@link Symbol}.
	 *
	 * @param str String to be checked in a case-insensitive manner.
	 *
	 * @return {@code true} if they are equivalent, {@code false} otherwise.
	 */
	public boolean equals(String str) {
		return symbol.equalsIgnoreCase(str);
	}

	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		return symbol.equals(((Symbol)o).symbol);
	}

	public int hashCode() {
		return symbol.hashCode();
	}

	public String toString() {
		return symbol;
	}
}
