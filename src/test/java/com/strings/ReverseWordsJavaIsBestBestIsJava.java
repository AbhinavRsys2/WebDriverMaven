package com.strings;

import org.testng.annotations.Test;

public class ReverseWordsJavaIsBestBestIsJava {
     @Test
	public void reversewordsinsentence()
	{
		
		String s1 = "Java Is Best";
		String[] a= s1.split("\\s");
		System.out.println(a);
		int len = a.length;System.out.println(len);
		
		for(int i =len-1;i>=0;i--)
		{
			System.out.print(" "+a[i]);
		}
		System.out.println();
		
		
		
		
		
	}
	
}
