package com.grammarbot.client.model;

public class Type {
	private String typeName;

	// Getter Methods

	public String getTypeName() {
		return typeName;
	}

	// Setter Methods

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	@Override
	public String toString() {
		return "Type [typeName=" + typeName + "]";
	}

}
