package com.innerContainer;

public class University {
	String universityName="JNTUH";
	{
		System.out.println("University Name  :  JNTUH");
	}
	class DistrictCollege{
		String collegeName;
		public void getCollegeName(String name) {
			collegeName= name;
			System.out.println("District College Name : "+collegeName+" under University : "+universityName);
		}
	}
	class RuralCollege extends DistrictCollege{
		String localCollege;
		public void getInforamtion(String localCollegeName) {
			localCollege = localCollegeName;
			System.out.println("College Name : "+localCollege);
			getCollegeName("KITS-Kakatiya Institute of Technology and Science");
		}
	}
}
