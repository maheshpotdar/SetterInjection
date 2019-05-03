package com.mahesh.Model;

public class Employee {

	private String fname, mname, lname;

	public String getFname() {
		return fname;
	}

	public String getMname() {
		return mname;
	}

	public String getLname() {
		return lname;
	}

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String fname, String mname, String lname) {
		super();
		this.fname = fname;
		this.mname = mname;
		this.lname = lname;
	}

	@Override
	public String toString() {
		return "Employee [fname=" + fname + ", mname=" + mname + ", lname=" + lname + "]";
	}

	public void displayStudentInfo() {
		System.out.println("Welcome," + fname + " " + mname + " " + lname);
	}

}
