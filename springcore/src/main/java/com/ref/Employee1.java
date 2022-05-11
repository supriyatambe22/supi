package com.ref;

public class Employee1 {                                                          
	private int Empid;
	private String Name;
	Address address;
	public Employee1(Address address) {
		super();
		this.address = address;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public int getEmpid() {
		return Empid;
	}
	public void setEmpid(int empid) {
		Empid = empid;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Employee1(int empid, String name) {
		super();
		Empid = empid;
		Name = name;
	}
	public Employee1() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "employee1 [Empid=" + Empid + ", Name=" + Name + ", address=" + address + "]";
	}
	

}
