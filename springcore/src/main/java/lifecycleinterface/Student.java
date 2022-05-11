package lifecycleinterface;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Student implements InitializingBean,DisposableBean
{
	
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
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		
	}
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		
	}
	
//private void start()
//{
//	System.out.println("this is init method");
//}
//private void end()
//{
//	System.out.println("this is destroy method");
//}
}
