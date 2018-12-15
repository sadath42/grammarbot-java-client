package com.grammarbot.client.model;

public class DetectedLanguage {
	private String name;
	private String code;

	// Getter Methods

	public String getName() {
		return name;
	}

	public String getCode() {
		return code;
	}

	// Setter Methods

	public void setName(String name) {
		this.name = name;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Override
	public String toString() {
		return "DetectedLanguage [name=" + name + ", code=" + code + "]";
	}
	
	
}