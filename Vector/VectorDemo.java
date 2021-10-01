package com.vectorDemo.Vector;

public class VectorDemo {
	private int EmplyId;
	private String EmplyName;
	
	public VectorDemo(int emplyId, String emplyName) {
		super();
		EmplyId = emplyId;
		EmplyName = emplyName;
	}
	public int getEmplyId() {
		return EmplyId;
	}
	public void setEmplyId(int emplyId) {
		EmplyId = emplyId;
	}
	public String getEmplyName() {
		return EmplyName;
	}
	public void setEmplyName(String emplyName) {
		EmplyName = emplyName;
	}
	@Override
	public String toString() {
		System.out.println("Employee ID : "+" "+EmplyId+" "+"Employee Name : "+" "+EmplyName);
		return super.toString();
	}
	
	
}
