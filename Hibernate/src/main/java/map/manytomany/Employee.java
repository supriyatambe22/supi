package map.manytomany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


@Entity
public class Employee {
	@Id
	private int emid;
	@Column
	private String empName;
	@ManyToMany (mappedBy="employee", cascade = CascadeType.ALL)
	
   List<Project>project;
	public int getEmid() {
		return emid;
	}
	public void setEmid(int emid) {
		this.emid = emid;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public List<Project> getProject() {
		return project;
	}
	public void setProject(List<Project> project) {
		this.project = project;
	}
	public Employee(int emid, String empName, List<Project> project) {
		super();
		this.emid = emid;
		this.empName = empName;
		this.project = project;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [emid=" + emid + ", empName=" + empName + ", project=" + project + "]";
	}
	
	
}
