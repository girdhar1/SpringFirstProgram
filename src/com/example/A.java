package com.example;

public class A {

	int a;
	String name;

	A() {
		System.out.println("A is Default constructor");
	}

	public void setA(int a) {
		this.a = a;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void Show() {
		System.out.println("Show in A");
		System.out.println(a);
		System.out.println(name);
	}
}