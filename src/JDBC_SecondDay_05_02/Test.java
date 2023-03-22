package JDBC_SecondDay_05_02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ashwinee","root","root");
		
		Student stu=new Student();
		stu.setRollno(102);
		stu.setName("Kashish");
		int r=stu.getRollno();
		String nm=stu.getName();
		String sql="insert into Student values("+r+",'"+nm+"')";
		Statement smt=con.createStatement();
		smt.execute(sql);
		con.close();
		smt.close();
		
	}
}
