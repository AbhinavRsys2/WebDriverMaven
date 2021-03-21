package com.Eightprogramswithonelogic;

import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FrequencyOfEachIntegerElementInArray 
{
	@Test
	public void freqyofeachint()
	{

	int [] a= new int[]{3,3,4,5,1,1,1,2,9,8};
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
	
	Assert.fail();
	}

}