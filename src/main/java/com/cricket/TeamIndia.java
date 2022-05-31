package com.cricket;

import java.util.List;
import com.cricket.pojo.*;
public class TeamIndia {
List<Player> list;
int noOfRuns;
int noOfOversPlayed;
int noOfWicketsDown;
public TeamIndia(List<Player> list, int noOfRuns, int noOfOversPlayed, int noOfWicketsDown) {
	super();
	this.list = list;
	this.noOfRuns = noOfRuns;
	this.noOfOversPlayed = noOfOversPlayed;
	this.noOfWicketsDown = noOfWicketsDown;
}

}
