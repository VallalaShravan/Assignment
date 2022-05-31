package com.palindrome;
/*
 * program about palindrome, palindrome means number should be same in 
 * both directions , first to last and last to first
 * */

import java.util.Scanner;

public class IsPalindrome {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("enter the value which have to be checked ? ");
			int check_Value= scan.nextInt();
			UserInput user = new UserInput();
			if(user.isPalindrome(check_Value)) {
				System.out.println("Entered Value is Palindrome");
			}else {
				System.out.println("it is not palindrome");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
