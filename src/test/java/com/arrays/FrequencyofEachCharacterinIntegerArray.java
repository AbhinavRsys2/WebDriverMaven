package com.arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;

public class FrequencyofEachCharacterinIntegerArray {

	public static void main(String[] args) {
		
		
		int[] a = new int[]{1,1,2,2,3,4,5,6,7,7,8,8,8};
		
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		
		for(int i=0;i<a.length;i++)
		{
			if(hm.containsKey(a[i]))
			{
				hm.put(a[i], hm.get(a[i])+1);
								
			}
			else
			{
				hm.put(a[i], 1);
			}
			
			
		}
		System.out.println(hm);
		
		Set key = hm.keySet();
		System.out.println(key);
		
		//int[] a = new int[]{1,1,2,2,3,4,5,6,7,7,8,8,8};
		Set<Entry<Integer, Integer>>  se = hm.entrySet();
		System.out.println(se);
		int maxvalue =1;
		int dupkey =0;
		
		for(Entry<Integer, Integer> ee : se)
		{
			if(ee.getValue()>maxvalue)
			{
				dupkey=ee.getKey();
			}
			System.out.println(" dup key" +dupkey);
			
		}
		
		
	HashSet hs= new HashSet();
	for (int k=0;k<a.length;k++)
	{
		if(hs.contains(a[k]))
		{
			System.out.println("Duplicates are "+a[k]);
		}
		else
		{
			hs.add(a[k]);
		}
	}
	System.out.println();
	}
	
	
	
	
	
	
}
