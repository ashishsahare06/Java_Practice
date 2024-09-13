package Java_a2z;

import java.util.Scanner;

public class areaofcricle_1 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the number of circles: ");
		int numcircles= s.nextInt();
		
		for(int i =1; i<= numcircles; i++) {
			System.out.println("Enter radius for circle" + i + " : ");
			double radius = s.nextDouble();
			
			double area = Math.PI*radius*radius;
			
			System.out.println("Area of circle " + i + ":" + area);
			
		}
		s.close();
		
	}

}
