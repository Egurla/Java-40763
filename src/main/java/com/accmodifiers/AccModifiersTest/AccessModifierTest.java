package com.accmodifiers.AccModifiersTest;

public class AccessModifierTest {
	public static void main(String[] main){
		
		//Private 
        PersonData Pd = new PersonData();

        PersonData1 personData = new PersonData1();
        //access private variable and field from another class
        //personData.setName("Kumar");
        
        //cant access privete method
       // personData.mothod1();
        
        //access the private variable using the getter and setter
        Pd.setName("Kumar");
        System.out.println(Pd.getName());       
        
}
}
