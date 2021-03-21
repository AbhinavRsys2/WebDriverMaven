package com.arrays;

import org.testng.annotations.Test;

public class MergeTwoArraysInOneArray {
@Test
	public void mergingtwosortedarrays()
	{
	int[] a = new int[]{1,2,3};int alen = a.length;
	int[] b = new int[]{4,5,6};int blen = b.length;
	
	int[] c = new int[alen+blen];
	int clen=c.length;
	
	for(int i =0;i<alen;i++)
	{
		c[i]=a[i];
	}
	for(int j=0;j<blen;j++)
	{
		c[alen+j]=b[j];
	}
	for(int k =0 ; k<clen;k++)
	{
		System.out.print(" "+c[k]);
	}
	
	System.out.println();
	
	
	
	}
	
}
