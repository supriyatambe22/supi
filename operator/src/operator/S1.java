package operator;
import java.util.*;
public class S1 {


	public static String retString()
	{
		return "parent";
	}

}
  class S12 extends S1
{
	  public static void main(String args[])
	  {
		  S12 s=new S12();
	  }
	  
		
	  public static String retString()
		{
			return "child";
		}

}
