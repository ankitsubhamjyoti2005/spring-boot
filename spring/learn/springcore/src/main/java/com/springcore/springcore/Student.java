package com.springcore.springcore;

public class Student {
	private int studentid;
	private String studentAdderss;
	private String studentName;
	
	
	//gatter and set
	public int getStudentNum() {
		return studentid;
	}
	
	public void setStudentNum(int studentNum) {
		this.studentid = studentNum;
	}
	public String getStudentAdderss() {
		return studentAdderss;
	}
	public void setStudentAdderss(String studentAdderss) {
		this.studentAdderss = studentAdderss;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public Student(int studentid, String studentAdderss, String studentName) {
		super();
		this.studentid = studentid;
		this.studentAdderss = studentAdderss;
		this.studentName = studentName;
	}

	public Student() {
		super();
		
	}

	@Override
	public String toString() {
		return "Student [studentNum=" + studentid + ", studentAdderss=" + studentAdderss + ", studentName="
				+ studentName + "]";
	}
	
}
