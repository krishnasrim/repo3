package com.example.serialazable;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;


public class SerializableClass {
	  public static void main(String args[]){
          try{
        	  String literal="oldliteral";
        	  literal.concat("new");
        	  String literal2="oldliteral";
        	  String object=new String("oldobject");
        	String  object2=new String("oldobject");
        	  if(object==object2) {
        		  System.out.println("sameobject"); 
        	  }else {
        		  System.out.println("not same object"); 
        	  }
        	  System.out.println(object);

        	  if(literal==literal2) {
        		  System.out.println("sameliteral"); 
        	  }else {
        		  System.out.println("not same literal"); 
        	  }
        	  System.out.println("concat"+literal);
        	  
        	  StringBuffer sb= new StringBuffer("mutable");
        	  
        	  sb.append("string");
        	  System.out.println("concat buffer"+sb);
        	  
        	  StringBuffer sb2= new StringBuffer("mutable");
        	  sb2.append("string");
        	  System.out.println("concat buffer second"+sb2);
        	  
        	  if(sb==sb2) {
        		  System.out.println("samebuffer"); 
        	  }else {
        		  System.out.println("not same buffer"); 
        	  }  
        	  
        	  SerializableInt emp1 =new SerializableInt(20110,"John");
        	  SerializableInt emp2 =new SerializableInt(22110,"Jerry");
        	  SerializableInt emp3 =new SerializableInt(20120,"Sam");
                 FileOutputStream fout=new FileOutputStream("output.txt");
                 ObjectOutputStream out=new ObjectOutputStream(fout);
                 out.writeObject(emp1);
                 out.writeObject(emp2);
                 out.writeObject(emp3);
                 out.flush();
                 out.close();
                 System.out.println("Serialization and Deserialization is been successfully executed");
          }
          catch(Exception e){
                 System.out.println(e);}
          }
}
