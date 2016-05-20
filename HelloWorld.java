/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	static int wheel = 2;
	int price = 2000;
	public static void main (String[] args) throws java.lang.Exception
	{
		
		Test1();
		System.out.println("Wheel = "+wheel);
		//System.out.println("Wheel = "+price);
		//Test2();
		Ideone ideone = new Ideone();
		ideone.Test2();
		System.out.println("Price: "+ideone.price);
	}
	
	public static void Test1(){
		System.out.println("Test1 Method");
		
	}
	
	public void Test2(){
		System.out.println("Test2 Method");
	}
}
