package com.software_development_practice;

public class Student {
	private int student_id;
	private String student_name;
	private String student_sex;
	private int student_age;
	
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public String getStudent_sex() {
		return student_sex;
	}
	public void setStudent_sex(String student_sex) {
		this.student_sex = student_sex;
	}
	public int getStudent_age() {
		return student_age;
	}
	public void setStudent_age(int student_age) {
		this.student_age = student_age;
	}
	@Override
	public String toString() {
		return "Student [id=" + student_id + ", name=" + student_name + ", sex=" + student_sex 
				+ ", age=" + student_age + "]";
	}
}
