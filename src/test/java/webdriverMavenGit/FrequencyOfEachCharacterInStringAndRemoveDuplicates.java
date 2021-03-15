package webdriverMavenGit;

import java.util.LinkedHashMap;
import java.util.Set;

import org.testng.annotations.Test;

public class FrequencyOfEachCharacterInStringAndRemoveDuplicates {

	@Test
	public void test() {
		
		String s1 = "Programmingg";
		char[] ch = s1.toCharArray();
		int len   = s1.length();
		System.out.println(len);
		
		LinkedHashMap<Character, Integer> lhm = new LinkedHashMap<Character, Integer>();
		
		for(Character cc :ch)
		{
			if(lhm.containsKey(cc))
			{
			   lhm.put(cc,lhm.get(cc)+1 )	;
			}
			else
			{
			lhm.put(cc, 1);
			}
			
			System.out.println(lhm.get(cc));
			
		}
		
		System.out.println(lhm);
		
		Set<Character> keys = lhm.keySet();
		System.out.println(keys);
		
		

	}

}
