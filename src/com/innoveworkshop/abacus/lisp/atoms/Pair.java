package com.innoveworkshop.abacus.lisp.atoms;

/**
 * A pair of {@link Atom}s.
 *
 * @author Nathan Campos {@literal <nathan@innoveworkshop.com>}
 */
public class Pair extends Atom {
	protected Atom _car;
	protected Atom _cdr;

	/**
	 * Creates an {@link Atom} pair.
	 *
	 * @param car Left part of the pair.
	 * @param cdr Right part of the pair.
	 */
	public Pair(Atom car, Atom cdr) {
		this._car = car;
		this._cdr = cdr;
	}

	/**
	 * Gets the {@link Atom} in the left part of the pair.
	 *
	 * @return Left part of the pair.
	 */
	public Atom car() {
		return _car;
	}

	/**
	 * Gets the {@link Atom} in the right part of the pair.
	 *
	 * @return Right part of the pair.
	 */
	public Atom cdr() {
		return _cdr;
	}

	/**
	 * Always returns itself.
	 *
	 * @return Itself.
	 */
	public Object getValue() {
		return this;
	}

	public String toString() {
		StringBuilder buf = new StringBuilder("(" + car().toString());
		Atom atom = cdr();

		// Build up the list representation.
		while (!atom.isNil()) {
			if (atom instanceof Pair) {
				Pair pair = (Pair)atom;
				buf.append(" ").append(pair.car().toString());
				atom = pair.cdr();
			} else {
				buf.append(" . ").append(atom);
				atom = Nil.getInstance();
			}
		}

		return buf.append(")").toString();
	}
}
