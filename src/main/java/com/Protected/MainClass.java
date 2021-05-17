package com.Protected;


import com.accmodifiers.AccModifiersTest.PersonData1;

public class MainClass extends PersonData {

	public static void main(String[] args) {
		PersonData1 PersonData1=new PersonData1();
		
        // access protected method field and we cant not access out side the package
		//persondata.display();
		
		MainClass persond=new MainClass();
		// access protected method in same packege
		persond.display();
	}

	
}
