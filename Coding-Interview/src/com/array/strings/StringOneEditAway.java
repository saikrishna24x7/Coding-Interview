package com.array.strings;

import java.util.List;
import java.util.stream.Collectors;

public class StringOneEditAway
{
	/**
	 * Java 8 Method to check isOneEditAway
	 * @param first
	 * @param second
	 * @return isOneEditAway(true or false)
	 */
	public static boolean isOneEditAwayJava8(String first, String second)
	{
		boolean isOneEditAway = true;
		if (Math.abs(first.length() - second.length()) > 1)
		{
			return false;
		}
		if(first.equalsIgnoreCase(second))
		{
			return true;
		}
		List<Character> firstCharacters = first.chars().mapToObj(c -> (char)c).collect(Collectors.toList());
		List<Character> secondCharacters = second.chars().mapToObj(c -> (char)c).collect(Collectors.toList());
		int difference = firstCharacters.stream().filter(c -> !secondCharacters.contains(c)).collect(Collectors.toList()).size();
		if (difference > 1)
		{
			isOneEditAway = false;
		}
		return isOneEditAway;
	}
	
	/**
	 * Java 7 Method to check isOneEditAway
	 * @param first
	 * @param second
	 * @return isOneEditAway(true or false)
	 */
	public static boolean isOneEditAway(String first, String second)
	{
		boolean isOneEditAway = true;
		if (Math.abs(first.length() - second.length()) > 1)
		{
			return false;
		}
		if(first.equalsIgnoreCase(second))
		{
			return true;
		}
		return isOneEditAway;
	}
	
	public static boolean oneReplaceAway(String first, String second)
	{
		boolean isOneReplaceAway = true;
		
		return isOneReplaceAway;
	}
	
	public static void main(String[] args)
	{
		System.out.println(isOneEditAwayJava8("pale", "bake"));
	}
}
