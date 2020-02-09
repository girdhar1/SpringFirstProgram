package com.example;

public class Hello {

	private A aobj;
	private B bobj;

	Hello(B bobj) {
		System.out.println("Hello In Hello B");
		this.bobj = bobj;
	}

	public void setAobj(A aobj) {
		this.aobj = aobj;
	}

	public void Show() {
		System.out.println("Show in Hello");
		aobj.Show();
		bobj.Show();
	}

}
