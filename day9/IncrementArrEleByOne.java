package javaPgm.day9;

import java.util.Scanner;

public class IncrementArrEleByOne {
	
	public static void main(String[] args) {
		System.out.println("Enter a range of number");
		Scanner input = new Scanner(System.in);
		int range = input.nextInt();
		int[] arr = new int[range];
		int sum = 1;
		System.out.println("Enter "+arr.length+ " numbers: ");
		for(int i = 0 ;i<arr.length;i++) {
			
			arr[i]= input.nextInt();
		}
		
		for(int i=0;i<arr.length;i++){
			
			System.out.println("Element "+arr[i]+" incremented by one - " +(sum + arr[i]));
		}
		
		
	}


}
