package edu.fairport.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class FileReaderTest {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new FileReader(new File("/usr/share/dict/american-english")));
		String line;
		String biggest = "";
		while ((line = br.readLine()) != null) {
			if (line.length() > biggest.length()) {
				biggest = line;
			}
		}
		
		
		
		System.err.println("Biggest is : " + biggest + "(" + biggest.length() + ")");
			
		}

}
