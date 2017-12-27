package function;

public class SixtySixToThirtyFive {
	public static void main(String[] args) {
		System.out.println("@@26. " + returnConsonantCount("Count All Consonant"));
		System.out.println("@@27. " + returnVowelCount("Count all Vowels"));
		
	}
	
//	@@27. Write a method that take one String input and return the count of all vowels.
	
	public static int returnVowelCount(String sentence){
		int vowelCount = 0;
		String vowel = "aeiou";
		sentence = sentence.toLowerCase();
		for(int i=0; i<sentence.length(); i++){
			if(vowel.contains(String.valueOf(sentence.charAt(i)))){
				vowelCount++;
			}
		}
		
		return vowelCount;
	}
	
//	@@26. Write a method that take String input and return the count of all consonant.
	
	public static int returnConsonantCount(String sentence){
		int consCount = 0;
		String allcons = "qwrtyplkjhgfdszxcvbnm";
		System.out.println(allcons.length());
		sentence = sentence.toLowerCase();
		for(int i=0; i<sentence.length(); i++){
			
			if(allcons.contains(String.valueOf(sentence.charAt(i)))){
				consCount++;
			}
		}
		return consCount;
	}

}
