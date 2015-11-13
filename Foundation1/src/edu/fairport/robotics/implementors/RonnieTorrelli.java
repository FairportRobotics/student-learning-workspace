package edu.fairport.robotics.implementors;

import java.util.ArrayList;

import edu.fairport.robotics.interfaces.IdentificationInterface;

public class RonnieTorrelli implements IdentificationInterface{

	@Override
	public String getYourName() {
		// TODO Auto-generated method stub
		return "ronnie";
	}

	@Override
	public String makeGreetingForName(String name) {
		// TODO Auto-generated method stub
		return "Hello!" + name + "You are the coolest person!";
	}

	@Override
	public void yellTheseWords(String word1, String word2) {
		// TODO Auto-generated method stub
		System.err.println(word1 + "?????????????" + word2 + "?!?!?!?!?!?!?!?!?!?");
	}

	@Override
	public boolean doYouHaveAnyAliases() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public ArrayList<String> getAliases() {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		list.add("MAGIC!");
		list.add("MAGIC jonson!");
		list.add("JOHN CENA");
		list.add("southern");
		list.add("i cant say what i want");
		return list;
	}
	
	

}
