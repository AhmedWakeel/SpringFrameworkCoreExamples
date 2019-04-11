package com.applicationlistener;

public class Employee {

	private int empID;
	private String emp;
	
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		System.out.println("setting of emo=pid");
		this.empID = empID;
	}
	public String getEmp() {
		return emp;
	}
	public void setEmp(String emp) {
		System.out.println("setting of emp");
		this.emp = emp;
	}
}
