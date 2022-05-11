package com.collection;
import java.util.*;
public class Employee {
 private int employeeId;
 private List<String>job;
 private Set<String>EmailId;
 private Map<String,String> phoneno;
public int getEmployeeId() {
	return employeeId;
}
public void setEmployeeId(int employeeId) {
	this.employeeId = employeeId;
}
public List<String> getJob() {
	return job;
}
public void setJob(List<String> job) {
	this.job = job;
}
public Set<String> getEmailId() {
	return EmailId;
}
public void setEmailId(Set<String> emailId) {
	EmailId = emailId;
}
public Map<String, String> getPhoneno() {
	return phoneno;
}
public void setPhoneno(Map<String, String> phoneno) {
	this.phoneno = phoneno;
}
public Employee(int employeeId, List<String> job, Set<String> emailId, Map<String, String> phoneno) {
	super();
	this.employeeId = employeeId;
	this.job = job;
	EmailId = emailId;
	this.phoneno = phoneno;
}
@Override
public String toString() {
	return "Employee [employeeId=" + employeeId + ", job=" + job + ", EmailId=" + EmailId + ", phoneno=" + phoneno
			+ "]";
}
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
 
 
 
 
}
