package com.wzq.dp.visit;

public interface Subject {
	public void accept(Visitor visitor);
	public String getSubject();
}
