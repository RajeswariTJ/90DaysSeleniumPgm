package javaPgm.day9;

import java.util.Scanner;

public class OddAdEvenNoInAnArray {
	public static void main(String[] args) {
		System.out.println("Enter a range of number");
		Scanner input = new Scanner(System.in);
		int range = input.nextInt();
		int[] arr = new int[range];
		System.out.println("Enter "+arr.length+ " numbers: ");
		for(int i = 0 ;i<arr.length;i++) {
			
			arr[i]= input.nextInt();
		}
		
		for(int i=0;i<arr.length;i++){
			
			if(arr[i]%2==0) {
				System.out.println("Element "+arr[i]+" is a even number");	
			}else
				System.out.println("Element "+arr[i]+" is a odd number");	
		}
		
		
	}
}
