package com.example;

public class B {

	private int b;
	private String msg;

	public B(int b, String msg) {
		this.b = b;
		this.msg = msg;
		System.out.println("B is Constructor");
	}

	public void Show() {
		System.out.println("Show in B");
		System.out.println(b);
		System.out.println(msg);
	}
}
