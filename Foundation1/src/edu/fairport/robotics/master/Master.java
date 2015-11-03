package edu.fairport.robotics.master;

import java.util.ArrayList;
import java.util.Random;
import java.util.Set;

import org.reflections.Reflections;

import edu.fairport.robotics.interfaces.IdentificationInterface;
import edu.fairport.robotics.interfaces.NumbersInterface;

public class Master {

	public Master() {
	}

	private void handle(IdentificationInterface iif) {
		System.err.println("---");
		System.err.println("Found the ident named : " + iif.getYourName());
		System.err.println("Greeting is : " + iif.makeGreetingForName("Armin"));
		System.err.println("Does this ident have any aliases? : " + iif.doYouHaveAnyAliases());
		if (iif.doYouHaveAnyAliases()) {
			ArrayList<String> aliases = iif.getAliases();
			System.err.println(iif.getYourName() + " Has " + aliases.size() + " alias(es).");
			for (String alias : aliases) {
				System.err.println("\t [" + alias + "] is an alias for ident " + iif.getYourName());
			}

		}
		System.err.println("---");
	}

	private void handle(String name, NumbersInterface nif) {

		System.err.println("---");
		
		// Initialize the vars we're going to use.
		int guess = new Random().nextInt(10) + 1;
		int eo = new Random().nextInt(5000);
		int a = new Random().nextInt();
		int b = new Random().nextInt();

		// Handle good and bad guesses
		int nifGuess = nif.guessNumberBetweenOneAndTen();
		if (nifGuess == guess) {
			System.err.println("AWESOME " + name + " guess the number I was thinking of! : " + guess);
		} else {
			System.err.println("Sorry " + name + " the number " + nifGuess + " was not the number I was thinking of. It was " + guess);
		}

		// Handle Even or Odd Guesses
		String eoString = (eo % 2 == 0) ? "even" : "odd";
		if ((eo % 2 == 0) == nif.isThisNumberEven(eo)) {
			System.err.println("Good Job " + name + ", " + eo + " is an " + eoString + " number");
		} else {
			System.err.println("That's not right " + name + ", " + eo + " is an " + eoString + " number");
		}

		// Handle Biggest Number
		if (Math.max(a, b) == nif.whichNumberIsBigger(a, b)) {
			System.err.println("\tThat's right " + name + ", " + Math.max(a, b) + " is bigger than " + Math.min(a, b));
		} else {
			System.err.println(name + "\toh noes, failboat..." + Math.max(a, b) + " is bigger than " + Math.min(a, b));
		}
		
		
		// Build an array of random numbers
		ArrayList<Integer> numbers = new ArrayList<Integer>(); 
		for (int i = 0; i < 10; i++) {
			numbers.add(new Random().nextInt(100));
		}
		
		
		// Get The Guess
		int nifBiggest = nif.whichNumberIsBiggest(numbers);
		
		// Compare it
		numbers.sort((a1,b1) -> Integer.compare(a1, b1));		
		int biggest  = numbers.get(numbers.size() - 1);
		
		System.err.println("Out of these numbers " + numbers + ", which did " + name + " think was the biggest?");
		if (nifBiggest == biggest) {
			System.err.println("Thats right, " + biggest + " is the biggest number");
		} else {
			System.err.println("No, " + nifBiggest + " is not the biggest, " + biggest + " is.");
		}
		
		System.err.println("---");
	}

	public static void main(String[] args) throws Exception {
		// Handles Each Class
		Master m = new Master();
		
		// Nice reflection handler.
		Reflections reflections = new Reflections("edu.fairport.robotics");
		
		// Deal with Each implementation now.
		Set<Class<? extends IdentificationInterface>> identIFClasses = reflections.getSubTypesOf(IdentificationInterface.class);
		
		System.err.println("Master Found " + identIFClasses.size() + " IdentificationInterface classes to process.");

		if (!identIFClasses.isEmpty()) {
			System.err.println("--------------------------- IdentificationInterface ---------------------------");
			for (Class<? extends IdentificationInterface> ifClass : identIFClasses) {

				IdentificationInterface iif = ifClass.newInstance();
				m.handle(iif);
			}

			System.err.println("------------------------------------------------------");
		}

		Set<Class<? extends NumbersInterface>> numbersIFClasses = reflections.getSubTypesOf(NumbersInterface.class);
		
		System.err.println("Master Found " + numbersIFClasses.size() + " NumbersInterface classes to process.");

		if (!numbersIFClasses.isEmpty()) {
			System.err.println("--------------------------- NumbersInterface ---------------------------");
			for (Class<? extends NumbersInterface> ifClass : numbersIFClasses) {

				NumbersInterface nif = ifClass.newInstance();
				String name = "Anonymous [" + nif.getClass().getSimpleName() + "]";
				if (nif instanceof IdentificationInterface) {
					name = ((IdentificationInterface) nif).getYourName();
				}

				m.handle(name, nif);
			}

			System.err.println("------------------------------------------------------");
		}

	}

}
