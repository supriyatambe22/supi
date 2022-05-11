package com.Exampl;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class Emp1 {

@Id

int Salary;
@Column
String Name;
@Column 
String Email;
public int getSalary() {
	return Salary;
}
public void setSalary(int Salary) {
	this.Salary = Salary;
}
public String getName() {
	return Name;
}
public void setName(String Name) {
	this.Name = Name;
}
public String getEmail() {
	return Email;
}
public void setEmail(String Email) {
	Email = Email;
}
public Emp1(int Salary, String Name, String Email) {
	super();
	this.Salary = Salary;
	this.Name = Name;
	this.Email = Email;
}
public Emp1() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Emp1 [salary=" + Salary + ", Name=" + Name + ", Email=" + Email + "]";
}


	}


