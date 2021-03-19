package com.strings;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

import org.testng.annotations.Test;

public class PrintTheDuplicateCharactersInString {
	
    @Test
	public void printduplicatechars()
	{
	String s1 = "Prroggrammingg";
	char[] ch =  s1.toCharArray();
	int len   = ch.length;System.out.println(len);
	
	LinkedHashMap<Character,Integer> lhm = new LinkedHashMap<Character,Integer>();
	
	for(Character cc :ch)
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
	
	Set<Entry<Character, Integer>>  se = lhm.entrySet();
	
	int maxvalue =1;
	char key = ' ';
	
	for(Entry<Character, Integer> ee : se)
	{
		if(ee.getValue()>maxvalue)
		{
			key=ee.getKey();
		}
		System.out.print(" " +key);
		
	}
	
	
	
	
	
	}	
	
	
}
