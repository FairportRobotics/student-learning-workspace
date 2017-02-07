package edu.fairport.robotics.test;

public class ZachFizzBuzz {
	
	public static void main(String[] args) {
		String numstr = "0";
		Integer numint = 0;
		int isFizzBuzz = 0;
		for (int i = 1; i <= 99; i++) {

			if (numstr.contains("5")) {
				System.out.print("Fizz");
				isFizzBuzz = 1;
			}
			
			if (numint % 5 == 0) {
				System.out.print("Fizz");
				isFizzBuzz = 1;
			}
			
			if (numstr.contains("7")) {
				System.out.print("Buzz");
				isFizzBuzz = 1;
			}
			
			if (numint % 7 == 0) {
				System.out.print("Buzz");
				isFizzBuzz = 1;
			}
			
			if (isFizzBuzz == 0) {
				System.out.print(numint);
			}
			
			System.out.println();
			isFizzBuzz = 0;
			numint++;
			numstr = numint.toString();
		}
	}
}