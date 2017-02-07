package edu.fairport.robotics.test;

public class FizzBuzz {
	
	public static boolean isFizz(int i) {
		boolean ran = false;
		String iString = Integer.toString(i);
		boolean hasFive = iString.contains("5");
		
		if (i % 5 == 0) {
			ran = true;
			System.err.println("Fizz! ");
		} 
		
		if (hasFive) {
			ran = true;
			System.err.println("Fizz! ");
		}
		
		return ran;
	}
	
	public static boolean isBuzz(int i) {
	
		boolean ran = false;
		String iString = Integer.toString(i);
		boolean hasSeven = iString.contains("7");
		
		if (i % 7 == 0) {
			ran = true;
			System.err.println("Buzz! ");
		}
		
		if (hasSeven) {
			ran = true;
			System.err.println("Buzz! ");
		}
		return ran;
	}

	public static void main(String[] args) {

	
		
		for (int i = 1; i <= 99; i++) {

			if (!FizzBuzz.isFizz(i) && !FizzBuzz.isBuzz(i)) {
				System.err.println();	
			}
		}
	}
}
