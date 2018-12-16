package com.grammarbot.client.test;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.client.ClientBuilder;

import org.junit.Assert;
import org.junit.Test;

import com.grammarbot.client.GrammarBotBuilder;
import com.grammarbot.client.GrammarBotClient;
import com.grammarbot.client.model.Context;
import com.grammarbot.client.model.DetectedLanguage;
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
		GrammarBotClient botClient = new GrammarBotBuilder().setLanguage("en-US")
				.setBaseURI("http://api.grammarbot.io:80").setApiKey("9JMF2Y56").build();

		GrammarBotResponse response = botClient.check("I can't remember how to go their");
		System.out.println(response);
		Assert.assertNotNull(response);

		// Processing the out put
		// The Software object gives the information regarding the software
		Software software = response.getSoftware();
		Assert.assertNotNull(software.getApiVersion());
		Assert.assertNotNull(software.getPremium());
		Assert.assertNotNull(software.getPremium());

		// The Software object gives the information regarding the language
		Language language = response.getLanguage();
		DetectedLanguage detectedLanguage = language.getDetectedLanguage();
		detectedLanguage.getCode();
		detectedLanguage.getName();

		List<Matches> matches = response.getMatches();
		for (Matches matchedObj : matches) {
			Context context = matchedObj.getContext();
			Assert.assertNotNull(context.getLength());
			Assert.assertNotNull(context.getText());
			Assert.assertNotNull(matchedObj.getMessage());

			// Replacement options .
			ArrayList<Replacement> replacements = matchedObj.getReplacements();
			for (Replacement replacement : replacements) {
				Assert.assertNotNull(replacement.getValue());
			}

			Rule rule = matchedObj.getRule();

			Assert.assertNotNull(rule.getDescription());
			Assert.assertNotNull(rule.getCategory());
			Assert.assertNotNull(rule.getIssueType());

		}

	}
}
