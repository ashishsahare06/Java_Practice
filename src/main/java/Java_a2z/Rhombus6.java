package Java_a2z;

import java.util.Scanner;

public class Rhombus6 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter number of Rhombus : ");
		
		int numRhombus = s.nextInt();
		
		for(int i=1; i<=numRhombus;i++) {
			System.out.println("Enter lenth of First Diagonal :");
			double Diagonal1 = s.nextDouble();
			
			System.out.println("Enter lenth of Second Diagonal :");
			double Diagonal2 = s.nextDouble();
			
			double Area = 0.5*Diagonal1*Diagonal2;
			
			System.out.println("Area of Rhombus is"+ i + ":" +Area);
			
			
		}
s.close();
	}

}
