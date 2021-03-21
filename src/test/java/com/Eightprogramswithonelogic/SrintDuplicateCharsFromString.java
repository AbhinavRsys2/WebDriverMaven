package com.Eightprogramswithonelogic;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

import org.testng.annotations.Test;

public class SrintDuplicateCharsFromString {

    @Test
	public void test6()
	{
		String s1 = "Prrooggraminng";
		char[] ch = s1.toCharArray();
		
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
		
		Set<Entry<Character, Integer>> set1 = lhm.entrySet();
		int maxvalue=1;
		for(Entry<Character, Integer> ee :set1)
		{
			if(ee.getValue()>maxvalue)
			{
				System.out.print(" "+ee.getKey());
			}
		}
		
		
		
		
		
		
		
		
	}
	
	
	
}
