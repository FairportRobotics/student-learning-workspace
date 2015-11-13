package edu.fairport.robotics.implementors;

import java.util.ArrayList;

import edu.fairport.robotics.interfaces.IdentificationInterface;

public class KDowney implements IdentificationInterface  {

	@Override
	public String getYourName() {
		// TODO Auto-generated method stub
		return "Yahweh";
	}

	@Override
	public String makeGreetingForName(String name) {
		// TODO Auto-generated method stub
		return "Why u stuup" + name + ". Zoonva";
	}

	@Override
	public void yellTheseWords(String word1, String word2) {
		// TODO Auto-generated method stub
		System.err.println(word1 + "?" + word2 + "!!!");
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
		list.add("Allah");
		list.add("Jesus");
		list.add("Abba");
		list.add("Holy Spirit");
		return list;
	}

}
