package com.emp;

import java.io.Serializable;

public class Employee implements Serializable{

	private static final long serialVersionUID = 1L;
	public int empId;
	public String empName;
	public String grade;
	
	
	
	public Employee(int empId, String empName, String grade) throws InvalidGradeException {
		
		this.empId = empId;
		this.empName = empName;
		this.setGrade(grade);
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) throws InvalidGradeException {
		if(grade.equals("U1") || grade.equals("U2")|| grade.equals("U3") ||grade.equals("U4") || grade.equals("P1") || grade.equals("P2")) {
			this.grade = grade;
		} else {
			throw new InvalidGradeException("Invalid grade entered");
		}
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", grade=" + grade + "]";
	}
	
	
	
}
