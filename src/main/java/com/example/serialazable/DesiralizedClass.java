package com.example.serialazable;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
enum Student
{
	John(11), Bella(10), Sam(13), Viraaj(9);
	private int age;                   //variable defined in enum Student
	int getage() { return age; }  //method defined in enum Student
	private Student(int age)  //constructor defined in enum Student
	{
		this.age= age;
	}
}
public class DesiralizedClass {
	  public static void main(String args[]){
		 
			System.out.println("Age of Viraaj is " +Student.Viraaj.getage()+ " years");
	 try{  
		  //Creating stream to read the object  
		  ObjectInputStream in=new ObjectInputStream(new FileInputStream("output.txt"));  
		  SerializableInt s=(SerializableInt)in.readObject();  
		  //printing the data of the serialized object  
		  System.out.println(s.id+" "+s.name);  
		  //closing the stream  
		  in.close();  
		  }catch(Exception e){System.out.println(e);}  
		 }  
}
