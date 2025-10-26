package com.innoveworkshop.abacus.lisp;

import java.util.ArrayList;
import java.util.List;

/**
 * A very simple Lisp language lexer and parser.
 *
 * @author Nathan Campos {@literal <nathan@innoveworkshop.com>}
 */
public class Parser {
	protected final ArrayList<String> tokens;

	public Parser() {
		tokens = new ArrayList<String>();
	}

	/**
	 * Breaks up the expression into a series of tokens.
	 *
	 * <br><br><b>Warning:</b> Do not mess with the contents returned by this function.
	 * Only use it for debugging purposes.
	 *
	 * @return List of tokens.
	 */
	public List<String> lex(String str) {
		StringBuilder token = new StringBuilder();
		boolean isString = false;

		// Go through string character by character.
		str = str.trim();
		for (int i = 0, n = str.length() ; i < n ; i++) {
			char c = str.charAt(i);

			// Handle the insides of a string.
			if (isString) {
				// String is closing.
				if (c == '"') {
					addToken(token);
					addToken('"');
					isString = false;
				} else {
					token.append(c);
				}

				continue;
			}

			// Handle delimiters.
			switch (c) {
				case '(':
				case ')':
				case '\'':
					// Proper language delimiters.
					addToken(token);

					// Add the token to the tokens list.
					addToken(c);
					continue;
				case ' ':
				case '\t':
				case '\r':
				case '\n':
					// Whitespace
					addToken(token);
					continue;
				case '"':
					// String delimiter.
					addToken(c);
					isString = true;
					continue;
			}

			// Add character to current token.
			token.append(c);
		}

		return tokens;
	}

	/**
	 * Adds a character to the tokens list.
	 *
	 * @param c Character to be added to the tokens list.
	 */
	private void addToken(char c) {
		tokens.add(String.valueOf(c));
	}

	/**
	 * Adds a token to the tokens list.
	 *
	 * @param builder Temporary storage of the token to be added. Will be
	 *                cleared.
	 *
	 * @return {@code true} if a token was added to the tokens list.
	 *         {@code false} if the builder was empty and nothing was added to
	 *         the list.
	 */
	private boolean addToken(StringBuilder builder) {
		if (builder.length() > 0) {
			tokens.add(builder.toString());
			builder.setLength(0);
			return true;
		}

		return false;
	}
}
