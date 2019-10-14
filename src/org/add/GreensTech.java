package org.add;

public class GreensTech {


public void greensOmr(){

	System.out.println("No.19,Balamurugan Garden,OMR Road,Thoraipakkam, Kancheepuram District");
}
public void greensAdyar(){
	System.out.println("No.11, First Street, Padmanabha Nagar,Adyar,Chennai-600 020");
}
public void greensVelacherry(){
	System.out.println("No.28, Nagendra Nagar, Opposite Phoenix Market City, Velachery, Chennai - 600042");
}
public void greensTambaram(){
	System.out.println("No.1, Appa Rao colony, Tambaram,Sanatorium, Chennai - 600047.");
}
public void greensAnnanagar(){
	System.out.println("No:10, Annanagar west, Chennai -102");
}

//Executing the main method
public static void main(String[] args){
	//Object Creation
	//classname objectname = new classname();
	GreensTech b = new GreensTech();
	//we are calling the Method with the object
	//objectname.methodname
	b.greensAdyar();
	b.greensVelacherry();
	b.greensTambaram();
	b.greensOmr();
	b.greensAnnanagar();
	
}
}
