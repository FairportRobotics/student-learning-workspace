package edu.fairport.robotics.interfaces;

import java.util.ArrayList;

public interface NumbersInterface {
	public short guessNumberBetweenOneAndTen();
	public boolean isThisNumberEven(int number);
	public int whichNumberIsBigger(int a, int b);
	public int whichNumberIsBiggest(ArrayList<Integer> listOfNumbers);
}
