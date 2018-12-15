package com.grammarbot.client;

/**
 * Builder class to create Grammarbot client.
 *
 */
public class GrammarBotBuilder {

	private String language = "en-US";
	private String apiKey = "java-default";
	private String baseURI = "http://api.grammarbot.io:80";

	public String getLanguage() {
		return language;
	}

	public GrammarBotBuilder setLanguage(String language) {
		this.language = language;
		return this;
	}

	public String getApiKey() {
		return apiKey;
	}

	public GrammarBotBuilder setApiKey(String apiKey) {
		this.apiKey = apiKey;
		return this;
	}

	public String getBaseURI() {
		return baseURI;
	}

	public GrammarBotBuilder setBaseURI(String baseURI) {
		this.baseURI = baseURI;
		return this;
	}

	/**
	 * Method to build the grammarbot client.
	 * 
	 * @return GrammarBotClient.
	 */
	public GrammarBotClient build() {
		return new GrammarBotClient(this);
	}

}
