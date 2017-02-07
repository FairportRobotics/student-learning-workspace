package edu.fairport.robotics.test;

public class FizzBuzz {
	
	public static boolean isFizz(int i) {
		boolean result = false;
		
		String iString = Integer.toString(i);
		boolean hasFive = iString.contains("5");
		
		if (i % 5 == 0) {
			result = true;
		} else if (hasFive) {
			result = true;
		}
		
		return result;
	}

	public static void main(String[] args) {

	
		
		for (int i = 1; i <= 99; i++) {

			if (FizzBuzz.isFizz(i)) {
				System.err.println("Fizz!");
			} else {
				System.err.println(i);
			}
		}
	}
}
