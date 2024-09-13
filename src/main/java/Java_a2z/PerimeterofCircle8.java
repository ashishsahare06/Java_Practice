package Java_a2z;

import java.util.Scanner;

public class PerimeterofCircle8 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number of cricle : ");
		int numCricle = s.nextInt();
		
		for(int i=1;i<=numCricle;i++) {
			
			System.out.println("Enter Radius of Cricle : ");
			double Radius = s.nextDouble();
			
			double Perimeter = 2*Math.PI*Radius;
			
			System.out.println("Perimeter of circle is" + i + ":" +Perimeter);
			
		}
		s.close();

	}

}
