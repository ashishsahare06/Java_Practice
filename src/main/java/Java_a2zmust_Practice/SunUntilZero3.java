package Java_a2zmust_Practice;

import java.util.Scanner;

public class SunUntilZero3 {
																		// sum of Numbers untilll enter zero 0

	public static void main(String[] args) {
	Scanner s =new Scanner(System.in);
	
	int sum=0,num;
	do{
		System.out.println("Enter Number(0 to stop) :");
		num = s.nextInt();
	
		sum= sum+num;
	}	while(num !=0); {
		System.out.println("sum of number :" +sum);
	}

	}

}
