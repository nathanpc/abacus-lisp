package com.innoveworkshop.abacus.lisp.atoms;

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
	public Symbol(String symbol) {
		this.symbol = symbol;
	}

	/**
	 * Gets the symbol's string.
	 *
	 * @return Normalized string associated with the symbol.
	 */
	public Object getValue() {
		return symbol;
	}

	public String toString() {
		return symbol;
	}
}
