package com.strings;

import org.testng.annotations.Test;

public class JavaIsBestTsebsiavajreverselikethis {

	@Test
	public void reverseallwordsalso()
	{
		
		String s1 = "Java Is Best";
		String[] a= s1.split("\\s");
		int len = a.length;System.out.println(len);
		
		for (int i =len -1;i>=0;i--)
		{
			String words=a[i];
			String rev= "";
			
			for (int j=words.length()-1;j>=0;j--)
			{
				rev = rev+words.charAt(j);
			}
			System.out.print(" "+rev);
			
			
		}
		System.out.println();
		
		
		
		
	}
	
	
}
