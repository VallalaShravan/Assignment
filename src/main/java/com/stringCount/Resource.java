package com.stringCount;

import java.util.Scanner;

public class Resource {
	private String name;
	Scanner sc;
	public Resource() {
		sc = new Scanner(System.in);
		System.out.println("enter Data [ Note :must be in Characters ]?");
		this.name=sc.next();
	}
	public int stringCount() {
		String tempName = this.name;
		byte[] b= tempName.getBytes();
		int length = b.length;
		if(length>0) {
		//	System.out.println("length of string : "+length);
			System.out.println("individual Characters : ");
			int i=0;
			for(byte individual : b) {
				System.out.println(i+"@ Position  : "+(char)individual);
				i++;
			}
		}
		return length;
	}
}
