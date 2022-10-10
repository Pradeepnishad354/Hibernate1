package com.inter;

 interface A{
	 	 
	 void show();
 }
 
 interface B{
	 
 void show();
 }
public class Inter implements A,B {
	
	public void show() {
		
		System.out.println("hello");	
		}
	
	public static void main(String[] args) {
		
		Inter i=new Inter();
		
		i.show();
	}

	
	
	
	

}
