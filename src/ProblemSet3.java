/**
 * INSTRUCTIONS.
 * 
 * Problem Set 3 will be more extensive than the first two. You've been warned. Practice makes perfect,
 * and we'll get a lot of practice with conditional and iterative control structures.
 * 
 * A few new concepts are being introduced with this assignment. Last time, we saw methods (other than
 * the @main method) for the first time. Now, we're seeing parameters, which are the variables inside
 * the parentheses in our methods. We'll cover these in more detail later. For now, you just need to
 * understand the basics.
 * 
 * A parameter is data that is provided to the method. It helps the method do its job. It's passed in
 * through the parentheses, and you can reference these variables by name as if they're your own.
 */

import java.util.Scanner;
import java.lang.Math;

public class ProblemSet3 {
	
	/**
	 * Make sure you're testing your code by calling your methods from the main method!
	 */
	
	public static void main(String[] args) {
		ProblemSet3 ps3 = new ProblemSet3();
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Fashion ");
		System.out.println("Your fashion: ");
		int you = input.nextInt();
		System.out.println("Date's fashion: ");
		int date = input.nextInt();
		ps3.dateFashion(you, date);
		
		System.out.println("\nFizz String");
		System.out.println("String: ");
		input.nextLine();
		String str = input.nextLine();
		ps3.fizzString(str);
		
		System.out.println("\nSquirrels");
		System.out.println("Temp: ");
		int temp = input.nextInt();
		System.out.println("Summer? (true/false): ");
		boolean summer = input.nextBoolean();
		ps3.squirrelPlay(temp, summer);
		
		System.out.println("\nFizz String 2");
		System.out.println("Number: ");
		int n = input.nextInt();
		ps3.fizzStringAgain(n);
		
		System.out.println("\nBricks");
		System.out.println("Small Bricks: ");
		int small = input.nextInt();
		System.out.println("Big Bricks: ");
		int big = input.nextInt();
		System.out.println("Goal Length: ");
		int goal = input.nextInt();
		ps3.makeBricks(small, big, goal);
		
		System.out.println("\nLone Sum");
		System.out.println("Value of a: ");
		int a = input.nextInt();
		System.out.println("Value of b: ");
		int b = input.nextInt();
		System.out.println("Value of c: ");
		int c = input.nextInt();
		ps3.loneSum(a, b, c);
		
		System.out.println("\nLucky Sum");
		System.out.println("Value of a: ");
		int a2 = input.nextInt();
		System.out.println("Value of b: ");
		int b2 = input.nextInt();
		System.out.println("Value of c: ");
		int c2 = input.nextInt();
		ps3.luckySum(a2, b2, c2);
		
		System.out.println("\nFactorial (For)");
		System.out.println("Number: ");
		int factorial = input.nextInt();
		ps3.factorialWithFor(factorial);
		
		System.out.println("\nFactorial (While)");
		System.out.println("Number: ");
		int factorial2 = input.nextInt();
		ps3.factorialWithWhile(factorial2);
		
		System.out.println("\nPrime");
		System.out.println("Number: ");
		int prime = input.nextInt();
		ps3.isPrime(prime);
		
		input.close();
	}
		
	public void dateFashion(int you, int date) {
		if (you >= 8 || date >= 8) {
			if (you <= 2 || date <= 2) {
				System.out.println("No");
				return;
			} else {
				System.out.println("Yes");
				return;
			}
		} else {
			if (you <= 2 || date <= 2) {
				System.out.println("No");
				return;
			} else {
				System.out.println("Maybe");
				return;
			}
		}
	}
	
	public void fizzString(String str) {
		int length = str.length();
		if (str.charAt(0) == 'f') {
			System.out.print("fizz");
		}
		if (str.charAt(length - 1) == 'b') {
			System.out.print("buzz");
		} 
		if (str.charAt(0) != 'f' && str.charAt(length - 1) != 'b') {
			System.out.print(str);
		}
		System.out.print("\n");
		return;
	}
		
	public void squirrelPlay(int temp, boolean isSummer) {
		int upper = (isSummer == true) ? 100 : 90;
		if (temp >= 60 && temp <= upper) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		return;
	}
	
	public void fizzStringAgain(int n) {
		if (n % 3 == 0) {
			System.out.print("fizz");
		}
		if (n % 5 == 0) {
			System.out.print("buzz");
		}
		if (n % 3 != 0 && n % 5 != 0) {
			System.out.print(n);
		}
		System.out.print("!\n");
		return;
	}
	
	public void makeBricks(int small, int big, int goal) {
		int bigUsed = goal / 5;
		if (bigUsed > big)
		{
			System.out.println("No");
			return;
		}
		int remainder = goal % 5;
		if (remainder > small) {
			System.out.println("No");
			return;
		} else {
			System.out.println("Yes");
			return;
		}
	}
	
	public void loneSum(int a, int b, int c) {
		if (a == b && b == c) {
			a = b = c = 0;
		}
		if (a == b) {
			a = b = 0;
		}
		if (b == c) {
			b = c = 0;
		}
		if (a == c) {
			a = c = 0;
		}
		System.out.println(a + b + c);
		return;
	}
	
	public void luckySum(int a, int b, int c) {
		int sum = 0;
		if (a == 13) {
			System.out.println(sum);
			return;
		}
		sum += a;
		
		if (b == 13) {
			System.out.println(sum);
			return;
		}
		sum += b;
		
		if (c == 13) {
			System.out.println(sum);
			return;
		}
		sum += c;
		System.out.println(sum);
		return;
	}
	
	public void factorialWithFor(int n) {
		long factorial = 1;
		for (int count = n; count > 0; count--) {
			factorial *= count;
		}
		System.out.println(factorial);
		return;
	}
	
	public void factorialWithWhile(int n) {
		long factorial = 1;
		int count = n;
		while (count > 0) {
			factorial *= count;
			count--;
		}
		System.out.println(factorial);
	}
	
	public void isPrime(int n) {
		double sqrt = Math.sqrt(n);
		for (int count = 2; count < (sqrt + 1); count++) {
			if (n % count == 0) {
				System.out.println("Not Prime");
				return;
			}
		}
		System.out.println("Prime");
		return;
	}
}