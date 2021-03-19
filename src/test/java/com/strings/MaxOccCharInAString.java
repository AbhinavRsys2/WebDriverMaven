package com.strings;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

import org.testng.annotations.Test;

public class MaxOccCharInAString {

	@Test
	public void maxchar()
	{
		
		String s1 = "Prrogrammiing";
		char[] ch = s1.toCharArray();
		int len   = ch.length;System.out.println(len);
		
		LinkedHashMap<Character,Integer> hmap = new LinkedHashMap<Character,Integer>();//till here hashmap has no values assigned
		
		for(Character cc:ch)
		{
			if(hmap.containsKey(cc))
			{
				hmap.put(cc, hmap.get(cc)+1);
			}
			else
			{
				hmap.put(cc, 1);
			}
		}
		System.out.println("hashmap contains "+hmap);
		
		Set<Entry<Character, Integer>> se=	hmap.entrySet();
		System.out.println("Set contains "+se);
		
		int maxvalue=0;
		char maxkey = ' ';
		
		for(Entry<Character, Integer> data:se)
		{
			if(data.getValue()>maxvalue)
			{
				maxvalue = data.getValue();
				maxkey = data.getKey();
			}
			
			
		}
		
		System.out.println(" this key "+maxkey+" has the max "+maxvalue);
		
	}
	
	
	
	
	
	
	
}
