package Java_a2zmust_Practice;

import java.util.Scanner;

public class LargestNumUntillZero4 {

	public static void main(String[] args) {
		
		Scanner s =new Scanner(System.in);
		int Largest= Integer.MIN_VALUE, num;
		
		do {
			System.out.println("Enter a numbr(0 to stop) : ");
			num=s.nextInt();
			if(num>Largest && num !=0) {
				Largest=num;
			}
			
		}while(num !=0); {
			System.out.println("Largest number :" + Largest);

	}}

}
