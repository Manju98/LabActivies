package com.question1;

import java.util.Arrays;

public class CheckArraysEqual {

	public static void main(String[] args) {
		int a[]= {20,78,90};
		int b[]= {20,78,90};
		boolean result=Arrays.equals(a, b);
		if(result==true)
		{
			System.out.println("Two arrays are equal");
		}else
		{
			System.out.println("Two arrays are not equal");
		}

	}

}