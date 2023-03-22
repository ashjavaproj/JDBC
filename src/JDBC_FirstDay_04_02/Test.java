package JDBC_FirstDay_04_02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) throws Exception {
Class.forName("com.mysql.jdbc.Driver");                 //step-1
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/aaa","root","root");//step-2
String sql="insert into Stud(rollno,name) values(102,'aakash')";//Step-3
Statement smt=con.createStatement();                //Step-4
smt.execute(sql);   //step-5
con.close();       //Step-6
smt.close();      //Step-6
	}

}
