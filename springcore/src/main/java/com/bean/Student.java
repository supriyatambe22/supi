package com.bean;

public class Student {
	private int studentId;
	private String studentname;
	private int studentage;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public int getStudentage() {
		return studentage;
	}
	public void setStudentage(int studentage) {
		this.studentage = studentage;
	}
	public Student(int studentId, String studentname, int studentage) {
		super();
		this.studentId = studentId;
		this.studentname = studentname;
		this.studentage = studentage;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentname=" + studentname + ", studentage=" + studentage + "]";
	}


	}


