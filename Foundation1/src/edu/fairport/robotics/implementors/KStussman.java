package edu.fairport.robotics.implementors;

import java.util.ArrayList;

import edu.fairport.robotics.interfaces.IdentificationInterface;
import edu.fairport.robotics.interfaces.NumbersInterface;

public class KStussman implements IdentificationInterface, NumbersInterface {

	@Override
	public String getYourName() {
		return "Kevin";
	}

	@Override
	public String makeGreetingForName(String name) {
		return "Hello There " + name + ". How are you?";
	}

	@Override
	public void yellTheseWords(String word1, String word2) {
		System.err.println(word1 + "!!!!!!!!!!!!!!!!! " + word2 + "!!!!!!!!!!!!!!!!!!!!!");
	}

	@Override
	public boolean doYouHaveAnyAliases() {
		return true;
	}

	@Override
	public ArrayList<String> getAliases() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("bob");
		list.add("dave");
		list.add("joe");
		return list;
	}

	@Override
	public short guessNumberBetweenOneAndTen() {
		return 2;
	}

	@Override
	public boolean isThisNumberEven(int number) {

		return (number % 2 == 0);
	}

	@Override
	public int whichNumberIsBigger(int a, int b) {
		return Math.max(a, b);
	}

	@Override
	public int whichNumberIsBiggest(ArrayList<Integer> listOfNumbers) {
		if (listOfNumbers.isEmpty()) {
			return 0;
		}
		
		int biggest = listOfNumbers.get(0);
		for (int i = 1; i < listOfNumbers.size(); i++) {
			biggest = Math.max(biggest, listOfNumbers.get(i));
		}
		
		return biggest;
	}
}
