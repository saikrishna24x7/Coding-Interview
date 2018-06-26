package com.samples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromList
{

	public static void main(String[] args)
	{
		List<String> list = new ArrayList<>();
		list.add("abc");
		list.add("def");
		list.add("ghi");
		list.add("abc");
		list.add("def");
		list.add("abc");
		list.add("abc");
		list.stream().distinct().collect(Collectors.toList()).forEach(System.out::println);
	}

}
