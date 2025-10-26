package com.innoveworkshop.abacus.lisp.atoms;

/**
 * An {@link Atom} that stores a numeric value.
 *
 * @author Nathan Campos {@literal <nathan@innoveworkshop.com>}
 */
public class Number extends Atom {
	protected double number;

	/**
	 * Creates a brand new {@link Number} {@link Atom}.
	 *
	 * @param number Number to be stored.
	 */
	public Number(double number) {
		this.number = number;
	}

	/**
	 * Creates a brand new {@link Number} {@link Atom} from an {@code int}.
	 *
	 * @param number Integer to be stored.
	 */
	public Number(int number) {
		this.number = number;
	}

	/**
	 * Since we can't safely convert a {@code double} to {@code Object}, this
	 * always returns itself.
	 *
	 * @return Itself.
	 */
	public Object getValue() {
		return this;
	}
}
