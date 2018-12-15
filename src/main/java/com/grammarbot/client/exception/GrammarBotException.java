package com.grammarbot.client.exception;

/**
 * Base exception for grammarBot Client.
 *
 */
public class GrammarBotException extends RuntimeException {

	/**
	 * Default serialization id.
	 */
	private static final long serialVersionUID = 1L;

	public GrammarBotException(String message, Throwable cause) {
		super(message, cause);
	}

	public GrammarBotException(String message) {
		super(message);
	}

}
