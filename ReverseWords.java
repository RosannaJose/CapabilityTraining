package com.capability.training;

import java.util.Scanner;

public class ReverseWords {

	public static void main(String[] agrs) {

		System.out.println("Enter a sentence : ");
		Scanner inputReader = new Scanner(System.in);
		String userInput = inputReader.nextLine();
		inputReader.close();

		String[] wordsArrays = userInput.split(" ");

		StringBuilder builder = new StringBuilder();
		for (int i = (wordsArrays.length) - 1; i >= 0; i--) {
			builder.append(wordsArrays[i]).append(" ");
		}
		System.out.println(builder.toString().trim());
	}
}
