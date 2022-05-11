package map.manytomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Manytomanymain {

	public static void main(String[] args) {

		System.out.println( "Hello World!" );
        Configuration config=new Configuration();
        config.configure("hibernate.cfg.xml");
        SessionFactory sf=config.buildSessionFactory();
        Session session=sf.openSession();
        Transaction tf=session.beginTransaction();
        
        Employee emp=new Employee();
        emp.setEmid(10);
        emp.setEmpName("supriya");
        
        Employee emp1=new Employee();
        emp1.setEmid(101);
        emp1.setEmpName("priya");
        
        
        List<Employee> emplist=new ArrayList<Employee>();
        
        emplist.add(emp);
        emplist.add(emp1);
        
        
        
        Project project=new Project();
        project.setProjectId(11);
        project.setProjectName("java");
        project.setEmployee(emplist);
        
        
        
        
        Project project1=new Project();
        project1.setProjectId(111);
        project1.setProjectName("Angular");
        project1.setEmployee(emplist);
        
        
        
        
        List<Project>projectlist=new ArrayList<Project>();
        projectlist.add(project);
        projectlist.add(project1);
        
        
        
        emp.setProject(projectlist);
        emp1.setProject(projectlist);
        
        
        session.saveOrUpdate(emp);
        session.saveOrUpdate(emp1);
        
        
        tf.commit();
	}

}
