package com.example.serialazable;

import java.io.Serializable;

public class SerializableInt implements Serializable{
	   private static final long serialVersionUID = 1L; //Serial Version UID
       int id;
       transient String name;
       public SerializableInt(int id, String name) {
             this.id = id;
             this.name = name; 
       }

}
