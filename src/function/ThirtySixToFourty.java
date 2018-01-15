package function;

import java.util.ArrayList;
import java.util.Arrays;

public class ThirtySixToFourty {
	public static void main(String[] args) {
	ArrayList<Integer> numberList = new ArrayList<Integer>();
	numberList.add(2);
	numberList.add(4);
	numberList.add(6);
	numberList.add(1);
	numberList.add(3);
	System.out.println("@@36. " + Arrays.toString(returnListToArray(numberList)));
		
	}
	
//	@@36. Write a method taht take one number List input than convert
//	 that to an Array and return that Array.
	
	public static int[] returnListToArray(ArrayList<Integer> numberList){
		int[] listToArray = new int[numberList.size()];
		for(int i=0; i<numberList.size(); i++){
			listToArray[i] = numberList.get(i);
		}
		
		return listToArray;
	}

}
