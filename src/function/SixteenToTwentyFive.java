package function;

import java.util.ArrayList;
import java.util.Arrays;

public class SixteenToTwentyFive {
	public static void main(String[] args) {
		System.out.println("@@16. " + returnString(19));
		System.out.println("@@17. " + returnInteger("18"));
		System.out.println("@@18. " + returnBoolean("what you doing?"));
		System.out.println("@@19. " + returnSumOfIndex("count all index total"));
		System.out.println("@@20. " + returnLastFive("retrurn last five character."));
		System.out.println("@@21. " + returnFirstFiveChar("First five char return"));
		System.out.println("@@22. " + returnMiddleChar("supercalifragilisticexpialidocious"));
		System.out.println("@@23. " + returnWordList("how are you my friend?"));

	}
	
//	23. Write a method that take one String input and return a list of all word.
	
	public static ArrayList<String> returnWordList(String text){
		ArrayList<String> wordList = new ArrayList<String>();
		String[] textArray = text.split(" ");
		for(int i=0; i<textArray.length; i++){
			wordList.add(textArray[i]);
		}
		
		return wordList;
	}
	
//	22. Write a method that take one String input and return fifth to
//	tenth characters as a String.
	
	public static ArrayList<Character> returnMiddleChar(String text){
		ArrayList<Character> middleChar = new ArrayList<Character>();
		for(int i=4; i<=10; i++){
			middleChar.add(text.charAt(i));
		}
		
		return middleChar;
	}
	
	// @@21. Write a method that take input one String and return a List of
	// first five characters.
	
	public static ArrayList<Character> returnFirstFiveChar(String text){
		ArrayList<Character> firstFiveChar = new ArrayList<Character>();
		for(int i=0; i<=4; i++){
			firstFiveChar.add(text.charAt(i));
		}
		
		return firstFiveChar;
	}

//	 Mhd # 20. Write a method that take one String input and return a List of
//	 last five characters.
	 

	public static ArrayList<Character> returnLastFive(String text) {
		ArrayList<Character> lastFive = new ArrayList<Character>();
		for (int i = text.length() - 5; i < text.length(); i++) {
			lastFive.add(text.charAt(i));
		}

		return lastFive;
	}

	// @@19. Write a method that take one String input and return the sum of all
	// index.
	public static int returnSumOfIndex(String text) {
		int sumIndex = 0;
		for (int i = 0; i < text.length(); i++) {
			sumIndex = sumIndex + i;
		}
		return sumIndex;
	}

	// @@18. Write a method that take String input & return true if it
	// contains char 'a'. Otherwise return false;
	public static boolean returnBoolean(String secntence) {
		boolean containChar = false;
		for (int i = 0; i < secntence.length(); i++) {
			if (secntence.charAt(i) == 'a') {
				containChar = true;
			}
		}
		return containChar;
	}

	// @@17. Write a method that take input a String which representation a
	// number and return the same value as Integer.
	public static int returnInteger(String number) {
		int numberInteger = 0;
		numberInteger = Integer.valueOf(number);

		return numberInteger;
	}

	// @@16. Write a method that take one number input and return the same value
	// as string.
	public static String returnString(int number) {
		String numberString = "";
		numberString = String.valueOf(number);

		return numberString;
	}

}
