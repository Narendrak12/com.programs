package com.Programs;

public class countlettersspacesnumbersandothercharacters {

	public static void main(String[] args) {
		String x="Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";
		count(x);

	}

	private static void count(String x)
	{
	char[] ch=x.toCharArray();
	int letter=0;
	int space=0;
	int num=0;
	int specialchar=0;
	for(int i=0;i<ch.length;i++) 
	{
	  if(Character.isLetter(ch[i])) {
		  letter++;
	  }
	  else if(Character.isSpaceChar(ch[i])) {
		  space++;
	  }
	  else if(Character.isDigit(ch[i])) {
		  num++;
		  
	  }else {
		  specialchar++;
	  }
	  
	} 
		System.out.println("letter is"+letter);
	  System.out.println("space is"+space);
	  System.out.println("numbers is"+space);
	  System.out.println("Specialchar is"+specialchar);	
	}

}
