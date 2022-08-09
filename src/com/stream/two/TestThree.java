package com.stream.two;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TestThree {
	
//	Sample 3: list1 = {1,2,3,4}, list2= {a,b,c,d} , output = {1+a,2+b,3+c,4+d}
	
	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList(Arrays.asList(1, 2, 3, 4));
		ArrayList<String> list2 = new ArrayList(Arrays.asList("a", "b", "c", "d"));
		System.out.println(zipLists(list1, list2));
	}
	
	private static List<String>  zipLists(List<Integer> list1, List<String> list2) {
	    return IntStream.range(0, list1.size())
	                    .mapToObj(idx -> list1.get(idx) +"+"+ list2.get(idx))
	                    .collect(Collectors.toList());
	}
}

