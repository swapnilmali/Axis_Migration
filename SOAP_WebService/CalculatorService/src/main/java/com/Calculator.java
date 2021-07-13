package com;

public class Calculator {
	public int add(int a, int b) {
		int c=0;
		 try {c=a+b;}
		 
		 catch(NumberFormatException e) {
			 System.out.println("Not a number"+e);}
		 return c;
		 }
		
		 public int sub(int a, int b) {
			 int c=0;
			 try {c=a-b;}
			 
			 catch(NumberFormatException e) {
				 System.out.println("Not a number"+e);}
			 return c;
			 }
	
		 public int mul(int a, int b) {
			 int c=0;
			 try {c=a*b;}
			 
			 catch(NumberFormatException e) {
				 System.out.println("Not a number"+e);}
			 return c;
			 }
			
		 public int div(int a, int b) {
			 int c=0;
			 try {c=a/b;}
			 catch(ArithmeticException e) {
				 System.out.println("Can't divide by Zero"+e);}
			 catch(NumberFormatException e) {
				 System.out.println("Not a number"+e);}
			 return c;
			 }
}
