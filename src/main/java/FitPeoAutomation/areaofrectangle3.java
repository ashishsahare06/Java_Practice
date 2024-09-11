package FitPeoAutomation;

import java.util.Scanner;

public class areaofrectangle3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the number of rectangles: ");
		int numrectangle = s.nextInt();
		
		for(int i=1; i<= numrectangle;i++) {
			
			System.out.println("Enter the lenght of triangle : ");
			double Length = s.nextDouble();
			
			System.out.println("Enter the Height of triangle : ");
			double Height =s.nextDouble();
			
			double area = Length*Height;
			
			System.out.println("Ara of Rectangle is : " + i + ":" +area);
		}

	}

}
