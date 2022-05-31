package com.cricket.game;

import java.time.LocalTime;
import java.util.Scanner;

public class ActiveMode {

	public static void main(String[] args) {
		Scanner readingData = new Scanner(System.in);
		LocalTime currentTime = LocalTime.now();
		System.out.println("Current Time is : "+currentTime);
		int hour= currentTime.getHour();
		System.out.println("Current Hour is : "+hour);
		System.out.println("weather conidtion is good to go ?[good or bad ]");
		String weatherCondition = readingData.next();
		if(weatherCondition.equalsIgnoreCase("good")) {
			//method
		}else {
			System.out.println("lets wait for one hour ");
			int AfterOneHour = LocalTime.now().getHour();
			while(hour+1 == AfterOneHour) {
				System.out.println("weather conidtion is good to go ?[good or bad ]");
				String weatherConditionAfterOneHour = readingData.next();
				if(weatherConditionAfterOneHour.equalsIgnoreCase("good")) {
					//method
				}else {
					System.out.println("Match is going to be Cancelled");
				}
			}
		}

	}

}
