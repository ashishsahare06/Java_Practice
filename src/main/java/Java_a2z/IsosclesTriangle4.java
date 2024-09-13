package Java_a2z;

import java.util.Scanner;

public class IsosclesTriangle4 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number of Isosceles Triangle : ");
		
		int numIsoTri = s.nextInt();
		
		for(int i=1; i<=numIsoTri; i++) {
			System.out.println("Enter lenth of Base : ");
			double Base = s.nextDouble();
			
			System.out.println("Enter lenth of Height : ");
			double Height = s.nextDouble();
			
			double Area = 0.5*Base*Height;
			
			System.out.println("Area of IsoTriangle is " + i + ":" +Area);
			
			
		}

	}

}
