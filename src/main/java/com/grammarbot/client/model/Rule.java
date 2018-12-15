package com.grammarbot.client.model;

public class Rule {
	private String id;
	private String description;
	private String issueType;
	private Category category;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getIssueType() {
		return issueType;
	}

	public void setIssueType(String issueType) {
		this.issueType = issueType;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Rule [id=" + id + ", description=" + description + ", issueType=" + issueType + ", category=" + category
				+ "]";
	}

}
