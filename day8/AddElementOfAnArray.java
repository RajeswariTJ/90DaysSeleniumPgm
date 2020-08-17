package javaPgm.day8;

import java.util.Scanner;

public class AddElementOfAnArray {
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
		
		System.out.println("Add elements of an array: "+sum);
		
	}
}
