package webdriverMavenGit;

import org.testng.annotations.Test;

public class FindingMissingNumbers {

	
	@Test
	public void missing_numbers()
	{
		
		int totalnumber = 7;
		int expectedSum = totalnumber*((totalnumber+1 )/2);
		System.out.println(expectedSum);

		int[] a1 = new int[]{1,2,3,5,6,7};
		
		int len = a1.length;
		int actualSum =0;
		
		for(int i =0;i<len;i++)
		{
			actualSum = actualSum+a1[i];
			
		}
		System.out.println(actualSum);
		
		int MissingNum = expectedSum -actualSum;
		System.out.println("The missing number is "+MissingNum);
		
		
		
	}
	
	
	
	
}
