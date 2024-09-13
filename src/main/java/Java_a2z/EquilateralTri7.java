package Java_a2z;

import java.util.Scanner;

public class EquilateralTri7 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		
		System.out.println("Enter number of Equilateral Triangle : ");
		
		int numEquTri = s.nextInt();
		
		for(int i=1; i<=numEquTri;i++) {
			System.out.println("Enter side of Equilaterral Triangle : ");
			
			double side = s.nextDouble();
			
			double area = (Math.sqrt(3)/4)*side*side;
			System.out.println("Area of equilateral Triangle is" + i + ":" +area);
		}
s.close();
	}

}
