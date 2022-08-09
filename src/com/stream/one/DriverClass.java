package com.stream.one;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DriverClass {

	public static void main(String[] args) {
		
		Transactions tx1 = new Transactions(1, 10000, "India", "Rupees");
		Transactions tx2 = new Transactions(2, 200000, "US", "Dollar");
		Transactions tx3 = new Transactions(3, 100000, "European", "Euros");
		Transactions tx4 = new Transactions(4, 6000, "Canadians", "Dollar");
		Transactions tx5 = new Transactions(5, 300000, "South Africa", "Rand");
		Transactions tx6 = new Transactions(6, 1000, "Pakisthan", "Rupees");
		
		List<Transactions> list = new ArrayList<>();
		list.add(tx1);
		list.add(tx2);
		list.add(tx3);
		list.add(tx4);
		list.add(tx5);
		list.add(tx6);

		System.out.println(list);
		
//		To get a list of the IDs for all the expensive transactions (expensive means > 100000)
		List<Integer> idsGreaterLak = list.stream()
		.filter(tx -> tx.getTransactionPrice()>100000)
		.map(tx -> tx.getTransactionId()).collect(Collectors.toList());
		
		System.out.println(idsGreaterLak);
		
		
//		calculate the total value of all transactions & COUNT total number of txs
		
//		Stream<Transactions> stream1 = list.stream();
//		Stream<Integer> mapStream = stream1.map(tx -> tx.getTransactionPrice());
//		Integer sum = mapStream.collect(Collectors.summingInt(Integer::intValue));
//		System.out.println("All Transactions total price :"+sum);
		
		Integer totalValueOfTxs = list.stream().map(tx -> tx.getTransactionPrice())
						.collect(Collectors.summingInt(Integer::intValue));
		System.out.println("All Transactions total price :"+totalValueOfTxs);
		
//		COUNT total number of txs
		long totalNoTxs = list.stream().count();
		System.out.println("Total number of txs are : "+ totalNoTxs);

		
//		Find the highest value transaction
		Integer highestValueTx = list.stream().map(tx -> tx.getTransactionPrice()).max(Integer::compare).get();
		System.out.println("highest value transaction is :"+ highestValueTx);

		
		
//		To group a list of transactions by currency
		Map<String, List<Transactions>> groupingByCurrency = list.stream()
				.collect(Collectors.groupingBy(Transactions::getCurrency));
		System.out.println(groupingByCurrency);
		
		
//		To group a list of transactions by Currency and City groupingByCurrencyAndCity
//		list.stream().collect(groupingBy(Transactions::getCity, groupingBy(Transactions::getCurrency)));
		
		
//		list.stream().collect(groupingBy(Transactions::getCurrency)).averagingInt((Transactions::getTransactionPrice));
		
		 
	}
}




















