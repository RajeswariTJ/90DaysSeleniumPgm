package javaPgm.day12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InsEleInArrList {
	
	public static void main(String[] args) {
		
		System.out.println("Enter a range of numbers: ");
		Scanner input = new Scanner(System.in);
		int range = input.nextInt();		
		List<Integer> list= new ArrayList<Integer>();
		System.out.println("Enter "+range+" numbers: ");
		for(int i = 0;i<range;i++) {
			list.add(input.nextInt());
		}
		System.out.println("Print all the values in the list");
		for(int i = 0;i<range;i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("In which position element need to be inserted?");
		int pos = input.nextInt();
		System.out.println("What to insert at position: "+pos);
		int ele = input.nextInt();
		list.add(pos,ele);
		
		System.out.println("After inserting an element in the list:");
		System.out.println(list);
		
	}

}
