package com.constructor;

public class Laptop {
private String name;
private double prize;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getPrize() {
	return prize;
}
public void setPrize(double prize) {
	this.prize = prize;
}
public Laptop(String name, double prize) {
	super();
	this.name = name;
	this.prize = prize;
}
public Laptop() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Laptop [name=" + name + ", prize=" + prize + "]";
}


}
