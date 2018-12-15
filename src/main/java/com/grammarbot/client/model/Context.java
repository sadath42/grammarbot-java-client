package com.grammarbot.client.model;

public class Context {
	private String text;
	private float offset;
	private float length;

	// Getter Methods

	public String getText() {
		return text;
	}

	public float getOffset() {
		return offset;
	}

	public float getLength() {
		return length;
	}

	// Setter Methods

	public void setText(String text) {
		this.text = text;
	}

	public void setOffset(float offset) {
		this.offset = offset;
	}

	public void setLength(float length) {
		this.length = length;

	}

	@Override
	public String toString() {
		return "Context [text=" + text + ", offset=" + offset + ", length=" + length + "]";
	}

}
