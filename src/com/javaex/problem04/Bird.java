package com.javaex.problem04;

public abstract class Bird {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void sing() {
		System.out.println("새가 웁니다");
	}

	public void fly() {
		System.out.println("새가 날아다닙니다");
	}

	public void showName() {
		System.out.println("새 두마리");
	}
}
