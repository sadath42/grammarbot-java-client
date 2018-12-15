package com.grammarbot.client;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import org.glassfish.jersey.client.ClientConfig;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.jaxrs.json.JacksonJaxbJsonProvider;
import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
import com.grammarbot.client.exception.GrammarBotException;
import com.grammarbot.client.model.GrammarBotResponse;

/**
 * Class to create the GrammarBotClient and check the text for grammer mistakes.
 *
 */
public class GrammarBotClient {

	private final JacksonJsonProvider jacksonJsonProvider;
	private final Client client;
	private final String language;
	private final String api_Key;
	private final String BASE_URI;
	private final String version = "/v2";

	/**
	 * Constructor to initialize the grammarbot client.
	 * 
	 * @param botBuilder
	 */
	GrammarBotClient(GrammarBotBuilder botBuilder) {
		super();
		jacksonJsonProvider = new JacksonJaxbJsonProvider().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,
				false);
		this.client = ClientBuilder.newClient(new ClientConfig(jacksonJsonProvider));
		BASE_URI = botBuilder.getBaseURI();
		this.language = botBuilder.getLanguage();
		this.api_Key = botBuilder.getApiKey();
	}

	/**
	 * Method to check the text for grammar and returns the response.
	 * 
	 * @param text
	 *            Text to be checked .
	 * @return grammarBotResponse
	 * @exception GrammarBotException
	 */
	public GrammarBotResponse check(String text) {
		return check(text, language);
	}

	/**
	 * Method to check the text for grammar for the specified language and
	 * returns the response.
	 * 
	 * @param text
	 *            Text to be checked .
	 * @return grammarBotResponse
	 * @exception GrammarBotException
	 */
	public GrammarBotResponse check(String text, String lang) {
		if (lang == null || lang.isEmpty()) {
			throw new GrammarBotException("Language Cannot be null or Empty");
		}
		String url = BASE_URI + version + "/check";
		WebTarget target = client.target(url);
		target = target.queryParam("api_key", api_Key).queryParam("text", text).queryParam("language", lang);
		Builder request = target.request(MediaType.APPLICATION_JSON);
		GrammarBotResponse grammarBotResponse = null;
		try {
			grammarBotResponse = request.get(GrammarBotResponse.class);
		} catch (WebApplicationException e) {
			throw new GrammarBotException(e.getResponse().readEntity(String.class), e);
		}
		return grammarBotResponse;
	}

}
