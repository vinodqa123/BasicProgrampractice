package com.qa.test;

import java.util.Scanner;

public class Patten {
	
	public static void pattern1() {
		for(int i=5;i>=1;i--) {
			
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void pyramid() {
		
		for(int i=0;i<5;i++) {
		
			for(int j=0;j<=i;j++) {
				 System.out.print("*");
				}
			System.out.println();
			}
	}
	public static void pattern2() {
	 	for(int i=0; i<5; i++) { //outer loop for number of rows(n) { for(j=2*(n-i); j>=0; j--) // inner loop for spaces          
	 		System.out.print(" "); // printing space
	 	 
	 		for(int j=0; j<=i; j++) {//  inner loop for columns
	 		  
	 			System.out.print("* "); // print star
     	}           
	 		System.out.println(); // ending line after each row
	 	} 
	}
	public static void pattern3() {
		int n, i, j, space = 1;
		System.out.print("Enter the number of rows: ");
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		space = n - 1;
		for (j = 1; j<= n; j++){
			for (i = 1; i<= space; i++){
				System.out.print(" ");
			}
			space--;
			for (i = 1; i <= 2 * j - 1; i++){
				System.out.print("*");
			}
				System.out.println("");
			}
		
	}
	public static void pattern4() {
		int n, i, j, space = 1;
		System.out.print("Enter the number of rows: ");
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		space = n - 1;
		for (j = 1; j<= n; j++){
			for (i = 1; i<= space; i++){
				System.out.print(" ");
			}
			space--;
			for (i = 1; i <= j; i++){
				System.out.print("*");
			}
				System.out.println("");
			}
		
	}
	public static void reversepyramid() {
		int n,i,j,space=1;
		System.out.print("Enter the number of rows: ");
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		space = n - 1;
		for(j=1;j<=n;j++) {
			for(i=1;i<j;i++) {
				System.out.print(" ");
			}
	
			for(i=1;i<=n-1-j;i++) {
				System.out.print("*"+" ");
			}
			System.out.println("");
		}
		
	}
	public static void number() {
		
		for(int i=1;i<=5;i++) {
			
			for(int j=1;j<=i;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
			
		}
	}
public static void number2() {
		
		for(int i=1;i<=5;i++) {
			int k=1;
			for(int j=1;j<=i;j++) {
				System.out.print(k+" ");
				k++;
			}
			System.out.println();
			
		}
	}
public static void number3() {
	
	for(int i=1;i<=5;i++) {
		int k=1;
		for(int j=1;j<i+1;j++) {
			System.out.print(k++ +" ");
			
		}
		System.out.println();
		
	}
}

public static void main(String at[]){
	
		pattern1();
		System.out.println("=====================");
		pyramid();
		System.out.println("=====================");
		pattern2();
		System.out.println("=====================");
		pattern3();
		System.out.println("=====================");
		pattern4();
		System.out.println("=====================");
		reversepyramid();
		System.out.println("=====================");
		number();
		System.out.println("=====================");
		number2();
		System.out.println("=====================");
		number3();
	
	}
}
