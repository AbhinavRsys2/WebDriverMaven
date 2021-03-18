package com.strings;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map.Entry;
import java.util.Set;

import org.testng.annotations.Test;

public class MaxOccuringCharacterInaString {
        
	 @Test
      public void maxoccringCharInString()
      { 
		 String s1 = "PPr";
		 char[] ch = s1.toCharArray();
		 int len =ch.length;
		 System.out.println(len);
		 
		 LinkedHashMap<Character,Integer> lhm = new LinkedHashMap<Character,Integer>();
		 
		 for(Character cc:ch)
		 {
			 if(lhm.containsKey(cc))
			 {
				 lhm.put(cc, lhm.get(cc)+1);
			 }
			 else
			 {
				 lhm.put(cc, 1);
			 }
			 
		 }
	
         System.out.println(lhm);
         
         Set<Entry<Character, Integer>> hm=  lhm.entrySet();
         
         int maxvalue = 0;
         char maxkey = ' ';
         for(Entry<Character, Integer> data:hm)
         {
        	 if(data.getValue()>maxvalue)
        	 {
        		 maxvalue = data.getValue();
        		 maxkey   = data.getKey(); 
        		 
        		 
        	 }
         }
         System.out.println(" The key "+maxkey+" has the max value "+maxvalue);
        
     

        

         
         
         
         
         
      
      }

}
