package com.capability.training;

import java.util.Scanner;

public class StringReversal {

	public static void main(String[] agrs) {

		System.out.println("Enter a string : ");
		Scanner inputReader = new Scanner(System.in);
		String userInput = inputReader.nextLine();
		inputReader.close();

		char[] charArray = userInput.toCharArray();

		StringBuilder builder = new StringBuilder();
		for (int i = (charArray.length) - 1; i >= 0; i--) {
			builder.append(charArray[i]);
		}
		System.out.println("Reversed string : " + builder.toString());
		
		//recursion logic pending
	}
}
