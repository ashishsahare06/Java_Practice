package Java_a2z;

import java.util.Scanner;

public class Parallelogram5 {

	public static void main(String[] args) {
	Scanner s =new Scanner(System.in);
	System.out.println("Enter number of Parallelogram : ");
	int numParalllogram = s.nextInt();
	
	for(int i=1; i<=numParalllogram; i++) {
		System.out.println("Enter lenth of Base: ");
		double Base = s.nextDouble();
		
		System.out.println("Enter lenth of Hight: ");
		double Height = s.nextDouble();
		
		double Area = Base*Height;
		System.out.println("Area of Parallelogram " + i + ":" +Area);
		
		
		
	}
	

	}

}
