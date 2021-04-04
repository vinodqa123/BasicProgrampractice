package com.qa.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.testng.annotations.Test;

public class DatabaseConnectivty {
	String userlogin="qavinodjadhav1";
	String s1="To confirm your appointment on 01/06/2021 and to make your co-payment of 2.00, please click on the link below. We may charge other amounts owed by you to this payment card with a SMS receipt (not covered by your insurance, insufficient initial co-payment, unmet deductible, etc.). https://demo.liquid-payments.com/collectcard/?reference=42835;";
	
	@Test()
	public void DB(){  
		try{  
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection(  
		"jdbc:mysql://10.0.10.63:3306/liquidpaymentsuat","vinodqa","K$51oxpt28CV1");  
		//here sonoo is database name, root is username and password  
		Statement stmt=con.createStatement();  
	//	ResultSet rs=stmt.executeQuery("select * from patientvisitinformation where  merchantid=465 and accountnumber=12 and userid=(select UserId from AccelaUsers where UserLoginId="+userlogin+");");  
		ResultSet rs=stmt.executeQuery("select * from patientvisitinformation where  merchantid=465 and accountnumber=12 and userid=(select UserId from AccelaUsers where UserLoginId=\""+userlogin+"\");");
		
		while(rs.next())  
		System.out.println(rs.getInt(1));  
		con.close();  
		}catch(Exception e){ System.out.println(e);}  
		}  
	
	@Test()
	public void test2() {
		String str="To confirm your appointment on 01/06/2021 and to make your co-payment of 2.00, please click on the link below. We may charge other amounts owed by you to this payment card with a SMS receipt (not covered by your insurance, insufficient initial co-payment, unmet deductible, etc.). https://demo.liquid-payments.com/collectcard/?reference=42835;";
		String separator =":";
		int sepPos = str.indexOf(separator);
		System.out.println("Substring after separator = "+str.substring(sepPos + separator.length()));
		
	}
	
	
	
}
