package webdriverMavenGit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.testng.annotations.Test;

public class SynchronizedArrayList {

	@Test
	public void synchroaraylist()
	{
		List<String> namelist = Collections.synchronizedList(new ArrayList<String>());
		namelist.add("Ram");
		namelist.add("Shyam");
		
		synchronized (namelist)
		{
			Iterator it = namelist.iterator();
			while(it.hasNext())
			{
				
				System.out.println(it.next());
			}
			
			
			
			
		}
		
		
		
		
		
		
	}
	
	
	
	
	
	
}
