package com.cricket;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.cricket.pojo.Player;

public class IndianBatting {
	String[] players = new String[] {"dhoni","kohli","dhawan","rohith","sachin"};
			TeamIndia india;
			int overs=0;
			int balls;
			Player battingPerson = new Player(players[0]);
			Player opponentPerson=  new Player(players[1]);
			Player tempBatter;
			int totalRuns=0;
			int battingOrder=2;
			Scanner scan = new Scanner(System.in);
			public IndianBatting() {
				// TODO Auto-generated constructor stub
			}
				public IndianBatting(TeamIndia india) {
				this.india = india;
				}
				public Map gameIsOn() {
					Map<Integer,Object> overInfo = new HashMap<Integer,Object>();
					for(int over=1;over<=5;over++) {
						overs = over;
						Map<Integer,String> data = new HashMap<Integer,String>();
						for(int ball=1;ball<=6;ball++ ) {
							System.out.println("enter result for "+over+"."+ball+" ball : ?" );
							String result = scan.next();
							int ResultToInteger=0;
							if(result.equalsIgnoreCase("1") || result.equalsIgnoreCase("2") || 
									result.equalsIgnoreCase("3") || result.equalsIgnoreCase("4")
									|| result.equalsIgnoreCase("6") || result.equalsIgnoreCase("0")) {
								ResultToInteger = Integer.parseInt(result);
							}
							switch(result) {
							case "0" :  battingPerson.runs= battingPerson.runs+ResultToInteger;
												totalRuns = totalRuns+ResultToInteger;
												opponentPerson.runs=opponentPerson.runs+0;
								break;
							case "1" : 
								break;
							case "2" :battingPerson.runs= battingPerson.runs+ResultToInteger;
							totalRuns = totalRuns+ResultToInteger;
							opponentPerson.runs=opponentPerson.runs+0;
								break;
							case "3" :
								break;
							case "4" :battingPerson.runs= battingPerson.runs+ResultToInteger;
							totalRuns = totalRuns+ResultToInteger;
							opponentPerson.runs=opponentPerson.runs+0;
								break;
								
							case "6" :battingPerson.runs= battingPerson.runs+ResultToInteger;
							totalRuns = totalRuns+ResultToInteger;
							opponentPerson.runs=opponentPerson.runs+0;	
								break;
							case "out": 
								break;
							case "wide" :  opponentPerson.runs=opponentPerson.runs+0;
													battingPerson.runs= battingPerson.runs+0;
													totalRuns = totalRuns+1;
								break;
							case "no ball" : opponentPerson.runs=opponentPerson.runs+0;
							battingPerson.runs= battingPerson.runs+0;
							totalRuns = totalRuns+1;
								break;
							default :opponentPerson.runs=opponentPerson.runs+0;
							battingPerson.runs= battingPerson.runs+0;
							totalRuns = totalRuns+0;
								break;
							}
							
							data.put(ball, result);
						}
							overInfo.put(over, data);
						}
					return overInfo;
				}
}
