package com.mahesh.Model;

public class Employee {

	private String gender;
	private String schoolName;
	private float marks;
	private String address;
	private String mobile;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String gender, String schoolName, float marks, String address, String mobile) {
		super();
		this.gender = gender;
		this.schoolName = schoolName;
		this.marks = marks;
		this.address = address;
		this.mobile = mobile;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public float getMarks() {
		return marks;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "Employee [gender=" + gender + ", schoolName=" + schoolName + ", marks=" + marks + ", address=" + address
				+ ", mobile=" + mobile + "]";
	}

	public void WelcomeStudent(String Name) {
		System.out.println("Student Name: " + Name);
		System.out.println("Hello," + " " + gender + " " + Name);
		System.out.println("Your School: " + schoolName);
		System.out.println("Your Marks: " + marks);
		System.out.println("Your Personal Mobile: " + mobile);
	}

}
