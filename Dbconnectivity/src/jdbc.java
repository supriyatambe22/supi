yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyimport java.sql.*;

public class jdbc {

	public static void main(String[] args) throws SQLException
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql:///demo","root","12345");
			Statement stmt=con.createStatement();
			String query="create table list(id int,name varchar(20))";
			stmt.executeUpdate(query);
			
		}
		catch(Exception e)
		{
			System.out.println("exception has occured "+e);
	}


	}

}
