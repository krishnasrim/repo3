package com.example.serialazable;

import java.io.*;
import java.util.*;
interface PerformOperation2 {
 boolean check(int a);
}
class MyMath2 {
 public static boolean checker(PerformOperation2 p, int num) {
  return p.check(num);
 }

   // Write your code here

 public static PerformOperation2 isOdd(){
        return (int a) -> a % 2 != 0;
    }
    
    public static PerformOperation2 isPrime(){
        return (int a) -> java.math.BigInteger.valueOf(a).isProbablePrime(1);
    }
    
    public static PerformOperation2 isPalindrome(){
        return (int a) ->  Integer.toString(a).equals( new StringBuilder(Integer.toString(a)).reverse().toString() );
    }
}
public class LambdaCrctClass {

 public static void main(String[] args) throws IOException {
  MyMath2 ob = new MyMath2();
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  int T = Integer.parseInt(br.readLine());
  PerformOperation2 op;
  boolean ret = false;
  String ans = null;
  while (T--> 0) {
   String s = br.readLine().trim();
   StringTokenizer st = new StringTokenizer(s);
   int ch = Integer.parseInt(st.nextToken());
   int num = Integer.parseInt(st.nextToken());
   if (ch == 1) {
    op = ob.isOdd();
    ret = ob.checker(op, num);
    ans = (ret) ? "ODD" : "EVEN";
   } else if (ch == 2) {
    op = ob.isPrime();
    ret = ob.checker(op, num);
    ans = (ret) ? "PRIME" : "COMPOSITE";
   } else if (ch == 3) {
    op = ob.isPalindrome();
    ret = ob.checker(op, num);
    ans = (ret) ? "PALINDROME" : "NOT PALINDROME";

   }
   System.out.println(ans);
  }
 }
}
