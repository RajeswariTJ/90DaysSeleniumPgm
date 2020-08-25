package javaPgm.day13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumOfIntInList {
	
		public static void main(String[] args) {
			System.out.println("Enter a range of number");
			Scanner input = new Scanner(System.in);
			int range = input.nextInt();
			List<Integer> list = new ArrayList<Integer>();
			
			int sum = 0;
			System.out.println("Enter "+range+ " numbers: ");
			for(int i = 0 ;i<range;i++) {
				
				list.add(input.nextInt());
			}
			
			for(int i=0;i<range;i++){
				
				sum = sum + list.get(i);
			}
			
			System.out.println("Add elements in the list: "+sum);
			
			

	
	}

}
