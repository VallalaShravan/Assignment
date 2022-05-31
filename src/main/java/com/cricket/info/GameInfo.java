package com.cricket.info;

public class GameInfo {
	final int noOfTeams=2;
	int totalRuns;
	int teamIndiaRuns;
	int teamAustraliaRuns;
	int noOfOversPlayed;
	public GameInfo(int totalRuns, int teamIndiaRuns, int teamAustraliaRuns, int noOfOversPlayed) {
		super();
		this.totalRuns = totalRuns;
		this.teamIndiaRuns = teamIndiaRuns;
		this.teamAustraliaRuns = teamAustraliaRuns;
		this.noOfOversPlayed = noOfOversPlayed;
	}
	
}
