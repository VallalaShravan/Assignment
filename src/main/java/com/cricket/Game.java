package com.cricket;

import java.util.Random;

import com.cricket.pojo.Player;

public class Game {
	static	int  toss;
	Player team;
	static {
		Random batting = new Random(2);
		toss= batting.nextInt();
	}
	public void battingTeam() {
		if(toss ==1) {
		System.out.println("Indian Choose to Batting");
		}else {
			System.out.println("Australia choose to Batting");
		}
	}
}
