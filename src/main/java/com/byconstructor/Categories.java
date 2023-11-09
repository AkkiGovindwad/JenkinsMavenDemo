package com.byconstructor;

public class Categories {

	private String name;
	private Policy policy;
	
	@Override
	public String toString() {
		return "Categories [name=" + name + ", policy=" + policy + "]";
	}

	public Categories(String name, Policy policy) {
		super();
		this.name = name;
		this.policy = policy;
	}
	
}
