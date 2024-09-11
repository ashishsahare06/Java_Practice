package FitPeoAutomation;

import java.util.Scanner;

public class areaoftriangle2 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter number of Triangle: ");
		int numTriangle = s.nextInt();
		
		
		for(int i=1; i<=numTriangle; i++) {
System.out.println("Enter Base of Triangle: "+ i + ":");
			
			double Base = s.nextDouble();
			System.out.println("Enter Height of Triangle: "+ i + ":");
			
			double height = s.nextDouble();
			double area = 0.5* Base*height;
			
			System.out.println("Area of Triangle " + i + ": " + area);
			
		}
s.close();
	}

}
