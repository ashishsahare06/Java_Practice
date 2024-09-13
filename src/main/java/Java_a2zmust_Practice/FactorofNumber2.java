package Java_a2zmust_Practice;

public class FactorofNumber2 {//print all factors of number

	public static void main(String[] args) {
		int num=76;
		System.out.print("Factor of " + num + " => ");
		
		for(int i=1;i<+num;i++) {
			if(num % i==0) {
				System.out.print(i + " ");
			}
		}

	}

}
