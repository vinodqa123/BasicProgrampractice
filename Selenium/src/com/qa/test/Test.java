package com.qa.test;


public class Test {
		
	public static void main(String[] arrgs) {
		String str="Welcome";
		str=str+"world!";
		System.out.println(str);
		String test=str;
		System.out.println("Test "+test);
		StringBuilder sb=new StringBuilder("Hello"); 
		System.out.println(sb);
		
	//	sb.delete(1,3);  
		System.out.println(sb);//prints Hlo  	
		
		StringBuilder sb1=new StringBuilder("Vinod");  
	//	sb1.replace(1,3,"Java");  
		
		StringBuilder sb3=sb.append(sb1);
		System.out.println(sb3);//prints HJavalo  
	}

}
