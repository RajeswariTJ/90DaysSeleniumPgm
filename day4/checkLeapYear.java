package javaPgm.day4;
import java.util.Scanner;

public class checkLeapYear {
	
	public static void main(String[] args) {
		System.out.println("Enter the number to check whether the year is leap year or not: ");
		Scanner input = new Scanner(System.in);
		int leapYear = input.nextInt();
		if((leapYear%4) == 0) {
			System.out.println("Given number is leap year");
		}else {
			System.out.println("Given number is not a leap year");
		}
	}

}
