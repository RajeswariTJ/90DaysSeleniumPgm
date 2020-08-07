package javaPgm.day4;

import java.util.Scanner;

public class AlnerativePrimeNumber {
	
	public static void main(String args[]) {
		int count = 0; int a = 1; 
		System.out.println("Enter the range of number to print alternative prime numbers: ");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		System.out.println("Alternative Prime numbers");
		for(int i = 2;i<=n;i++) {
			
			for(int j=2;j<=i;j++) {
				if((i%j)==0) {
					count++;
				}
			}
			if(count == 1) {
				if((a%2)!=0) {
				System.out.println(i);
				}
				a++;
				count = 0;
			}else if(count>=2) {
				count = 0;
			}
			
		}
	}

}
