package edu.fairport.robotics.basics;

public class LoopingBasics {

	public static void main(String[] args) {

		/*
		 * Ex 1
		 */
		for (int i = 0; i < 10; i++) {
			System.err.println("1: i is " + i);
		}
		System.err.println("1: Done.");

		System.err.println("------------------------------------------");

		/*
		 * Ex 2
		 */
		for (int j = 100; j >= 90; j--) {
			System.err.println("2: " + j + " bottles of beer on the wall");
		}

		System.err.println("------------------------------------------");

		/*
		 * Ex 3
		 */
		int count = 0;
		for (int i = 0; i <= 10; i++) {
			for (int j = 50; j <= 60; j++) {
				System.err.println("3: i:" + i + " j:" + j);
				count++;
			}
		}
		System.err.println("3: I ran " + count + " times");

		System.err.println("------------------------------------------");

		/*
		 * Ex 4
		 */
		count = 0;
		while (count < 10) {
			System.err.println("4 : Count is " + count);
			count++;
		}
		System.err.println("4: Count is : " + count);

		System.err.println("------------------------------------------");

		/*
		 * Ex 5
		 */
		count = 0;
		while (true) {
			System.err.println("5 : Count is " + count);
			count++;
			if (count > 10) {
				break;
			}
		}
		System.err.println("5: Count is : " + count);
		
		System.err.println("------------------------------------------");

		/*
		 * Ex 6
		 */

		for (int i = 0; i < 20; i++) {
			if (i % 2 == 0) {
				continue;
			}
			System.err.println("6: " + i + " Is Not an Even Number");
		}
	}
}
