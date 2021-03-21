package com.arrays;

import org.testng.annotations.Test;

public class RemoveDuplicatesFromSortedArray {
@Test
	public void removeduplicates()
	{
		int[] a ={1,1,2,3,4,4,5,5,6,7,8,};
		int len = a.length;System.out.println(len);
		int[] temp= new int[len];
		int j=0;
		
		for(int i=0;i<len-1;i++)
		{
			if(a[i]!=a[i+1])
			{
				temp[j]=a[i];
				j++;
				
			}
			
		}
		
		temp[j]=a[len-1];
		
		for(int k=0;k<temp.length;k++)
		{
			System.out.print(" "+temp[k]);
		}
     
	
	
	
	
}
}