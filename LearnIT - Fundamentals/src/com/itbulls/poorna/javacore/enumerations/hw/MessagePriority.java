package com.itbulls.poorna.javacore.enumerations.hw;

public enum MessagePriority {

	A("HIGH"), B("MEDIUM"), C("LOW"), D("LOW");
	
	private String priority;

	private MessagePriority(String priority) {
		this.priority=priority;
	}
	
	public String getPriority() {
		return this.priority;
	}
}
