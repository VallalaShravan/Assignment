package com.cricket;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class IndianBatting {
			TeamIndia india;
			int overs=0;
			int balls;
			Scanner scan = new Scanner(System.in);
			public IndianBatting() {
				// TODO Auto-generated constructor stub
			}
				public IndianBatting(TeamIndia india) {
				this.india = india;
				}
				public void gameIsOn() {
					Map<Integer,Object> overInfo = new HashMap<Integer,Object>();
					for(int over=1;over<=5;over++) {
						overs = over;
						Map<Integer,String> data = new HashMap<Integer,String>();
						for(int ball=1;ball<=6;ball++ ) {
							System.out.println("enter result for "+over+"."+ball+" ball : ?" );
							String result = scan.next();
							data.put(ball, result);
						}
							overInfo.put(over, data);
						}
				}
}
