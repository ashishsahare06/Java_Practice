package Java_a2zmust_Practice;

public class FibonacciSeries1 {
//Fibonacci Series
	public static void main(String[] args) {
		//0 1 1 2 3 5 8 13 21
		
int n=10;
int a=0;
int b=1;

System.out.print("Fibonacci Series is :" + a + "," + b );

for(int i=2; i<n; i++) {
	int next = a+b;
	System.out.print("," +next);
	a=b;
	b=next;
}
	}

}
