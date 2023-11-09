package com.autodetect;

public class Categories {

	private String name;
	private Policy policy;

	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "Categories [name=" + name + ", policy=" + policy + "]";
	}
	public void setName(String name) {
		this.name = name;
	}
	public Policy getPolicy() {
		return policy;
	}
	public void setPolicy(Policy policy) {
		this.policy = policy;
	}
}
