package webdriverMavenGit;

import java.util.ArrayList;

import org.testng.annotations.Test;

public class WhichAreCharWhichAreInteger {

	@Test
	public void charandintfinding()
	{
	ArrayList<Object> l1 = new ArrayList<Object>();
	l1.add(1);
	l1.add(2);
	l1.add("a");
	l1.add("b");
	System.out.println(l1);
	
	for(Object o1:l1)
	{
		
		if(o1.getClass().getName().contains("String"))
		{
			System.out.println("is a string "+o1);
		}
		else if(o1.getClass().getName().contains("Integer"))
		{
			System.out.println("is a numberic "+o1);
		}
		
		
	}
	
	
	}
	
}
