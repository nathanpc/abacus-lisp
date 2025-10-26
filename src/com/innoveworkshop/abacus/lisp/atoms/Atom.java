package com.innoveworkshop.abacus.lisp.atoms;

/**
 * The basis of all internal types in a Lisp dialect.
 *
 * @author Nathan Campos {@literal <nathan@innoveworkshop.com>}
 */
public abstract class Atom {
	/**
	 * Gets the value associated with this atom.
	 *
	 * @return Atom's value.
	 */
	public abstract Object getValue();

	/**
	 * Checks if an {@link Atom} is actually {@link Nil}.
	 *
	 * @param atom {@link Atom} to be tested.
	 *
	 * @return {@code true} if the {@link Atom} is {@link Nil}, {@code false}
	 *         otherwise.
	 */
	public static boolean isNil(Atom atom) {
		return atom instanceof Nil;
	}

	/**
	 * Checks if an {@link Atom} is actually {@link Nil}.
	 *
	 * @return {@code true} if the {@link Atom} is {@link Nil}, {@code false}
	 *         otherwise.
	 */
	public boolean isNil() {
		return this instanceof Nil;
	}
}
