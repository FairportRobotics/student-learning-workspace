package edu.fairport.robotics.implementors;

import java.util.ArrayList;

import edu.fairport.robotics.interfaces.IdentificationInterface;

public class ABush implements IdentificationInterface {

	@Override
	public String getYourName() {
		// TODO Auto-generated method stub
		return "Alex";
	}

	@Override
	public String makeGreetingForName(String name) {
		// TODO Auto-generated method stub
		return "Hello "+name;
	}

	@Override
	public void yellTheseWords(String word1, String word2) {
		// TODO Auto-generated method stub
		System.err.print(word1+"?!?!?!?!?!?! "+word2+"?!?!?!?!?!?!");
	}

	@Override
	public boolean doYouHaveAnyAliases() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public ArrayList<String> getAliases() {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<String>();
		list.add("Brother");
		list.add("Father");
		list.add("Mother");
		list.add("Sister");
		return list;
	}

}
