package com.isarelationship;

public class Test {
	
	public static void main (String[]args){
		
		ptest p1 = new ptest();
		p1.m1();
		
		ctest c1 = new ctest();
		c1.m1();
		c1.m2();
		
		ptest p2 = new ctest();
		p2.m1();
	
//		ctest c2 = new ptest();
		
		
		
	}
	

}
