package com.stream.two;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TestTwo {

	public static void main(String[] args) {
		
		ArrayList<Integer> list1 = new ArrayList(Arrays.asList(10,20,30,40));
		ArrayList<Integer> list2 = new ArrayList(Arrays.asList(5,5,5,5));
		
		//Way#1
		System.out.println(zipLists(list1, list2));
		
		//Way#2==> Bcz all elements in list2 are same.
		List<Integer> resultList = list1.stream().map(i -> i -5).collect(Collectors.toList());
		System.out.println("With only map() :"+resultList);
		
	}
	
	private static List<Integer>  zipLists(List<Integer> list1, List<Integer> list2) {
	    return IntStream.range(0, list1.size())
	                    .mapToObj(idx -> list1.get(idx) - list2.get(idx))
	                    .collect(Collectors.toList());
	}
}

//Sample 2 : list1= {10,20,30,40}, list2= {5,5,5,5}, output = {5,15,25,35}