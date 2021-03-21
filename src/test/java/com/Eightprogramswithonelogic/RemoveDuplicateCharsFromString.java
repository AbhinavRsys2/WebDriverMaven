package com.Eightprogramswithonelogic;

import java.util.LinkedHashMap;
import java.util.Set;

import org.testng.annotations.Test;

public class RemoveDuplicateCharsFromString {
@Test
	public void test4()
	{
		String s1 = "Proggrraammiing";
		char[] ch = s1.toCharArray();
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
		
		System.out.println("Frequency "+lhm);
		
		Set keys = lhm.keySet();
		System.out.println(keys);
		
	}
	
	
}
