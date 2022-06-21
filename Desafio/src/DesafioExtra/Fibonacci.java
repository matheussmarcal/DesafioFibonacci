package DesafioExtra;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); 
		
		System.out.print("Entre com um número: "); 
		int n = in.nextInt();
		
		for (int i = 1; i <= n; i++) {
			long x = fib(i);
			System.out.println("fib(" + i + ") = " + x);
		}
	}	
		public static long fib(int n) {
			if (n <= 2) 
				return 1;
			
			else return fib(n - 1) + fib(n - 2);
		}
}