package edu.fairport.robotics.test;

public class FizzBuzz {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 99; i++) {
		
			String result = "";
			
			result += (i % 3 == 0) ? "Fizz! " : "";
			result += (i % 5 == 0) ? "Buzz!" : "";
			
			System.err.println(result.isEmpty() ? i : result);
			
		}
	}
}
