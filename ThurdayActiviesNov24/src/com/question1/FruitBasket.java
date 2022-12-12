package com.question1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class FruitBasket {

	public static void main(String[] args) {
		//FruitBasket01
		
		ArrayList<String> baskt01= new ArrayList<String>();
		baskt01.add("Mango");
		baskt01.add("Straberry");
		baskt01.add("Guva");
		baskt01.add("Cherry");
		baskt01.add(" ");
		baskt01.add(" ");
		
		/*for(Integer i:ar)
		{
			System.out.println(i);	
		}*/
		System.out.println(baskt01);
		
		ArrayList<String> baskt02= new ArrayList<String>();
		baskt02.add("Apple");
		baskt02.add("Orange");
		baskt02.add("PineApple");
		baskt02.add("Lichi");
		baskt02.add("Watermelon");
		baskt02.add("Grapes");
		baskt02.add("Jackfruit");
		System.out.println(baskt02);
		
		//using addAll () method;
		baskt01.addAll(baskt02);
		System.out.println("AddAll() method : "+baskt01);
		
		//using remove() method;
		baskt02.remove(0);
		System.out.println("remove() method-'Appele'in basket02: "+baskt02);
		
		Collections.replaceAll(baskt02,"Orange","Appele");
		System.out.println("replace() method Orange with Appele : " +baskt02);
	}
}
					
       