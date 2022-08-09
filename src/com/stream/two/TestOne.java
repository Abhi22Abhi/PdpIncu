package com.stream.two;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TestOne {

//	Sample 1: list1 = {a,b,c,d}, list2 = {1,2,3,4}, output= {a1,b2,c3,d4}
	
	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList(Arrays.asList(1, 2, 3, 4));
		ArrayList<String> list2 = new ArrayList(Arrays.asList("a", "b", "c", "d"));
		System.out.println(zipLists(list1, list2));
	}
	
	private static List<String>  zipLists(List<Integer> list1, List<String> list2) {
	    return IntStream.range(0, list1.size())
	                    .mapToObj(idx -> list2.get(idx) + list1.get(idx))
	                    .collect(Collectors.toList());
	}
}
