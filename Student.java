package org.student;

import org.department.Department;

public class Student extends Department{
	public void studentName() {
	System.out.println("Student Name:Anu");	
	}
public void studentDept() {
	System.out.println("Department: IT");	
	}
public void studentId() {
	System.out.println("Student ID : 12345");	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student obj=new Student();
		obj.collegeName();
		obj.collegeCode();
		obj.collegeRank();
		obj.deptName();
		obj.studentName();
		obj.studentDept();
		obj.studentId();
		
	}

}
