package com.array.strings;

import java.util.HashSet;
import java.util.Set;

public class StringPermutation
{
	
	static Set<String> perms = new HashSet<String>();
	public static void main(String[] args)
	{
		perm1("abc");
		perms.forEach(System.out::println);
	}
	
	public  static void perm1(String s) { perm1("", s); }
	
	private static void perm1(String prefix, String s) 
	{
		//System.out.println("Prefix:"+prefix+", S:"+s);
        int n = s.length();
        if (n == 0) 
        {
        	//System.out.println(prefix);
        	perms.add(prefix);
        }
        else 
        {
            for (int i = 0; i < n; i++) 
            {
            	perm1(prefix + s.charAt(i), s.substring(0, i) + s.substring(i+1, n));
            }
        }
    }
}