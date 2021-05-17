package com.Public;


import com.Protected.PersonData;
import com.accmodifiers.AccModifiersTest.PersonData1;

public class MainClass {

	public static void main(String[] args) {
		
		// accessing the public class
        Person person = new Person();

        // accessing the public variable
        person.Count =2 ;
        // accessing the public method in same package
        person.display();
        
        
        //Access public method from out side the package
        PersonData persondata=new PersonData();
        persondata.age=12;
        persondata.display1();
        
	}
}
