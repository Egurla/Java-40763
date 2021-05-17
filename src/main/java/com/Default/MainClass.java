package com.Default;


import com.accmodifiers.AccModifiersTest.PersonData1;

public class MainClass extends Person{

	public static void main(String[] args) {
		
		PersonData1 persondata=new PersonData1();
		//access for defualt is faild out side the package
//        persondata.age=12;
//        persondata.display2();
		
		//Access defualt same package
		Person person =new Person();
		person.age=20;
		
		person.display();
				
	}
}
