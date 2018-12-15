package com.grammarbot.client.model;

public class Language {
	private String name;
	private String code;
	private DetectedLanguage detectedLanguage;

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

	public DetectedLanguage getDetectedLanguage() {
		return detectedLanguage;
	}

	public void setDetectedLanguage(DetectedLanguage detectedLanguage) {
		this.detectedLanguage = detectedLanguage;
	}

	@Override
	public String toString() {
		return "Language [name=" + name + ", code=" + code + ", DetectedLanguageObject=" + detectedLanguage + "]";
	}

}
