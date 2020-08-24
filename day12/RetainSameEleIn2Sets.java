package javaPgm.day12;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RetainSameEleIn2Sets {
	
public static void main(String[] args) {
		
		System.out.println("Enter a range of numbers for both the sets: ");
		Scanner input = new Scanner(System.in);
		int range1 = input.nextInt();		
		Set<Integer> frstSet= new HashSet<Integer>();
		System.out.println("Enter "+range1+" numbers of first set: ");
		for(int i = 0;i<range1;i++) {
			frstSet.add(input.nextInt());
		}
		Set<Integer> scndSet= new HashSet<Integer>();
		System.out.println("Enter "+range1+" numbers of second set: ");
		for(int i = 0;i<range1;i++) {
			scndSet.add(input.nextInt());
		}
		
		frstSet.retainAll(scndSet);
		System.out.println("After comparting both sets, printing only same elemtents:");
		System.out.println(frstSet);
		
}
}
