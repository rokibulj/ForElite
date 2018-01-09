package function;

import java.beans.FeatureDescriptor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.IntStream;

public class SixtySixToThirtyFive {
	public static void main(String[] args) {
		System.out.println("@@26. " + returnConsonantCount("Count All Consonant"));
		System.out.println("@@27. " + returnVowelCount("Count all Vowels"));
		System.out.println("@@28. " + returnUpperCaseCount("CouNt All UppEr ChaR"));
		System.out.println("@@29. " + returnCountWithoutSpace("we love our country"));
		System.out.println("@@30. " + returnRepeatedChar("Return all repeated character"));
		System.out.println("@@31. " + returnAllUniqueChar("return all unique char"));
		System.out.println("@@32. " + returnCountOfGivenChar("bangladesh", 'a'));
		
		int[] numArray = {2, 3, 5, 10};
		System.out.println("@@33. " + returnSumOfArrayValue(numArray));
		
		ArrayList<Integer> numList = new ArrayList<Integer>();
		numList.add(2);
		numList.add(3);
		numList.add(5);
		System.out.println("@@34. " + returnSumOfList(numList));
		System.out.println("@@35. " + returnReverseString("America"));

	}
	
//	@@35. Write a method that take one String input and return same
//	String in reverse order
	
	public static String returnReverseString(String text){
		String reverseString = "";
		for(int i=text.length()-1; i>=0; i--){
			reverseString = reverseString + text.charAt(i);
			
		}
		
		return reverseString;
	}
	
//	@@34. Write a method that take one Integer type List input and return sum of all values.
	
	public static int returnSumOfList(ArrayList<Integer> numList){
		int sumOfList = 0;
		for(int i=0; i<numList.size(); i++){
			sumOfList = sumOfList + numList.get(i);
		}
		
		return sumOfList;
	}
	
//	@@33. Write a method that take one Integer type Array input and
//	return sum of all values.

	public static int returnSumOfArrayValue(int[] numArray){
		int sumOfArrayValue = 0;
		sumOfArrayValue = IntStream.of(numArray).sum();
		
		return sumOfArrayValue;
	}
	
	// 32. Write a method that take one String and one character input and
	// return the count of that given character.

	public static int returnCountOfGivenChar(String text, char first) {
		int countOfGivenChar = 0;
		for (int i = 0; i < text.length(); i++) {
			if (String.valueOf(text.charAt(i)).equalsIgnoreCase(String.valueOf(first))) {
				countOfGivenChar++;
			}
		}

		return countOfGivenChar;
	}

	// 31. Write a method that take one String input & return all the unique
	// character.

	public static String returnAllUniqueChar(String text) {
		String uniqueChar = "";
		uniqueChar = text;
		for (int i = 0; i < text.length(); i++) {
			for (int j = i + 1; j < text.length(); j++) {
				if (text.charAt(i) == text.charAt(j)) {
					uniqueChar = uniqueChar.replaceAll(String.valueOf(text.charAt(i)), "");
				}
			}
		}

		return uniqueChar;
	}

	// 30. Write a method that take one String input and return all repeated
	// characters.

	public static String returnRepeatedChar(String repeat) {
		String repeatedChar = "";
		for (int i = 0; i < repeat.length() - 1; i++) {
			for (int j = i + 1; j < repeat.length(); j++) {
				if (repeat.charAt(i) == repeat.charAt(j)) {
					if (!repeatedChar.contains(String.valueOf(repeat.charAt(i)))) {
						repeatedChar = repeatedChar + repeat.charAt(i);

					}

				}
			}
		}

		return repeatedChar;
	}

	// @@29. Write a method that take one String input and return the count
	// of all characters without whitespace.

	public static int returnCountWithoutSpace(String text) {
		int countWithoutSpace = 0;
		text = text.replaceAll(" ", "");
		countWithoutSpace = text.length();

		return countWithoutSpace;
	}

	// @@28. Write a method that take one String input and return the
	// count of all uppercase characters.

	public static int returnUpperCaseCount(String textUpper) {
		int upperCaseCount = 0;
		for (int i = 0; i < textUpper.length(); i++) {
			if (Character.isUpperCase(textUpper.charAt(i))) {
				upperCaseCount++;
			}
		}

		return upperCaseCount;
	}

	// @@27. Write a method that take one String input and return the count of
	// all vowels.

	public static int returnVowelCount(String sentence) {
		int vowelCount = 0;
		String vowel = "aeiou";
		sentence = sentence.toLowerCase();
		for (int i = 0; i < sentence.length(); i++) {
			if (vowel.contains(String.valueOf(sentence.charAt(i)))) {
				vowelCount++;
			}
		}

		return vowelCount;
	}

	// @@26. Write a method that take String input and return the count of all
	// consonant.

	public static int returnConsonantCount(String sentence) {
		int consCount = 0;
		String allcons = "qwrtyplkjhgfdszxcvbnm";
		sentence = sentence.toLowerCase();
		for (int i = 0; i < sentence.length(); i++) {

			if (allcons.contains(String.valueOf(sentence.charAt(i)))) {
				consCount++;
			}
		}
		return consCount;
	}

}
