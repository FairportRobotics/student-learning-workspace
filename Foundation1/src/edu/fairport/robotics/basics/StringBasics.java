package edu.fairport.robotics.basics;


public class StringBasics {
	public static void main(String[] args) {

		String mySecondString = "hello";
		String myString = new String("hello");
		String myThirdString = "" + 'h' + 'e' + 'l' + 'l' + 'o';
		String myFourthString = "" + (char) 104 + (char) 101 + (char) 108 + (char) 108 + (char) 111; 
		new String();
		
		if (myString.equals(mySecondString) && mySecondString.equals(myThirdString) && myThirdString.equals(myFourthString)) {
			System.err.println("They All Have The Same Value");
		} else {
			System.err.println("They DO NOT Have The Same Value");
		}		
	}
}
