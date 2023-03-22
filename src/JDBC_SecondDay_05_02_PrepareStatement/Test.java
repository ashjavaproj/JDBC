package JDBC_SecondDay_05_02_PrepareStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		
		Connection con=null;
		PreparedStatement ps=null;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ashwinee","root","root");
			
			String sql="insert into Student values(?,?)";
			ps=con.prepareStatement(sql);
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter No of student u want to add");
			int no=sc.nextInt();
			for(int i=1;i<=no;i++)
			{
				System.out.println("Enter Rollno = ");
				int rollno=sc.nextInt();
				System.out.println("Enter Name = ");
				String name=sc.next();
				ps.setInt(1, rollno);
				ps.setString(2, name);
				ps.execute();
			}
			System.out.println("Data Add");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		

	}

}
