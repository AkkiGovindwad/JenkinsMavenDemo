package com.byname;

public class Categories {
	private String name;
	private Policy policy;
@Override
	public String toString() {
		return "Categories [name=" + name + ", policy=" + policy + "]";
	}
public String getName() {
		return name;
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
