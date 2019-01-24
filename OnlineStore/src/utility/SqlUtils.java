package utility;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class SqlUtils {
	SqlUtils() throws ClassNotFoundException
	{
			Class.forName("com.mysql.jdbc.Driver"); 
	}
	void ReadDataFromSQL()
	{	
		try
		{
			java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sejal","root","sejal"); 
			PreparedStatement stmt= con.prepareStatement(Constant.ReadSQL);
			stmt.setString(1,"");
			stmt.executeQuery();
		}
		catch(Exception e)
		{
			System.out.print(e);
		}
	}
}
