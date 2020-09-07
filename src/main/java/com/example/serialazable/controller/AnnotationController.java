package com.example.serialazable.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.serialazable.service.Animal;

@RestController
public class AnnotationController {
	//@Qualifier("secondclass") use this or primary as shown in controlelr class
	//@Autowired
	private Animal animal;
	
	//this shows autowired on setter
	 //@Autowired(required=false)
	/*@Autowired
	 public void setAnimal(@Qualifier("dog") Animal animal)
	 {
	  this.animal=animal; 
	  }*/
	  
	//shows autowire on constructor
	  @Autowired
	  AnnotationController(@Qualifier("dog")Animal animal){
		  this.animal=animal;
	  }
	  
	  @GetMapping("/animal") 
	  public String get() {
		  return animal.characteristics();
	  }
	//shows autowired by type here given dog so dog will be returned if cat given,cat will be returned at private animal dog

	  /*@Autowired
	private Animal dog;
	@GetMapping("/animal")
    public String get() {
	return dog.characteristics();
	*/
	
	  

}
