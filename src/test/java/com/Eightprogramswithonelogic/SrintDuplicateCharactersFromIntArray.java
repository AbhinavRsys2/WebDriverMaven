package com.Eightprogramswithonelogic;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

import org.testng.annotations.Test;

public class SrintDuplicateCharactersFromIntArray {
	@Test
	public void test5()
	{

	int[] a = new int[]{1,2,3,3,4,5,5,8,8,8,9,9,7,6,6};
	
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
	
	Set<Entry<Integer, Integer>> set1 = hm.entrySet();
	int maxvalue =1;
	for(Entry<Integer, Integer> ee:set1)
	{
		if(ee.getValue()>maxvalue)
		{
			System.out.print("  "+ee.getKey());
		}
	}
	
	
	
	
	
	
	
	
	
	}
	
	
}
