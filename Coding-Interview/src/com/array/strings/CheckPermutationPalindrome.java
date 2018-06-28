package com.array.strings;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CheckPermutationPalindrome
{
	public static boolean isPermutationOfPalindrome(String phrase) {
		boolean isPermutation = true;
		List<Character> l = phrase.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
		Set<Character> s = new HashSet<>();
		s.addAll(l);
		int temp = 0;
		boolean stringLength = phrase.length() % 2 != 0 ? false : true;
		for(Character c:s)
		{
			int frequency = Collections.frequency(l, c);
			if(frequency % 2 !=0)
			{
				if(!stringLength && temp > 1)
				{
					isPermutation = false;
					break;
				}
				else
				{
					temp++;
				}
			}
			else
			{
				continue;
			}
		}
		return isPermutation;
	}

	public static void main(String[] args)
	{
		System.out.println(isPermutationOfPalindrome("tactcoa"));
	}
}
