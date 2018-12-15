package com.grammarbot.client.model;

import java.util.ArrayList;
import java.util.List;

public class GrammarBotResponse {
	private Software software;
	private Warnings warnings;
	private Language language;
	private List<Matches> matches = new ArrayList<>();

	public Software getSoftware() {
		return software;
	}

	public void setSoftware(Software software) {
		this.software = software;
	}

	public Warnings getWarnings() {
		return warnings;
	}

	public void setWarnings(Warnings warnings) {
		this.warnings = warnings;
	}

	public List<Matches> getMatches() {
		return matches;
	}

	public void setMatches(List<Matches> matches) {
		this.matches = matches;
	}

	public Language getLanguage() {
		return language;
	}

	public void setLanguage(Language language) {
		this.language = language;
	}

	@Override
	public String toString() {
		return "GrammarBotResponse [software=" + software + ", warnings=" + warnings + ", language=" + language
				+ ", matches=" + matches + "]";
	}

}
