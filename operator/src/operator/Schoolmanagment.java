package operator;

public class Schoolmanagment {

	private String Department;
	private String Name;
	private String Address;
	private String Mob_no;
    private  String Emailid;
    
	public Schoolmanagment(String Department, String Name, String Address,
	String Mob_no,String Emailid)
	{
	
	this.Name=Name;
	this.Mob_no=Mob_no;
	this.Address=Address;
	this.Emailid=Emailid;
	}

	public String getDepartment() {
	return Department;
	}
	public void setDepartment(String Department) {
	Department=Department;
	}
	public String getName() {
	return Name;
	}
	public void setName(String name) {
	Name = name;
	}
	public String getAddress() {
	return Address                 mmmmmmmmmm;
	}
	public void setDepartment(String department) {
	Department = department;
	}
	public String getSalary() {
	return Salary;
	}
	public void setSalary(String salary) {
	Salary = salary;
	}

	public String toString() 
	{ 
	return this.Id+"\t"+this.Name+"\t\t"+this.Department+"\t\t\t"+this.Salary;
	}
	}


	public class Assignment4 
	{
	public static void main(String[] args)
	{

	try {

	Map< String, List<Employee> > m=new HashMap< String, List<Employee> >();
	List<Employee> ListForFinance=new ArrayList<Employee>();
	Scanner scn1=new Scanner(System.in);
	String Id;
	String Name;
	String Department;
	String Salary;

	while(true)
	{
	System.out.print("\nThe Choices:\n1>add\n2>modification\n3>remove\n4>display\n\n");
	System.out.println("Enter the choice: ");
	System.out.println("To quit type -1");
	int num=scn1.nextInt();
	if(num == -1)
	{
	break;
	}

	switch(num)
	{
	case 1:
	{
	System.out.print("\nDepartment: ");
	Department=scn1.next();
	System.out.print("\nId: ";
	Id=scn1.next();
	System.out.print("\nName: ");
	Name=scn1.next();
	System.out.print("\nSalary: ");
	Salary=scn1.next();

	Employee employee1=new Employee(Id,Name,Department,Salary);
	ListForFinance.add(employee1);
	m.put(Department, ListForFinance);
	break;
	}

	case 2:
	{
	System.out.println("Type Department to be modified");
	Department=scn1.next();
	System.out.println("Modification values");
	System.out.print("\nId: ");
	Id=scn1.next();
	System.out.print("\nName: ");
	Name=scn1.next();
	System.out.print("\nSalary: ";
	Salary=scn1.next();

	Set<String> s=m.keySet();
	Iterator<String> i=s.iterator();

	Employee employee1=new Employee(Id,Name,Department,Salary);
	m.get(Department.setId("Id");
	ListForFinance.add(employee1);
	m.put(Department, ListForFinance);

	while(i.hasNext())
	{
	System.out.println(i.next());
	}

	break;
	}



	case 3:
	{
	System.out.println("=========================================================");
	System.out.println("ID"+"\t"+"NAME"+"\t\t"+"DEPARTMENT"+"\t\t"+"SALARY");
	System.out.println("=========================================================");
	Set<String> s=m.keySet();
	Iterator<String> i=s.iterator();

	while(i.hasNext()) 
	{
	     String dept=i.next();
	     List<Employee> employees=m.get(dept);
	     for(int j=0;j<employees.size();j++)
	     {
	         System.out.print("\n"+employees.get(j)+"\n\n"); 
	     }  
	}
	break;
	}

	}
	}
	}

	catch(Exception e)
	{
	System.out.println("NOTE: \n"+"Please enter specified key format..!!!");
	System.out.println("======================================");
	System.out.println("Now you are Signing out");
	System.out.println("Thank You,Login Again");
	System.out.println("======================================"); 
	}
	}
	}

	default:
	System.out.println("=============================================================";
	System.out.print("Wrong key Pressed,please enter the correct key\n";
	System.out.println("Try again...!!!";
	System.out.println("=============================================================";
	}
	}
	} 




}
