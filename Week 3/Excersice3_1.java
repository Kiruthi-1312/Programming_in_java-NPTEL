//This program is related to the generation of Fibonacci numbers.

// For example: 0,1, 1,2, 3,5, 8, 13,… is a Fibonacci sequence where 13 is the 8th Fibonacci number.

import java.util.*;

public class Fibonacci {

	static int fib(int n)
	{
		if(n==1)
		{
			return 0;
		}
		else if(n==2)
		{
			return 1;
		}
		else
		{
			return fib(n-1)+fib(n-2);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println(fib(n));
	}

}
