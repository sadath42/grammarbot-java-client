package com.grammarbot.client.model;

public class Warnings {
	private boolean incompleteResults;

	// Getter Methods

	public boolean getIncompleteResults() {
		return incompleteResults;
	}

	// Setter Methods

	public void setIncompleteResults(boolean incompleteResults) {
		this.incompleteResults = incompleteResults;
	}

	@Override
	public String toString() {
		return "Warnings [incompleteResults=" + incompleteResults + "]";
	}
	
	
}