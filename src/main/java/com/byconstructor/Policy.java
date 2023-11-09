package com.byconstructor;

public class Policy {

	private String planName;
	private int planAmount;
	public Policy(String planName, int planAmount) {
		super();
		this.planName = planName;
		this.planAmount = planAmount;
	}
	@Override
	public String toString() {
		return "Policy [planName=" + planName + ", planAmount=" + planAmount + "]";
	}
}
