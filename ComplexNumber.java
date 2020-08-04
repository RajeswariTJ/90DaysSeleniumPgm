package com.jaanu.prime;

public class ComplexNumber {
	
	public int add(int no1,int no2) {
		int result = no1+no2;
		return result;
		
	}

	public static void main(String[] args) {
		
		ComplexNumber complexNo = new ComplexNumber();
				
		int real = complexNo.add(10, 12);
		int img = complexNo.add(6, 5);
					
		System.out.println("complex no " + real +"+"+ img+"i" );
		
	}

}
