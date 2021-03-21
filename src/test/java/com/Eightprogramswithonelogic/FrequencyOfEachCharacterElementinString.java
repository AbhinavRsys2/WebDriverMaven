package com.Eightprogramswithonelogic;

import java.util.LinkedHashMap;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class FrequencyOfEachCharacterElementinString  {

	
	@Test
	public void test2()
	{ 
		
	String s1 = "Prroggramming";
	char[] ch =s1.toCharArray();
	
	LinkedHashMap<Character,Integer> lhm = new LinkedHashMap<Character,Integer>();
	
	for(Character cc:ch)
	{
		if(lhm.containsKey(cc))
		{
			lhm.put(cc, lhm.get(cc)+1);
		}
		else
		{
			lhm.put(cc, 1);
		}
	}
	
	System.out.println(lhm);
	
	
	
	
	
	
	
	}
}
