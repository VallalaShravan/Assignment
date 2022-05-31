package com.cricket;

import java.util.List;

import com.cricket.pojo.Player;

public class TeamAustralia {
	List<Player> list;
	int noOfRuns;
	int noOfOversPlayed;
	int noOfWicketsDown;
	public TeamAustralia(List<Player> list, int noOfRuns, int noOfOversPlayed, int noOfWicketsDown) {
		super();
		this.list = list;
		this.noOfRuns = noOfRuns;
		this.noOfOversPlayed = noOfOversPlayed;
		this.noOfWicketsDown = noOfWicketsDown;
	}

}
