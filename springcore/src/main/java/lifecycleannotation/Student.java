package lifecycleannotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Student {
	private int studId;
	private String Name;
	private String dept;
	public int getStudId() {
		return studId;
	}
	public void setStudId(int studId) {
		this.studId = studId;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public Student(int studId, String name, String dept) {
		super();
		this.studId = studId;
		Name = name;
		this.dept = dept;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [studId=" + studId + ", Name=" + Name + ", dept=" + dept + "]";
	}
@PostConstruct
private void start()
{
	System.out.println("this is init method");
}
@PreDestroy
private void end()
{
	System.out.println("this is destroy method");
}
}
