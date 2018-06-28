package com.array.strings;

/**
 * 
 * @author Sai Krishna Kuna
 *
 */
public class StringCompression
{
	public static String compressString(String input)
	{
		String output = "";
		int index = 0, count = 1;
		while(index < input.length())
		{
			char c = input.charAt(index);
			while (index + 1 < input.length() && c == input.charAt(index + 1))
			{
				index++;
				count++;
			}
			output = output + input.charAt(index)+count;
			count = 1;
			index++;
		}
		if(output.length() >= input.length())
		{
			return input;
		}
		else
		{
			return output;
		}
	}
	
	public static void main(String[] args)
	{
		System.out.println(compressString("aaaabbbcvvvddd"));
	}
}