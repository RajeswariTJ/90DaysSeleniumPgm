package javaPgm.day13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RemEleInListWithGvnCond {
	
	public static void main(String[] args) {
		
		System.out.println("Enter a range of numbers: ");
		Scanner input = new Scanner(System.in);
		int range = input.nextInt();		
		List<String> list= new ArrayList<String>();
		System.out.println("Enter "+range+" Strings: ");
		for(int i = 0;i<range;i++) {
			list.add(input.next());
		}
		System.out.println("Print all the strings in the list");
		for(int i = 0;i<range;i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("Print the strings which is starts with S and size is greater than 5 ");
		for(int i = 0 ;i<range;i++) {
			
			if((list.get(i).startsWith("S"))&&(list.get(i).length()>5)) {
				System.out.println(list.get(i));
			}
		}
		
		
		
	}

}
