package com.strings;

import org.testng.annotations.Test;

public class SimplyReverseAString {
	
	
@Test
public void reversethestring()
{
	
String s1 = "Abhinav is";
String rev  = "";
for(int i =s1.length()-1;i>=0;i--)
{
	rev = rev+s1.charAt(i);
}
System.out.println(rev);




}
}
