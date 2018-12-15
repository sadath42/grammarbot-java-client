package com.grammarbot.client.model;

public class Software {
	private String name;
	private String version;
	private float apiVersion;
	private boolean premium;
	private String premiumHint;
	private String status;

	// Getter Methods

	public String getName() {
		return name;
	}

	public String getVersion() {
		return version;
	}

	public float getApiVersion() {
		return apiVersion;
	}

	public boolean getPremium() {
		return premium;
	}

	public String getPremiumHint() {
		return premiumHint;
	}

	public String getStatus() {
		return status;
	}

	// Setter Methods

	public void setName(String name) {
		this.name = name;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public void setApiVersion(float apiVersion) {
		this.apiVersion = apiVersion;
	}

	public void setPremium(boolean premium) {
		this.premium = premium;
	}

	public void setPremiumHint(String premiumHint) {
		this.premiumHint = premiumHint;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Software [name=" + name + ", version=" + version + ", apiVersion=" + apiVersion + ", premium=" + premium
				+ ", premiumHint=" + premiumHint + ", status=" + status + "]";
	}
	
	
}