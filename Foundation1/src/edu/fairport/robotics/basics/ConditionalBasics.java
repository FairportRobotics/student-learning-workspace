package edu.fairport.robotics.basics;


public class ConditionalBasics {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		if (true) {
			System.err.println("1 : yes");
		} else {
			System.err.println("1 : no");
		}
		
		System.err.println("------------------------------------------");
		
		if (1 == 1) {
			System.err.println("2 : yes");
		} else {
			System.err.println("2 : no");
		}
		
		System.err.println("------------------------------------------");
		
		if (1 == 2) {
			System.err.println("3 : yes");
		} else {
			System.err.println("3 : no");
		}
		
		System.err.println("------------------------------------------");
		
		int apples = 1;
		int oranges = 2;
		boolean areTheyTheSame = (apples == oranges);
		
		if (areTheyTheSame) {
			System.err.println("4 : yes");
		} else {
			System.err.println("4 : no");
		}
		
		System.err.println("------------------------------------------");
		
		
		boolean hadCake = true;
		boolean eatItToo = true;
		
		if (hadCake && eatItToo) {
			System.err.println("Sorry, can't have cake and it it too. (" + hadCake + "," + eatItToo + ")" );
		} else if (hadCake && !eatItToo) {
			System.err.println("Yes, you can have cake but not eat it. (" + hadCake + "," + eatItToo + ")");
		} else if (!hadCake && eatItToo) {
			System.err.println("Fail. How could you eat cake if you don't have it? (" + hadCake + "," + eatItToo + ")");
		} else {
			System.err.println("You don't have cake and you didn't eat it. All Done. (" + hadCake + "," + eatItToo + ")");
		}
		
		System.err.println("------------------------------------------");
			
		boolean here = true;
		boolean there = false;
		
		if (here || there) {
			System.err.println("It's either here or there");
		} else {
			System.err.println("It's neither here nor there");
		}
		
		
		
	}

}
