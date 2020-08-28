package com.example.serialazable;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingClass {
	 long power(int n, int p) throws Exception {
         if(n==0 && p==0) {
             throw new Exception("n and p should not be zero.");
         } else if(n<0 || p<0) {
             throw new Exception("n or p should not be negative.");
         } 
         return (long)Math.pow(n, p);
     }
	 public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	         Scanner scan = new Scanner(System.in);
	    try {
	      int x = scan.nextInt();
	      int y = scan.nextInt();
	      System.out.println(x / y);
	    } catch(ArithmeticException | InputMismatchException e) {
	      if (e instanceof ArithmeticException) {
	        System.out.println("java.lang.ArithmeticException: / by zero");
	      } else if (e instanceof InputMismatchException){
	        System.out.println("java.util.InputMismatchException");
	      }
	    }
	    
	    /*power*////////////////
	     ExceptionHandlingClass obj = new ExceptionHandlingClass();
	            int n = 2;
	            int p = 2;
	            
	            try {
	                System.out.println(obj.power(n, p));
	            } catch (Exception e) {
	                System.out.println(e);
	            }
	        }
	    
	  }
	    
