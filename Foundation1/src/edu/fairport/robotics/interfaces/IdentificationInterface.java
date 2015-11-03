package edu.fairport.robotics.interfaces;

import java.util.ArrayList;

public interface IdentificationInterface {
	public String getYourName();
	public String makeGreetingForName(String name);
	public void yellTheseWords(String word1, String word2);
	public boolean doYouHaveAnyAliases();
	public ArrayList<String> getAliases();
}
