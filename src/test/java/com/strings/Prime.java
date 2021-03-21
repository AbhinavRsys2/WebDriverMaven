package com.strings;

import org.testng.annotations.Test;

public class Prime {
@Test
	public void primef()
	{
	  for (int i =1;i<20;i++)
	  {
		  int c =0;
		  for(int j=2;j<i;j++)
		  {
			if(i%j==0)
			{
				c=c+1;
			}
			
		  }
		  if(c==0)
			  {System.out.println(i);}
	  }
	 
	
	
  	
	
	
	
	}
}
