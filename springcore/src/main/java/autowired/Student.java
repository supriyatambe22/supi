package autowired;

public class Student {
	private int Rollno;
	private String Name;
	private String address;
	public int getRollno() {
		return Rollno;
	}
	public void setRollno(int rollno) {
		Rollno = rollno;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Student(int rollno, String name, String address) {
		super();
		Rollno = rollno;
		Name = name;
		this.address = address;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [Rollno=" + Rollno + ", Name=" + Name + ", address=" + address + "]";
	}
	

}
