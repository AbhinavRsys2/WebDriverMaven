package com.Eightprogramswithonelogic;

import java.util.HashMap;
import java.util.Set;

import org.testng.annotations.Test;

public class RemoveDuplicateCharactersFromIntArray {
     @Test
	public void test3()
	{
		
	    int[] a = new int[]{3,3,2,2,5,5,6,6,7,7,9,1,1,1,1,1};
	    HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
	    
	    for(int i =0;i<a.length;i++)
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
		
		Set set1 = hm.keySet();
		System.out.println(set1);
		
		
		
		
	}
	
}
