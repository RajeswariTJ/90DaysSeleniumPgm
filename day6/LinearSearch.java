package javaPgm.day6;

import java.util.Scanner;

public class LinearSearch {
	
	public static void main(String[] args) {
		int count = 0; int index = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the range of number:");
		int range = input.nextInt();
		System.out.println("Enter numbers:");
		int[] arr = new int[range];
		for(int i = 0 ; i<range;i++ ) {
			arr[i] = input.nextInt();
		}
		
		System.out.println("Enter a number:");
		int searchNo = input.nextInt();
		
		for(int j = 0;j<arr.length;j++) {
			if(arr[j] == searchNo) {
				index = j;
				count++;
				//System.out.println("searchNo: "+searchNo+" is available at index " + j);
				break;
			}
				
		}
		
		if(count == 1) {
			System.out.println("searchNo: "+searchNo+" is available at index " + index);
		}else
			System.out.println("searchNo: "+searchNo+" is not available");
	}

}
