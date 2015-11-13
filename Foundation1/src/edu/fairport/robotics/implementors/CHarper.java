package edu.fairport.robotics.implementors;

import java.util.ArrayList;

import edu.fairport.robotics.interfaces.IdentificationInterface;

public class CHarper implements IdentificationInterface {

	@Override
	public String getYourName() {
		// TODO Auto-generated method stub
		return "John Cena";
	}

	@Override
	public String makeGreetingForName(String name) {
		// TODO Auto-generated method stub
		return "Hello...";
	}

	@Override
	public void yellTheseWords(String word1, String word2) {
		System.err.println(word1 + "AND HIS NAME IS" + word2 + "JOHN CENA!!!!!!!!!!!!!!!!!!!!!");
		
	}

	@Override
	public boolean doYouHaveAnyAliases() {
		
		return true;
	}

	@Override
	public ArrayList<String> getAliases() {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		list.add("Trump");
		list.add("Shia Labeouf");
		list.add("Joe");
		list.add("Jake");
		list.add("Connor is better than Ronnie");
		list.add("Richard Nixon");
		return list;
	}

}
