package com.arrays;

import org.testng.annotations.Test;

public class ReverseAnArray {
@Test
	public void reverseArray()
	{
	int[] a = new int[]{1,2,3,4,5,6};
	int alen = a.length;
	
	for(int i =0;i<alen;i++)
	{
		System.out.print("  "+a[i]);
	}
	

	int temp;
	int start = 0;
	int end = alen-1;
	
	while(start<end)
	{
		temp=a[start];
		a[start]=a[end];
		a[end] = temp;
		
		start++;
		end--;
	}
	System.out.println();
	
	for(int i =0;i<alen;i++)
	{
		System.out.print("  "+a[i]);
	}
	System.out.println();
	
	
	
	
	
	
	
	
	
		
		
	
		
		
		
		
		
		
		
		
		
		
	}
}
