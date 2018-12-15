package com.grammarbot.client.model;

import java.util.ArrayList;

public class Matches {
	private String message;
	private String shortMessage;
	private ArrayList<Replacement> replacements = new ArrayList<>();
	private float offset;
	private float length;
	private Context context;
	private String sentence;
	private Type type;
	private Rule rule;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getShortMessage() {
		return shortMessage;
	}

	public void setShortMessage(String shortMessage) {
		this.shortMessage = shortMessage;
	}

	public ArrayList<Replacement> getReplacements() {
		return replacements;
	}

	public void setReplacements(ArrayList<Replacement> replacements) {
		this.replacements = replacements;
	}

	public float getOffset() {
		return offset;
	}

	public void setOffset(float offset) {
		this.offset = offset;
	}

	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public Context getContext() {
		return context;
	}

	public void setContext(Context context) {
		this.context = context;
	}

	public String getSentence() {
		return sentence;
	}

	public void setSentence(String sentence) {
		this.sentence = sentence;
	}


	public Rule getRule() {
		return rule;
	}

	public void setRule(Rule rule) {
		this.rule = rule;
	}

	@Override
	public String toString() {
		return "Matches [message=" + message + ", shortMessage=" + shortMessage + ", replacements=" + replacements
				+ ", offset=" + offset + ", length=" + length + ", context=" + context + ", sentence=" + sentence
				+ ", typeObject=" + type + ", rule=" + rule + "]";
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

}
