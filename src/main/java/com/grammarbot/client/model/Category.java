package com.grammarbot.client.model;

public class Category {
	private String id;
	private String name;

	// Getter Methods

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	// Setter Methods

	public void setId(String id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + "]";
	}
	
	
}
