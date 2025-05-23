package com.in28minutes.microservices.limit_service.bean;

public class Limit {

	private int minimum;
	private int maximum;

	public Limit() {
		super();
	}

	public Limit(int minimum, int maximum) {
		super();
		this.minimum = minimum;
		this.maximum = maximum;
	}

	public int getMinimum() {
		return minimum;
	}

	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}

	public int getMaximum() {
		return maximum;
	}

	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}

	@Override
	public String toString() {
		return "Limit [minimum=" + minimum + ", maximum=" + maximum + "]";
	}

}
