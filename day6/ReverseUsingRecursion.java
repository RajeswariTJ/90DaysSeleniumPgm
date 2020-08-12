package javaPgm.day6;

import java.util.Scanner;

public class ReverseUsingRecursion {
	
	 void reverse(int num) {
		 int rem = 0;
		if(num!=0) {	
		 rem = num%10;
		 num = num/10;
		 System.out.print(rem);
		 reverse(num);
		}	
        	 
	}
	public static void main(String[] args) {
		
		ReverseUsingRecursion rev = new ReverseUsingRecursion();
		System.out.println("Enter the number: ");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		System.out.println("Reverse of given number: ");
		rev.reverse(number);
               
        }

        
		
		
		
		
		
		
		
		
		
	
}
