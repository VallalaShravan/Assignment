package com.copying;
/*we can access particular class 
 * Properties and behavior with Inheritance too. 
 * 
 * here we are trying with creating Object
 * */

public class Parent {

	String surname;
	String gowthram;
	String hometown;
	int noOfChildrens;
	
	Parent(String surname,String gowthram,String hometown,int noOfChildrens){
		this.gowthram=gowthram;
		this.surname=surname;
				this.hometown=hometown;
				this.noOfChildrens=noOfChildrens;
	}
	public void retrieveInfo() {
	System.out.println("Parents Data surname : "+surname +", gowthram : "+gowthram+", hometown : "+hometown);

	}
	@Override
	public String toString() {
		return "Parent [surname=" + surname + " , gowthram=" + gowthram + ", hometown=" + hometown + ", noOfChildrens="
				+ noOfChildrens + "]";
	}
	

}
