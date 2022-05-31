package com.palindrome;

public class UserInput {
	int value;
	
	public boolean isPalindrome(int value) {
		this.value =value;
		int temp, sum=0;
		boolean result=false;
		temp = this.value;
		while(temp >0) {
			int percantile = temp %10;
			sum = (sum *10)+percantile;
			temp=temp/10;
		}
			if(sum == this.value) {
				System.out.println("sum : "+sum +" result : "+this.value);
			result=true;
			}
			//System.out.println(" value going to be return value");
		return  result;
	}
}
