package javaPgm.day9;

import java.util.Scanner;

public class PrintEleSizeGreaterThan5 {
	
	public static void main(String[] args) {
		System.out.println("Enter a range of number");
		Scanner input = new Scanner(System.in);
		int range = input.nextInt();
		String[] str = new String[range];
		System.out.println("Enter "+range+ " strings: ");
		for(int i = 0 ;i<str.length;i++) {
			str[i] = input.next();
		}
		
		for(int i=0;i<str.length;i++){
			
			if((str[i].length()) > 5) {
				System.out.println("String '" + str[i] + "'  size is greater than 5");
			}
		}
		
		
	}

}
