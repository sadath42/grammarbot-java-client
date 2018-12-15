package com.grammarbot.client.exception;

public class GrammarBotException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public GrammarBotException(String message, Throwable cause) {
		super(message, cause);
	}

	public GrammarBotException(String message) {
		super(message);
	}

}
