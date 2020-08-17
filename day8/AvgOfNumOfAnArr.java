package javaPgm.day8;

import java.util.Scanner;

public class AvgOfNumOfAnArr {
	
	public static void main(String[] args) {
		System.out.println("Enter a range of number");
		Scanner input = new Scanner(System.in);
		int range = input.nextInt();
		int[] arr = new int[range];
		
		int sum = 0;
		System.out.println("Enter "+arr.length+ " numbers: ");
		for(int i = 0 ;i<arr.length;i++) {
			
			arr[i]= input.nextInt();
		}
		
		for(int i=0;i<arr.length;i++){
			
			sum = sum + arr[i];
		}
		
		double avg = sum/(arr.length);
		
		System.out.println("Avg of nums of an array: "+avg);
		
		
	}

}
