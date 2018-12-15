package com.grammarbot.client.test;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.client.ClientBuilder;

import org.junit.Test;

import com.grammarbot.client.GrammarBotBuilder;
import com.grammarbot.client.GrammarBotClient;
import com.grammarbot.client.model.Context;
import com.grammarbot.client.model.GrammarBotResponse;
import com.grammarbot.client.model.Language;
import com.grammarbot.client.model.Matches;
import com.grammarbot.client.model.Replacement;
import com.grammarbot.client.model.Rule;
import com.grammarbot.client.model.Software;

public class GrammarClientTest {
	@Test
	public void testGrammarBot() {

		// Usage , Default Client
		// Here the client have default values for the
		// Language = en-US, Api-Key = java-default , Base-url=
		// http://api.grammarbot.io:80
		GrammarBotClient botClient = new GrammarBotBuilder().setLanguage("en-us")
				.setBaseURI("http://api.grammarbot.io:80").setApiKey("ur api key").build();

		GrammarBotResponse response = botClient.check("Did i do a any mistake");
		System.out.println(response);

		// Processing the out put
		// The Software object gives the information regarding the software
		Software software = response.getSoftware();
		software.getApiVersion();
		software.getPremium();
		software.getPremium();

		// The Software object gives the information regarding the language
		Language language = response.getLanguage();
		language.getCode();
		language.getDetectedLanguage();

		List<Matches> matches = response.getMatches();
		for (Matches matchedObj : matches) {
			System.out.println(matchedObj);
			Context context = matchedObj.getContext();
			System.out.println(context.getLength());
			System.out.println(context.getText());
			System.out.println(matchedObj.getMessage());

			// Replacement options .
			ArrayList<Replacement> replacements = matchedObj.getReplacements();
			for (Replacement replacement : replacements) {
				System.out.println(replacement.getValue());
			}

			Rule rule = matchedObj.getRule();

			System.out.println(rule.getDescription());
			System.out.println(rule.getCategory());
			System.out.println(rule.getIssueType());

		}

	}
}
