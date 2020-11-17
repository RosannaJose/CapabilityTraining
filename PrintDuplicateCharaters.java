package com.capability.training;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PrintDuplicateCharaters {

	public static void main(String[] agrs) {

		System.out.println("Enter a string : ");
		Scanner inputReader = new Scanner(System.in);
		String userInput = inputReader.nextLine();
		inputReader.close();

		char[] charArray = userInput.toCharArray();
		Map<Character, Integer> charMap = new HashMap<>();

		for (int i = 0; i < charArray.length; i++) {
			if (charMap.containsKey(charArray[i])) {
				charMap.put(charArray[i], charMap.get(charArray[i]) + 1);
			} else {
				charMap.put(charArray[i], 1);
			}
		}

		System.out.println("Duplicate characters : ");
		for (Map.Entry<Character, Integer> i : charMap.entrySet()) {
			if (i.getValue() > 1) {
				System.out.println(i.getKey());
			}
		}
	}
}
