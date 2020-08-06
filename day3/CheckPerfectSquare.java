
package javaPgm.day3;

import java.util.Scanner;

public class CheckPerfectSquare {
	

	public static void main(String args[]) {
		
		System.out.println("Enter a number: ");
		Scanner input = new Scanner(System.in);
		int nextInt = input.nextInt();
		int sqrt = (int) Math.sqrt(nextInt);
		System.out.println("Sqrt of given number: "+sqrt);
		Integer squareNo= sqrt*sqrt;
		//String s = quo.toString();
		System.out.println("Square number of "+sqrt+": "+squareNo);
		//String s1 = s.substring(0,4);
		//System.out.println("s1: "+s1);
		if(squareNo.equals(nextInt)) {
			System.out.println("perfect square");
		}
		else
		{
			System.out.println("Not a perfect square");
		}
	}

}
