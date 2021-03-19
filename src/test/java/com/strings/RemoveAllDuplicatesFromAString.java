package com.strings;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

import org.testng.annotations.Test;

public class RemoveAllDuplicatesFromAString {

	@Test
	public void removeduplicate()
	{
		String s1 = "Prroogrammiinnggg";
		char[] ch = s1.toCharArray();
		int len   = ch.length;System.out.println(len);
		
		LinkedHashMap<Character, Integer> lhm = new  LinkedHashMap<Character, Integer>();//at this point it has no values
		
		for(Character cc: ch)
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
		
		
		
		Set<Character> keys = lhm.keySet();//
		System.out.println("after removing duplicates  "+keys);
		
		//Printing all duplicates from a string
		Set<Entry<Character, Integer>> se = lhm.entrySet();
		int maxcount =1;
		char maxkey = ' ';
		for(Entry<Character, Integer> data: se)
		{
			if(data.getValue()>maxcount)
			{
				maxkey=data.getKey();
			}
			
			System.out.print("  "+maxkey);
		}
		
		
		
	}
	
	
}
