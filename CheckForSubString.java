package com.capability.training;

import java.util.Scanner;

public class CheckForSubString {

	public static void main(String[] agrs) {
		System.out.println("Enter first string : ");
		Scanner inputReader = new Scanner(System.in);
		String firstData = inputReader.nextLine();
		System.out.println("Enter second string : ");
		String secondData = inputReader.nextLine();
		inputReader.close();
		
		if(firstData.contains(secondData)) {
			System.out.println(secondData+" is substring of "+firstData);
		} else if (secondData.contains(firstData)) {
			System.out.println(firstData+" is substring of "+secondData);
		}else {
			System.out.println("Not a substring");
		}
	}

}
