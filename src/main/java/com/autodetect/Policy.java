package com.autodetect;

public class Policy {
	private String planName;
	private String planAmount;
	
	public Policy(String planName, String planAmount) {
		super();
		this.planName = planName;
		this.planAmount = planAmount;
	}
	public String getPlanName() {
		return planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}
	public String getPlanAmount() {
		return planAmount;
	}
	@Override
	public String toString() {
		return "Policy [planName=" + planName + ", planAmount=" + planAmount + "]";
	}
	public void setPlanAmount(String planAmount) {
		this.planAmount = planAmount;
	}

}
