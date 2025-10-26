package com.innoveworkshop.abacus.lisp.atoms;

/**
 * {@link Atom}'s equivalent of a {@code null}.
 *
 * @author Nathan Campos {@literal <nathan@innoveworkshop.com>}
 */
public final class Nil extends Atom {
	private static Nil instance;

	private Nil() {
	}

	/**
	 * Gets the single instance of this class.
	 *
	 * @return The one and only instance of this class.
	 */
	public static Nil getInstance() {
		if (instance == null)
			instance = new Nil();

		return instance;
	}

	/**
	 * Always returns {@code null}.
	 *
	 * @return {@code null}
	 */
	public Object getValue() {
		return null;
	}
}
