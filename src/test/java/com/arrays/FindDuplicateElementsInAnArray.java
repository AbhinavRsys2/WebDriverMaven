package com.arrays;

import java.util.HashSet;

import org.testng.annotations.Test;

public class FindDuplicateElementsInAnArray {

	@Test
	public void findduplicate(){
	int[] a = {1,5,4,2,1,4,7,1,1};
	int len = a.length;System.out.println(len);
	
	HashSet hs = new HashSet();
	for(int i =0;i<len;i++)
	{
		if(hs.contains(a[i]))
		{
			System.out.println(" Duplicates are "+a[i]);
		}
		else{
		hs.add(a[i]);
		}
	}
	
	System.out.println(hs);
	
	
	
}
}