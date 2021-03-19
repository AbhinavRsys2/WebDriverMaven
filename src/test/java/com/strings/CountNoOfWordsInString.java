package com.strings;

import org.testng.annotations.Test;

@Test
public class CountNoOfWordsInString 
{
public void count()
{
	String s1 = "Abhinav Is Great";
     int len = s1.length();System.out.println(len);	
	int bsp=1;
	for(int i =0;i<len;i++)
	{
		if((s1.charAt(i)==' ')&&(s1.charAt(i+1)!=' '))
		{
			bsp++;
		}
	}
	System.out.println(bsp+" are the number of words in the string ");
	
}
}