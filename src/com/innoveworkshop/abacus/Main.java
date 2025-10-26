package com.innoveworkshop.abacus;

import com.innoveworkshop.abacus.lisp.atoms.Nil;
import com.innoveworkshop.abacus.lisp.atoms.Number;
import com.innoveworkshop.abacus.lisp.atoms.Pair;
import com.innoveworkshop.abacus.lisp.atoms.Symbol;

/**
 * The application's main runnable class.
 *
 * @author Nathan Campos {@literal <nathan@innoveworkshop.com>}
 */
public class Main {
	/**
	 * Application's main entry point.
	 *
	 * @param args Command line arguments.
	 */
	public static void main(String[] args) {
		System.out.println("Welcome to Abacus Lisp v0.1a!");

		// Test out all possible atom types.
		System.out.println("Testing all possible atom types:");
		System.out.println(Nil.getInstance());
		System.out.println(new Number(123));
		System.out.println(new Number(1.234567890));
		System.out.println(new Number(1234567890));
		System.out.println(Symbol.getInstance("symbol"));
		System.out.println(Symbol.getInstance("another-symbol"));
		System.out.println(Symbol.getInstance("foobar"));
		System.out.println(new Pair(Symbol.getInstance("acar"), Symbol.getInstance("acdr")));
		System.out.println(new Pair(Symbol.getInstance("alist"), new Pair(new Number(1),
				new Pair(new Number(2), new Pair(new Number(3), Nil.getInstance())))));
		System.out.println(new Pair(Symbol.getInstance("improper-list"), new Pair(new Number(1),
				new Pair(new Number(2), new Pair(new Number(3), new Number(4))))));
	}
}
