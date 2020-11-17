package com.capability.training;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FindFirstNonRepeatedCharacter {

	public static void main(String[] args) {

		System.out.println("Enter string : ");
		Scanner inputScanner = new Scanner(System.in);
		String userInput = inputScanner.nextLine();
		inputScanner.close();

		char[] valueArray = userInput.toCharArray();

		System.out.println("First non duplicate charater : ");
		 char nonRepeatedChar = findFirstNonRepeatedCharacterUsingCollection(valueArray);
//		char nonRepeatedChar = findFirstNonRepeatedCharacterWithoutCollection(valueArray);
		System.out.println(nonRepeatedChar);
	}

	private static char findFirstNonRepeatedCharacterUsingCollection(char[] valueArray) {

		char nonRepeatedChar = 0;
		Map<Character, Integer> valueMap = new LinkedHashMap<>();
		for (int i = 0; i < valueArray.length; i++) {
			if (valueMap.containsKey(valueArray[i])) {
				valueMap.put(valueArray[i], valueMap.get(valueArray[i]) + 1);
			} else {
				valueMap.put(valueArray[i], 1);
			}
		}
		for (Map.Entry<Character, Integer> a : valueMap.entrySet()) {
			if (a.getValue() == 1) {
				nonRepeatedChar = a.getKey();
				break;
			}
		}
		return nonRepeatedChar;
	}

//	private static char findFirstNonRepeatedCharacterWithoutCollection(char[] valueArray) {
//
//		char nonRepeatedChar = 0;
//		for (int i = 0; i < valueArray.length; i++) {
//			int count = 0;
//			for (int j = i + 1; j < valueArray.length; j++) {
//				if (valueArray[i] == valueArray[j]) {
//					count++;
//				}
//			}
//			if (count == 0) {
//				nonRepeatedChar = valueArray[i];
//				break;
//			}
//		}
//		return nonRepeatedChar;
//	}
}
