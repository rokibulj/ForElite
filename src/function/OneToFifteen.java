package function;

import java.util.ArrayList;
import java.util.Arrays;

public class OneToFifteen {
	public static void main(String[] args) {
		System.out.println("@@01. " + returnName("Hassan"));
		System.out.println("@@02. " + returnEvenList(9));
		System.out.println("@@03. " + returnOddNumber(10));
		System.out.println("@@04. " + returnKilometer(4));
		System.out.println("@@05. " + returnUppercase("Tell me about yourself."));
		System.out.println("@@06. " + returnLowercase("Thank you so much."));
		System.out.println("@@07. " + returnIndex("print all index"));
		System.out.println("@@08. " + returnCharacter("print all characters"));
		System.out.println("@@09. " + returnSum(7));
		System.out.println("@@10. " + returnSquare(10));
		System.out.println("@@11. " + Arrays.toString(returnArray(3)));
		System.out.println("@@12. " + returnArrayList(02));
		System.out.println("@@13. " + returnStatement(29));

		int[] numArray = { 2, 4, 6, 8, 0 };
		System.out.println("@@14. " + returnmaximumNumber(numArray));
		System.out.println("@@15. " + returnMinNumber(numArray));
	}

	// @@15.Write a method that take input one number Array and return the
	// minimum number.
	public static int returnMinNumber(int[] numArray) {
		int min = 0;
		for (int i = 0; i < numArray.length; i++) {
			if (min > numArray[i]) {
				min = numArray[i];
				System.out.println(min);
			}
		}
		return min;
	}

	// @@14. Write a method that take input one number Array and return the
	// maximum number.
	public static int returnmaximumNumber(int[] numArray) {
		int max = 0;
		for (int i = 0; i < numArray.length; i++) {
			if (max < numArray[i]) {
				max = numArray[i];
				System.out.println(max);
			}
		}
		return max;
	}

	// @@13. Write a method that take one number input and return fizz if
	// the given number divided by 5 and return buzz if the given number divided
	// by 5 & 3. Otherwise return fizz buzz.
	public static String returnStatement(int number) {
		String statement = null;
		if (number % 5 == 0 && number % 3 == 0) {
			statement = "buzz";
		} else if (number % 5 == 0) {
			statement = "fizz";
		} else {
			statement = "fizz buzz";
		}

		return statement;
	}

	// @@12. Write a method that take one number input and return a number
	// List starting from 0 to that given number.
	public static ArrayList<Integer> returnArrayList(int number) {
		ArrayList<Integer> listArray = new ArrayList<>();
		for (int i = 0; i <= number; i++) {
			listArray.add(i);
		}

		return listArray;
	}

	// @@11. Write a method that take one number input and return an Array that
	// contains 0 to given number.
	public static int[] returnArray(int number) {
		int[] anArray = new int[number + 1];
		for (int i = 0; i <= number; i++) {
			anArray[i] = i;
		}

		return anArray;
	}

	// @@10. Write a method that take one number input and return square of the
	// given number.
	public static int returnSquare(int number) {
		int square = 0;
		square = number * number;
		return square;
	}

	// @@09. Write a method that take one number input & return the sum of 1 to
	// that given number.
	public static int returnSum(int number) {
		int total = 0;
		for (int i = 0; i <= number; i++) {
			total = total + i;
		}
		return total;
	}

	// @@08. Write a method that take one String input and return a list of all
	// characters.
	public static ArrayList<Character> returnCharacter(String text) {
		ArrayList<Character> charc = new ArrayList<>();
		for (int i = 0; i < text.length(); i++) {
			charc.add(text.charAt(i));
		}
		return charc;
	}

	// @@07. Write a method that take one String input and return a list of all
	// index.
	public static ArrayList<Integer> returnIndex(String text) {
		ArrayList<Integer> ind = new ArrayList<>();
		for (int i = 0; i < text.length(); i++) {
			ind.add(i);
		}

		return ind;
	}

	// @@06. Write a method that take one String input and return same String in
	// lower case.
	public static String returnLowercase(String text) {
		String lowerCase = null;
		lowerCase = text.toLowerCase();
		return lowerCase;
	}

	// @@05. Write a method that take one String input and return same String in
	// upper case.
	public static String returnUppercase(String text) {
		String upperCase = null;
		upperCase = text.toUpperCase();
		return upperCase;
	}

	// @@04. Write a method that take input as mile & return as Kilometer.
	public static double returnKilometer(int mile) {
		double kilo = 0;
		kilo = mile * 1.6;

		return kilo;
	}

	// @@03. Write a method that takea number input and return the list of
	// all odd number from 0 to that given number.
	public static ArrayList<Integer> returnOddNumber(int number) {
		ArrayList<Integer> oddNumber = new ArrayList<>();
		for (int i = 0; i <= number; i++) {
			if (i % 2 == 0) {
				oddNumber.add(i);
			}
		}
		return oddNumber;
	}

	// @@02. Write a method that take a number input and return the list of
	// all even number from 0 to that given number.
	public static ArrayList<Integer> returnEvenList(int number) {
		ArrayList<Integer> evenList = new ArrayList<>();
		for (int n = 0; n <= number; n++) {
			if (n % 2 == 0) {
				evenList.add(n);
			}
		}

		return evenList;
	}

	// @@01. Write a method that take your name input and return your name.
	public static String returnName(String text) {
		String name = null;
		name = text;
		return name;
	}

}
