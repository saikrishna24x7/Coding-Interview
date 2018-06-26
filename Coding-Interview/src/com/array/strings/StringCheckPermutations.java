package com.array.strings;

import java.util.HashSet;
import java.util.Set;

public class StringCheckPermutations
{
	public static Set<String> permutations = new HashSet<>();

	public static void main(String[] args)
	{
		String s1 = "abc";
		String s2 = "cbaa";
		stringPermutations(s1);
		if(permutations.contains(s2)) 
		{
			System.out.println(true);
		}
		else 
		{
			System.out.println(false);
		}
	}
	
	public static void stringPermutations(String input) 
	{
		stringPermutations("", input);
	}
	
	public static void stringPermutations(String prefix, String temp) 
	{
		int len = temp.length();
		if(len == 0)
		{
			permutations.add(prefix);
		}
		else
		{
			for(int i=0;i<len;i++)
			{
				stringPermutations(prefix+temp.charAt(i), temp.substring(0, i)+temp.substring(i+1, len));
			}
		}
	}
}
