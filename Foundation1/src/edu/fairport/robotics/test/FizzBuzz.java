package edu.fairport.robotics.test;

public class FizzBuzz {
	
	public static boolean isFizz(int i) {
		boolean ran = false;
		String iString = Integer.toString(i);
		boolean hasFive = iString.contains("5");
		
		if (i % 5 == 0) {
			ran = true;
			System.err.print("Fizz! ");
		} 
		
		if (hasFive) {
			ran = true;
			System.err.print("Fizz! ");
		}
		
		return ran;
	}
	
	public static boolean isBuzz(int i) {
		boolean ran = false;
		String iString = Integer.toString(i);
		boolean hasSeven = iString.contains("7");
		
		if (i % 7 == 0) {
			ran = true;
			System.err.print("Buzz! ");
		}
		
		if (hasSeven) {
			ran = true;
			System.err.print("Buzz! ");
		}
		return ran;
	}

	public static void main(String[] args) {

	
		
		for (int i = 1; i <= 99; i++) {
			
			boolean fizz = FizzBuzz.isFizz(i);
			boolean buzz = FizzBuzz.isBuzz(i);

			if (!fizz && !buzz) {
				System.err.print(i);	
			}
			System.err.println();
		}
	}
}
