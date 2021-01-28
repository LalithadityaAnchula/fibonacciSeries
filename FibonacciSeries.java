package fibonnaci;

import java.util.Scanner;

public class FibonacciSeries {
	
	private static Scanner input;
	
	public static void main(String[] args) {
		
		input = new Scanner(System.in);
		System.out.print("Input number of numbers required in series : ");
		int num = input.nextInt();  // Reading input from user..
		
		int t1=-1,t2=1,sum=0;
		System.out.print("Fibonacci series : ");
		
		for(int i=1;i<=num;i++) {
			sum=t1+t2;
			System.out.print(sum);
			if(i!=num)
				System.out.print(" , ");
			t1=t2;
			t2=sum;
		}

	}

}
