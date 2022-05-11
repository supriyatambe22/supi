//define myexception cls create src cls and implement the below given method checkname(string fname,string lname)throw a user defined exception if firstname&lastname is blank else return name

package operator;
class Myexception11 extends Exception
{
	public Myexception11(String msg)
	{
		super(msg);
	}
}
public class Source {
	static String Checkname(String firstname,String lastname)throws Myexception11
	{
		//check is fname is empty or not
		//1. if it is throw exception
		//2 if it is not empty then lname is empty or not
		
		if(firstname.equals("") && lastname.equals(""))
		{
			Myexception11 obj=new Myexception11("is not blank");
			throw obj;
		}
		else
		{
	       return firstname+lastname;
	     
	}
	}
	public static void main(String[] args) 
	{
		Source obj=new Source(); 

		

		try
		{
			
	System.out.println(obj.Checkname("",""));
		

		}
		
		catch(Myexception11 e)
		{
			e.printStackTrace();
		}
	}

}
