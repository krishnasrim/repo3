package com.example.serialazable.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
// @Primary use this annotation if you wantthis bean to be returned
@Service
public class Cat implements Animal{

	@Override
	public String characteristics() {
		// TODO Auto-generated method stub
		return "cat";
	}

}
